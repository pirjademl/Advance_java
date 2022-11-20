import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;;

public class PrimeCLient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("localhost", 3333);
        DataInputStream input = new DataInputStream(s.getInputStream());
        DataOutputStream output = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number to be checked whether it is prime or not ");
        String no = br.readLine();
        output.writeUTF(no);


        String  messgaeString=input.readUTF();
        System.out.println(messgaeString);

        output.close();
        input.close();
        s.close();


    }

}
