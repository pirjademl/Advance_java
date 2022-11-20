import java.io.IOException;
import java.net.*;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.io.*;
public class PrineServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3333);
        Socket s= ss.accept();
        DataInputStream input = new DataInputStream(s.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int EnteredNo=Integer.parseInt(input.readUTF());
        // int EnteredNo =Integer.parseInt(EnteredNo);
        UIManager ui = new UIManager();
        try {
            UIManager.setLookAndFeel("Windows");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int i,m=0,flag=0;
        m=EnteredNo/2;
        if(EnteredNo==0 ||EnteredNo==1){
            outputStream.writeUTF(EnteredNo+"is not a prime number ");
        }else{
            for ( i = 2; i < m; i++) {
                if(EnteredNo%i==0){
                    outputStream.writeUTF(EnteredNo+"is not a prime number ");
                    flag=1;
                    break;
                }
                
            }
            if(flag==0){
                outputStream.writeUTF(EnteredNo+" is a prime number ");
            }
        }
outputStream.close();
input.close();
s.close();
ss.close();
br.close();


        
    }
    
}
