import java.awt.*;
import java.awt.event.*;

public class AdjustmentListenerDemo extends Frame implements AdjustmentListener {

    Label lbl = new Label();
    Scrollbar sc = new Scrollbar(Scrollbar.VERTICAL);

    public AdjustmentListenerDemo() {
        setSize(400, 400);
        setVisible(true);
        sc.addAdjustmentListener(this);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.CENTER);
        add(sc,BorderLayout.EAST);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        lbl.setText("TYPE   " + e.getAdjustmentType() + " VAlUE   " + e.getValue());

    }

    public static void main(String[] args) {
        AdjustmentListenerDemo sd = new AdjustmentListenerDemo();

    }

}
