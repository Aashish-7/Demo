import java.io.IOException;
import java.net.*;

public class URLProperties {
    public static void main(String[] args) throws IOException, URISyntaxException {
        URL url = new URL("http", "localhost", 8080, "/home/Downloads/Hello.java");
        System.out.println(url);
        URL url1 = new URL("https://www.youtube.com");
        System.out.println(url1);
        System.out.println("&&&&&&&&&&&&&&&&");
        URL url2 = new URL(new URL("https://www.digitalocean.com:443"), "community/tutorials/constructor-in-java");
        System.out.println("URL :" +url2);
        System.out.println("Protocol :" +url2.getProtocol());
        System.out.println("Authority :" +url2.getAuthority());
        System.out.println("Host :" +url2.getHost());
        System.out.println("Port :" + url2.getPort());
        System.out.println("Default Port :" + url2.getDefaultPort());
        System.out.println("Path :" +url2.getPath());
        System.out.println("Query :" +url2.getQuery());
        System.out.println("File :" +url2.getFile());
        System.out.println("Ref :" +url2.getRef());
        System.out.println("URI :" +url2.toURI());
        System.out.println("User Info :" +url2.getUserInfo());
        System.out.println("Hash Code :" +url2.hashCode());
        System.out.println(url2.openConnection());
        System.out.println("More....................");

        System.out.println("&&&&&&&&&&&&&&&&");
        InetAddress address = Inet4Address.getByName("www.keep.google.com");
        System.out.println(address.getHostAddress());

        URL url3 = new URL("https://www.youtube.com");
        System.out.println(url3.toURI());
        System.out.println(URI.create("https://www.youtube.com"));
    }
}
