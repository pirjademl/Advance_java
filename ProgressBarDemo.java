import javax.swing.*;
import java.awt.*;
public class ProgressBarDemo extends JFrame{
    public static void main(String[] args) {
        ProgressBarDemo pg = new ProgressBarDemo();
            Container c=pg.getContentPane();
        c.setLayout(new FlowLayout());
        JProgressBar jp = new JProgressBar();
        c.add(jp);
        
        pg.setVisible(true);
        pg.setSize(400,400);

        
    }
    
}
