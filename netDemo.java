import java.net.MalformedURLException;
import java.net.URL;

public class netDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp= new URL("http://www.javatpoint.com/javafx-tutorial");
        System.out.println("Protocol: "+hp.getProtocol());
        System.out.println("Port "+hp.getPort());
        
    }
}
