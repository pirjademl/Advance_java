import java.io.IOException;
import java.net.*;
import java.util.*;
import java.io.*;

public class ClientLogin {
    public static void main(String[] args) throws UnknownHostException, IOException {

        Socket s = new Socket("localhost", 3333);

        DataInputStream input = new DataInputStream(s.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter username  ");
      
        String Uame= br.readLine();
        System.out.println("Enter  password ");
        String pass=br.readLine();
        outputStream.writeUTF(Uame+","+pass);
        // outputStream.writeUTF(string);
        String msg = input.readUTF();
        System.out.println(msg);
        s.close();
        input.close();
        outputStream.close();

    }

}
