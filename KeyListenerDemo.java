import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

import java.awt.*;

public class KeyListenerDemo extends JFrame implements KeyListener {
    JLabel lbl;

    public KeyListenerDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JTextField fld = new JTextField(12);
        lbl = new JLabel("This is ann example ");
        fld.addKeyListener(this);               
        add(fld);
        add(lbl);

    }

    @Override
    public void keyTyped(KeyEvent e) {

        lbl.setText("Key typed ");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        lbl.setText("Key is pressed ");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        lbl.setText("Key is realeased ");

    }

    public static void main(String[] args) {
        KeyListenerDemo k = new KeyListenerDemo();
        k.setVisible(true);
        k.setSize(400, 400);
        k.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
