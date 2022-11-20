import java.awt.*;
import java.applet.*;

public class PracticalNo1 extends Frame {
    Checkbox hndi,eng,mrthi,snkrit;
    PracticalNo1() {
        // setLayout(null);
        FlowLayout fl = new FlowLayout ();
        setLayout(fl);
        
    Button  Okbtn = new Button("OK");
    Button  cancelbutton = new Button("CANCEL");
    Button retrybtn = new Button("RETRY");

add(Okbtn);
add(retrybtn);
add(cancelbutton);
      
      
      
    }

    public static void main(String[] args) {
        PracticalNo1 pr1 = new PracticalNo1();
        // pr1.setLayout(new FlowLayout());

        pr1.setVisible(true);
        pr1.setSize(400, 400);
        pr1.setTitle("OK RETRY AND CANCEL BUTTONS    ");

    }

}
