import java.awt.*;
import javax.swing.*;

public class ToggleButtonDemo extends JFrame {
    public static void main(String[] args) {

        ToggleButtonDemo td = new ToggleButtonDemo();
        Container c = td.getContentPane();
        c.setLayout(new FlowLayout());
        JToggleButton tb = new JToggleButton("on/off");

        c.add(tb);
        td.setVisible(true);
        td.setSize(400, 400);

    }

}
