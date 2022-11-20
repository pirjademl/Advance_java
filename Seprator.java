import java.awt.*;
import java.util.jar.JarEntry;

import javax.swing.*;
public class Seprator extends JFrame {

    public static void main(String[] args) {
        Seprator sp = new Seprator();
        Container c= sp.getContentPane();
        c.setLayout(new GridLayout(0,1));
        JLabel lbl = new JLabel("AJP",JLabel.CENTER);
        c.add(lbl);
        JSeparator js = new JSeparator();
        c.add(js);
        JLabel lbl2 = new JLabel("CSR",JLabel.CENTER);
        c.add(lbl2);
        sp.setSize(400,400);
        sp.setVisible(true);
        sp.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

/*
 * 
 * 
 * import java.awt.*;
import javax.swing.*;
public class JSepDemo extends JFrame 
{   public static void main(String args[])
{    JSepDemo jf=new JSepDemo();
Container c=jf.getContentPane();
c.setLayout(new GridLayout(0,1));
JLabel jl=new JLabel("AJP",JLabel.CENTER);    c.add(jl);
JSeparator js=new JSeparator();
c.add(js);
JLabel jb=new JLabel("CSR",JLabel.CENTER);     c.add(jb);
jf.setSize(300,100);
jf.setVisible(true);
}    }

 */