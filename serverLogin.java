import java.net.*;
import java.io.*;
import java.util.*;

public class serverLogin {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3333);
        System.out.println("server waiting ");
        Socket s = ss.accept();
        DataInputStream input = new DataInputStream(s.getInputStream());
        DataOutputStream output = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String info = input.readUTF();

        String arr[] = info.split(",");
        String Uname = arr[0];
        String pass = arr[1];

        if (Uname.equals("Pirjade@123") && pass.equals("iammag")) {
            output.writeUTF("Login succesfully");
        } else {
            output.writeUTF("Invalid Credentials");
        }
        ss.close();
        s.close();
        input.close();
        output.close();

    }

}
 