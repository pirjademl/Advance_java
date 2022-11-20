import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TabPaneDemo extends JFrame {
    // private static final Component FYPanel = null;

    public static void main(String[] args) {
        TabPaneDemo td = new TabPaneDemo();
        TabPaneDemo tdp = new TabPaneDemo();

        Container c = td.getContentPane();
        c.setLayout(new FlowLayout());
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("First Year ", new FYPanel());
        jtp.addTab("Second Year  ", new SYPanel());
        jtp.addTab("THird Year ", new TYPanel());
        c.add(jtp);
        tdp.add(jtp);
        tdp.setVisible(true);
        tdp.setSize(1000, 1000);

    }
}

class FYPanel extends JPanel {
    public FYPanel() {
        JLabel j = new JLabel("Chemistry");
        JLabel j1 = new JLabel("Physics");
        JLabel j2 = new JLabel("maths");
        add(j);
        add(j1);
        add(j2);

    }
}

class SYPanel extends JPanel {
    public SYPanel() {
        JButton j = new JButton("OOP");
        JButton j1 = new JButton("CGR");
        JButton j2 = new JButton("DSA");
        add(j);
        j.addActionListener((ActionPerformed ){

        }
        add(j1);
        add(j2);

    }
}

class TYPanel extends JPanel {
    public TYPanel() {
        JButton j = new JButton("PHP");
        JButton j1 = new JButton("Python");
        JButton j2 = new JButton("Android");
        add(j);
        add(j1);
        add(j2);
        
    }
}
