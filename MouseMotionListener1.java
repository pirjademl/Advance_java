import java.applet.Applet;
import java.awt.event.*;

import javax.swing.JFrame;

import org.w3c.dom.css.RGBColor;

import java.awt.*;

public class MouseMotionListener1 extends JFrame implements MouseMotionListener {

    MouseMotionListener1() {
        addMouseMotionListener(this);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        // System.out.println("Mouse Drageed ");

        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // System.out.println("Mouse Moved ");

    }

    public static void main(String[] args) {
        new MouseMotionListener1();
    }

}
