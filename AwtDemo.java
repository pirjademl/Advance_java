import java.awt.*;
import java.applet.*;

public class AwtDemo extends Frame {
    public static void main(String[] args) {

   

    

    
Checkbox cb = new Checkbox("COMPUTER TECHNOLOGY",false);
Checkbox cb2 = new Checkbox("INFORMATION TECHNOLOGY",false) ;
Button btn = new Button("SUBMIT");

AwtDemo ad = new AwtDemo();
ad.setLayout(new FlowLayout());
ad.add(cb);
ad.add(cb2);
ad.add(btn);
ad.setVisible(true);
ad.setSize(400,400);

    }
    

}
