import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

public class AritehmeticOperationDemo extends JFrame implements ActionListener {

    JLabel lbl;
    JTextField no1;
    JTextField no2;
    JButton add;
    JButton sub;
    JButton mul;
    JButton div;
    JButton md;

    AritehmeticOperationDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel flabel = new JLabel("Enter No 1 ");

        no1 = new JTextField(12);
        JLabel SLBL = new JLabel("Enter no 2");
        no2 = new JTextField(12);
        lbl = new JLabel();
        add = new JButton("Addition");
        sub = new JButton("substraction  ");
        mul = new JButton("Multiplication ");
        div = new JButton("Division ");
        md = new JButton("Modules ");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        md.addActionListener(this);
        add(flabel);
        add(no1);
        add(SLBL);
        add(no2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(md);

        add(lbl);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            int a = Integer.parseInt(no1.getText());
            int b = Integer.parseInt(no1.getText());
            int c = (a + b);
            lbl.setText("Addition of and  b is   " + c);

        }
        if (e.getSource() == sub) {
            int a = Integer.parseInt(no1.getText());
            int b = Integer.parseInt(no1.getText());
            int c = (a - b);
            lbl.setText("Substraction of and  b is   " + c);
        }
        if (e.getSource() == mul) {
            int a = Integer.parseInt(no1.getText());
            int b = Integer.parseInt(no1.getText());
            int c = (a * b);
            lbl.setText("Multiplication of and  b is   " + c);

        }
        if (e.getSource() == div) {
            int a = Integer.parseInt(no1.getText());
            int b = Integer.parseInt(no1.getText());
            int c = (a / b);
            lbl.setText("Division  of and  b is   " + c);

        }
        if (e.getSource() == md) {
            int a = Integer.parseInt(no1.getText());
            int b = Integer.parseInt(no1.getText());
            int c = (a % b);
            lbl.setText("Reminder   of and  b is   " + c);

        }
    }

    public static void main(String[] args) {
        AritehmeticOperationDemo sr = new AritehmeticOperationDemo();
        sr.setVisible(true);
        sr.setSize(400, 400);
        sr.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
