import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;
import java.awt.*;

public class ClickCountDemo extends JFrame implements MouseListener{
    JLabel lbl;
    ClickCountDemo(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        lbl= new JLabel("Hello Mouse or click here ");
        c.addMouseListener(this);
        c.add(lbl);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        lbl.setText("Mouse Clicked (# of cliks ."+e.getClickCount());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        lbl.setText("Mouse Relaeased (//# of clicks ."+e.getClickCount());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        ClickCountDemo cd= new ClickCountDemo();
        cd.setSize(400,400);
        cd.setVisible(true);
        cd.setTitle("Getting Cclick counts  of mouse  ");
    }
    
}
