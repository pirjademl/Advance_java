
// import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;

public class ActionEventDemo extends Frame implements ActionListener {

    Button GREEN, YELLOW, RED, PINK;

    ActionEventDemo() {

        GREEN = new Button("GREEN");
        YELLOW = new Button("YELLOW");
        PINK = new Button("PINK");
        RED = new Button("RED");

        GREEN.addActionListener(this);
        YELLOW.addActionListener(this);
        PINK.addActionListener(this);
        RED.addActionListener(this);
        add(GREEN);
        add(YELLOW);
        add(PINK);
        add(RED);
        setLayout(new FlowLayout());
        setTitle("FIll color on the click of the button");
        setBackground(Color.magenta);
    }

    public static void main(String[] args) {
        ActionEventDemo demo = new ActionEventDemo();
        demo.setVisible(true);
        demo.setSize(400, 400);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "GREEN")
            setBackground(Color.green);
        if (e.getActionCommand() == "YELLOW")
            setBackground(Color.yellow);
        if (e.getActionCommand() == "RED")
            setBackground(Color.red);
        if (e.getActionCommand() == "PINK")
            setBackground(Color.pink);

    }
    public void paint(Graphics g ){
        g.drawString("This is the example of the color ",120,200);
    }
}
