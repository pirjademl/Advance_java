import java.net.*;

public class InetAdressDemo {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress addr1 = InetAddress.getByName("amu.ac.in");
        InetAddress addr2 = InetAddress.getByName("msbte.org.in");
        System.out.println("\nIs" + addr1 + " Equals" + addr2 + "?:" + addr1.equals(addr2));
        System.out.println("\nHost address of " + addr1 + " is " + addr1.getHostAddress());
        System.out.println("\nhost name of " + addr1 + "is " + addr1.getHostName());
        System.out.println("\nIs " + addr2 + " A Multicast Address ?:" + addr2.isMulticastAddress());
        System.out.println("\nConversion of " + addr1 + "To string is " + addr1.toString());

    }

}
