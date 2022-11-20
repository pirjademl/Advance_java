
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorUsingMouse extends Frame implements MouseListener     {
    ColorUsingMouse(){


        // Container c= getContentPane();
setLayout(null);
Label lbl=new Label("click here to change the color");
add(lbl);
addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        setBackground(Color.yellow);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        setBackground(Color.black);
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        setBackground(Color.DARK_GRAY);
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        setBackground(Color.gray);
        
    }
    public static void main(String[] args) {
        ColorUsingMouse cl = new ColorUsingMouse();
        cl.setVisible(true);
        cl.setSize(400,400);
        // cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
