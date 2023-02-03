import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Map;

public class URLConnectionDemo {
    public static void main(String[] args) throws IOException {

        int c;
        URL uRl = new URL("http://www.google.com");
        URLConnection urlConnection = uRl.openConnection();

        System.out.println("Content-type :" +urlConnection.getContentType());
        System.out.println("Content-encoding :" +urlConnection.getContentEncoding());
        System.out.println("Content-length :" +urlConnection.getContentLength());
        System.out.println("Last-modified :" +new Date(urlConnection.getLastModified()));
        System.out.println("Date :" +new Date(urlConnection.getDate()));
        System.out.println("Expiration :" +urlConnection.getExpiration());
        System.out.println("Connection-timeout :" +urlConnection.getConnectTimeout());
        System.out.println(urlConnection.getURL());
        System.out.println(urlConnection.getContent().toString());
        System.out.println(urlConnection.);

//        System.out.println("***************");
//        InputStream inputStream = urlConnection.getInputStream();
//        while (((c = inputStream.read()) != -1)){
//            System.out.print((char) c);
//        }
//        inputStream.close();
    }
}
