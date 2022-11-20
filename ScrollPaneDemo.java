import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class ScrollPaneDemo extends JFrame {

    JScrollPane scrl;
    JLabel l1;

    ScrollPaneDemo() {
        Container c = getContentPane();
        // JPanel pn = new JPanel();
        JTextArea jt = new JTextArea();
        // pn.add(jt);
        l1 = new JLabel("Hello this is regarding your Refund amount ");
        l1.setVisible(true);
        jt.add(l1);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jscrl = new JScrollPane(jt, v, h);
        c.add(jscrl);

    }

    public static void main(String[] args) {
        ScrollPaneDemo sdn = new ScrollPaneDemo();
        sdn.setVisible(true);
        sdn.setSize(400, 400);
        sdn.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
