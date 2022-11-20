
import java.awt.*;

public class GridbagEx extends Frame {
    public static void main(String[] args) {
        GridbagEx g = new GridbagEx();

    }

    public GridbagEx() {

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        setTitle("AJI LAND MERA SUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII ");

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new Button("Button One "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(new Button("Button Two"), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new Button("Button Three"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(new Button("Button Four "), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        add(new Button("Buttton Five "), gbc);
        setSize(300, 300);
        setVisible(true);

    }

    public void paint(Graphics g) {
        g.drawString("This is the example of the gridbaglayout and gridbagconstraints", 600, 500);
    }

}