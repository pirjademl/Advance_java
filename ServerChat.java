import java.io.*;
import java.util.*;
import java.net.*;

public class ServerChat {
    public static void main(String[] args) throws IOException, Exception {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream input = new DataInputStream(s.getInputStream());
        DataOutputStream output = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = "", str2 = "";
        while (!str1.equals("stop")) {
            str1 = input.readUTF();
            System.out.println("CLient:" + str1);

            System.out.println("Server:");
            str2 = br.readLine();
            // output.writeUTF(str2);
            // if (str2.equals(str2)) {

            //     System.out.println("ServerChat.main()");
            // }
        }
        input.close();
        output.close();
        ss.close();
        s.close();

    }

}
