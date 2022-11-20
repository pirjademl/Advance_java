import java.awt.Container;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.*;

public class DirectoryDemo extends JFrame {
    DirectoryDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        DefaultMutableTreeNode thispc = new DefaultMutableTreeNode("This PC ");
        DefaultMutableTreeNode C = new DefaultMutableTreeNode("OneDrive Temp ");
        thispc.add(C);
        DefaultMutableTreeNode es = new DefaultMutableTreeNode("eSupport ");
        thispc.add(es);

        DefaultMutableTreeNode od = new DefaultMutableTreeNode("OneDriveTemp");
        thispc.add(od);

        DefaultMutableTreeNode oracle = new DefaultMutableTreeNode("oraclexe ");
        thispc.add(oracle);
        DefaultMutableTreeNode logs = new DefaultMutableTreeNode("Perflogs ");
        thispc.add(logs);
        DefaultMutableTreeNode pg = new DefaultMutableTreeNode("Program Files ");
        thispc.add(pg);

        DefaultMutableTreeNode pg86 = new DefaultMutableTreeNode("program File(86) ");
        thispc.add(pg86);
        DefaultMutableTreeNode Pd = new DefaultMutableTreeNode("Program Data");
        thispc.add(Pd);

        DefaultMutableTreeNode recovery = new DefaultMutableTreeNode("Recovery ");
        thispc.add(recovery);

        DefaultMutableTreeNode tc = new DefaultMutableTreeNode("tc");
        thispc.add(tc);

        DefaultMutableTreeNode users = new DefaultMutableTreeNode("Users ");
        thispc.add(users);
        DefaultMutableTreeNode windows = new DefaultMutableTreeNode("Windows");
        thispc.add(windows);

        DefaultMutableTreeNode Xaamp = new DefaultMutableTreeNode("Xaamp ");
        thispc.add(Xaamp);

        DefaultMutableTreeNode edriver = new DefaultMutableTreeNode("Edriver ");
        es.add(edriver);
        DefaultMutableTreeNode odtemp = new DefaultMutableTreeNode("1-5-21-3342554942-2199125985-2390592962-1001 ");
        C.add(odtemp);

        DefaultMutableTreeNode app = new DefaultMutableTreeNode("app ");
        oracle.add(app);
        DefaultMutableTreeNode sql = new DefaultMutableTreeNode("Mysql");
        pg.add(sql);

        DefaultMutableTreeNode nodejs = new DefaultMutableTreeNode("nodejs");
        pg.add(nodejs);
        JTree tree = new JTree(thispc);
        c.add(tree);

    }

    public static void main(String[] args) {
        DirectoryDemo dd = new DirectoryDemo();
        dd.setVisible(true);
        dd.setSize(400, 400);
    }

}
