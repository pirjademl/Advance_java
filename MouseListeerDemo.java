import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;
import java.awt.*;

public class MouseListeerDemo extends JFrame implements MouseListener {
    JLabel lbl = new JLabel();

    MouseListeerDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        add(lbl);
        c.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        lbl.setText("Status of the Mouse : Mouse Clicked ");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        lbl.setText("Status of the Mouse :Mouse preseed ");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        lbl.setText("Status of the mouse :Mouse Relaeased ");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        lbl.setText("Status of the mouse :Mouse Entered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        lbl.setText("Status of the mouse :Mouse Exited ");

    }

    public static void main(String[] args) {
        MouseListeerDemo md = new MouseListeerDemo();
        md.setVisible(true);
        md.setSize(400, 400);
        md.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
