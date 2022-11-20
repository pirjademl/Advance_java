import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;

public class loginform extends JFrame implements ActionListener {

    loginform() {
        Container c = getContentPane();
        c.setLayout(null);
        JLabel Username = new JLabel("Username ");
        JTextField usernamefld = new JTextField();
        usernamefld.setFont(new Font("sans serif ",18, Font.BOLD));
        usernamefld.setBounds(120, 130, 35, 40);
        Username.setBounds(140, 86, 78, 78);
        c.add(Username);
        c.add(usernamefld);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        loginform lg = new loginform();
        lg.setVisible(true);
        lg.setSize(400, 400);
        lg.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
