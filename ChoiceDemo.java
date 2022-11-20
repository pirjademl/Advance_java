import java.awt.*;
import java.awt.event.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ChoiceDemo extends Frame implements WindowListener{

   ChoiceDemo() {
      setLayout(new FlowLayout());
      Choice c = new Choice();
      c.add("Lakhnau");
      c.add("Surat");
      c.add("Agra");
      addWindowListener(this);
      add(c);

   }
  public  void paint(Graphics g ){
g.drawOval(14, 67, 70,70);
   }

   public static void main(String[] args) {
      ChoiceDemo c1 = new ChoiceDemo();
      c1.setBackground(Color.blue);
      c1.setBounds(40, 43, 45, 67);
      // add(new String("hello "));
      c1.setVisible(true);
      c1.setSize(400, 400);

   }

   @Override
   public void windowOpened(WindowEvent e) {
      // TODO Auto-generated method stub
Icon ic = new ImageIcon("ktm.jpg");
      JOptionPane.showConfirmDialog(null, "Window Opened ");
      // JOptionPane.showInputDialog(null, "Enter a number ", "Addition", ERROR,ic , 12, 5);
   }

   @Override
   public void windowClosing(WindowEvent e) {
      JOptionPane.showConfirmDialog(null, "Do u wanna close the winndow ");
      System.exit(0);
      
   }

   @Override
   public void windowClosed(WindowEvent e) {
      JOptionPane.showConfirmDialog(null, "Do u wanna close the winndow ");
      
   }

   @Override
   public void windowIconified(WindowEvent e) {
      // TODO Auto-generated method stub
      JOptionPane.showConfirmDialog(null, "Window Minimized ");
   }

   @Override
   public void windowDeiconified(WindowEvent e) {
      // TODO Auto-generated method stub
      JOptionPane.showConfirmDialog(null, "Window  is on focus now  ");
      
   }

   @Override
   public void windowActivated(WindowEvent e) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void windowDeactivated(WindowEvent e) {
      JLabel lbl = new JLabel();
      
      
   }

}
