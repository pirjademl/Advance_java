import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;
import java.applet.*;

public class JTreeDemo extends JFrame {

    JTreeDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        DefaultMutableTreeNode India = new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode mh = new DefaultMutableTreeNode("Maharashtra");
        India.add(mh);
        DefaultMutableTreeNode mum = new DefaultMutableTreeNode("Mumbai");

        mh.add(mum);
        DefaultMutableTreeNode pun = new DefaultMutableTreeNode("Pune");
        mh.add(pun);
        DefaultMutableTreeNode sol = new DefaultMutableTreeNode("solapur");
        mh.add(sol);
        DefaultMutableTreeNode Ratn = new DefaultMutableTreeNode("Ratnagiri");
        mh.add(Ratn);
        DefaultMutableTreeNode gurjrat = new DefaultMutableTreeNode("Gujrat");
        India.add(gurjrat);

        DefaultMutableTreeNode gd = new DefaultMutableTreeNode("Gandhinagar");
        gurjrat.add(gd);

        DefaultMutableTreeNode st = new DefaultMutableTreeNode("Surat");
        gurjrat.add(st);

        DefaultMutableTreeNode ad = new DefaultMutableTreeNode("Ahmadabad ");
        gurjrat.add(ad);
        JTree tree = new JTree(India);
        c.add(tree);

    }

    public static void main(String[] args) {
        JTreeDemo jtr = new JTreeDemo();
        jtr.setVisible(true);
        jtr.setSize(400, 400);
        jtr.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
