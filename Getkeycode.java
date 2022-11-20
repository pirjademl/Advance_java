import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.*;
import java.awt.*;

public class Getkeycode extends JFrame implements KeyListener {
    JTextField fld;
    JLabel lbl;

    Getkeycode() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        fld = new JTextField(12);
        lbl = new JLabel();
        fld.addKeyListener(this);
        add(fld);
        add(lbl);
        setVisible(true);
        setSize(400,400);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        // int key=e.getKeyCode();
        // lbl.setText(e.getKeyText(key));

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int key=e.getKeyCode();
        lbl.setText(e.getKeyText(key));

    }

    @Override   
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    public static void main(String[] args) {
        new Getkeycode();
    }

}
