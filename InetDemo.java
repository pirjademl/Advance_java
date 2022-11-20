import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo {
    
    public static void main(String[] args)  {
        InetAddress adress;
        try {
            adress = InetAddress.getByName("localhost");

        System.out.println("Host  Name"+adress.getHostName());
        System.out.println("Ip address"+adress.getHostAddress());
    } catch (UnknownHostException e) {
        // TODO Auto-generated catch block
        System.out.println(e);
    }
        
    }
}
