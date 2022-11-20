import java.net.*;
import java.io.*;
public class ChatClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("localhost", 3333);
        DataInputStream input = new DataInputStream(s.getInputStream());
        DataOutputStream output = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1="", str2="";
        while (!str1.equalsIgnoreCase("stop")) {
            System.out.println("CLient:");
            str1=br.readLine();
            output.writeUTF(str1);
            str2=input.readUTF();
            System.out.println("Server :"+str2);


            
        }
        input.close();
        output.close();
        s.close();

        
    }

}