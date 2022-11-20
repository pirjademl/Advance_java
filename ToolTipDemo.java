import javax.swing.*;
import java.awt.*;
public class ToolTipDemo extends JFrame {
    public static void main(String args[]) {
        ToolTipDemo jf = new ToolTipDemo();
        Container c = jf.getContentPane();
        c.setLayout(new FlowLayout());
        JButton jb = new JButton("Welcome To AJP");
   
        jb.setToolTipText("ToolTip Notification Program");
        c.add(jb, "Center");
        jf.setSize(300, 200);
        jf.setVisible(true);
    }
}
