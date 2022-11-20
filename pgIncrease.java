import javax.swing.*;
import java.awt.*;

public class pgIncrease extends JFrame {
    JProgressBar jp;
    JLabel lb;
    // JDialog dialog;
    int i = 0;
    int num = 0;

    pgIncrease() {
        Container c = getContentPane();
        setLayout(new FlowLayout());
        jp = new JProgressBar(0, 100);
        // dialog=new JDialog();
        // jp.setIndeterminate(true);
        jp.setValue(0);
        jp.setStringPainted(true);
        lb =new JLabel("ktm.jpg");
        c.add(lb);
        // c.add(dialog);
        c.add(jp);

    }

    public void Increase() {
        while (i <= 100) {
            jp.setValue(i);
            i = i + 5;
            try {
                Thread.sleep(500);
                if (i == 100) {

                    lb.setText("Welcome");
                    lb.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Welcome to gp solapur");
                }
            } catch (InterruptedException e) {
                System.out.println("Select differnt directory ");
            }
        }

    }

    public static void main(String[] args) {
        pgIncrease pg = new pgIncrease();
        pg.setVisible(true);
        pg.setSize(400, 400);
        pg.Increase();
        pg.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
