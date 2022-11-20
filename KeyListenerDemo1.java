import java. awt.*;
import javax.swing.*;
import java.awt.event.*;
public class KeyListenerDemo1 extends JFrame implements ActionListener{
JLabel lbl;
JTextField fld;
JTextField fld2;
JButton btn ;
KeyListenerDemo1(){
Container c =getContentPane();
c.setLayout(new FlowLayout());
lbl = new JLabel();
fld= new JTextField(12);
fld2= new JTextField(12);
btn= new JButton("Multiply");
btn.addActionListener(this);
add(lbl);
add(fld);
add(fld2);
add(btn);

}
public void actionPerformed(ActionEvent e)
{
	int  a= Integer.parseInt(fld.getText());
	int  b= Integer.parseInt(fld2.getText());
	int c= a*b;
	lbl.setText("Muliplication of twon number is "+String.valueOf(c));
	


}

public static void main(String args[]){

KeyListenerDemo1 k = new KeyListenerDemo1();
k.setVisible(true);
k.setSize(400,400);
}
}