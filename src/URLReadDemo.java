import java.io.IOException;
import java.net.URL;

public class URLReadDemo {
    public static void main(String[] args) throws IOException {

        int c;
        URL url = new URL("http://www.google.com");
        System.out.println(url);
        java.io.InputStream inputStream = url.openStream();
        while ((c = inputStream.read()) != -1){
            System.out.print((char) c);
        }
        inputStream.close();
    }
}
