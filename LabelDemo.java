import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LabelDemo extends JFrame {
    public static void main(String[] args) {
        LabelDemo lb= new LabelDemo();
JTextField tf = new JTextField();
String Name =tf.getText();

tf.setBounds(70,70,150,20);
tf.setFont(new Font("Monnospaced", Font.BOLD, EXIT_ON_CLOSE));
JButton b = new JButton("CLick  Me ") ;
b.setBounds(50,100,95,30);// Using Buttons Method 
b.setBackground(Color.magenta);
b.setForeground(Color.LIGHT_GRAY);
JLabel lbl = new JLabel("Enter the name of the user ");
lbl.setBounds(50,50,200,20);
b.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JDialog dlg= new JDialog(lb, "Confirm" );
        JLabel l = new JLabel(Name);

        dlg.add(l);
        dlg.setVisible(true);
        dlg.setLocation(500,600);
        dlg.setSize(200,200);


        
    }
    
});
lb.add(lbl);
lb.add(tf);
lb.add(b);
lb.setLayout(null);
lb.setSize(400,400);
lb.setVisible(true);
lb.setLocation(600, 300);



    }
}