import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Icon extends JFrame{
    
    public static void main(String[] args) 
    {
   

        Icon ic = new Icon();
        ic.setSize(400,400);
        ic.setVisible(true);
        
        
        
        ImageIcon img = new ImageIcon("ktm.jpg");
        JLabel lbl= new JLabel("India",img,JLabel.CENTER);
        ic.add(lbl);
        // ImageIcon img = new ImageIcon("ktm.jpg");
        JTextField fld = new JTextField(20);
        ic.add(fld);



    
     

        ic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
