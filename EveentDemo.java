import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

import java.awt.*;

public class EveentDemo extends JFrame implements ActionListener {
    JButton color, clk;
    JTextField lField;

    EveentDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        color = new JButton("click me");
        clk = new JButton("color");
        lField = new JTextField();
        clk.addActionListener(this);
        color.addActionListener(this);
        add(clk);
        add(lField);
        add(color);

    }

    public static void main(String[] args) {
        EveentDemo ed = new EveentDemo();

        ed.setVisible(true);
        ed.setSize(400, 400);
        ed.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "color")
            setBackground(Color.BLACK);
            setVisible(true);

    }

}
