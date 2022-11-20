import java.awt.Container;
import java.awt.LayoutManager;
import javax.swing.*;

import java.awt.*;

public class JTableDemo extends JFrame {

    JTableDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        final String[] col = { "Name", "id",
        };
        final Object data[][] = { { "Aniket", "12" }, { "Vishal", "34" }, { "Neha", "32" }, { "Akshat", "56" },
                { "Aniket", "12" }, { "Vishal", "34" }, { "Neha", "32" }, { "Akshat", "56" }, { "Aniket", "12" },
                { "Vishal", "34" }, { "Neha", "32" }, { "Akshat", "56" }, { "Aniket", "12" }, { "Vishal", "34" },
                { "Neha", "32" }, { "Akshat", "56" }, { "Aniket", "12" }, { "Vishal", "34" }, { "Neha", "32" },
                { "Akshat", "56" }, { "Aniket", "12" }, { "Vishal", "34" }, { "Neha", "32" }, { "Akshat", "56" },
                { "Aniket", "12" }, { "Vishal", "34" }, { "Neha", "32" }, { "Akshat", "56" }, { "Aniket", "12" },
                { "Vishal", "34" }, { "Neha", "32" }, { "Akshat", "56" }, { "Aniket", "12" }, { "Vishal", "34" },
                { "Neha", "32" }, { "Akshat", "56" }, { "Aniket", "12" }, { "Vishal", "34" }, { "Neha", "32" },
                { "Akshat", "56" }, { "Aniket", "12" }, { "Vishal", "34" }, { "Neha", "32" }, { "Akshat", "56" } };

        JTable jt = new JTable(data, col);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane scrl = new JScrollPane(jt, v, h);
        c.add(scrl);

    }

    public static void main(String[] args) {
        JTableDemo demo = new JTableDemo();
        demo.setVisible(true);
        demo.setSize(400, 400);
        demo.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
