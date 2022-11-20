import java.awt.*;
public class FlowLayoutDemo extends Frame {
	Checkbox c,c1,c2,c3;
	FlowLayoutDemo(){
		setLayout(new FlowLayout(FlowLayout.CENTER) );
		c= new Checkbox("AJP",true);
		c1=new Checkbox("CSR");
		c2= new Checkbox("MGMT");
		c3= new Checkbox("STG");
		
		add(c);
		add(c1);
		add(c2);
		add(c3);
		
		
		
	}
	public void paint(Graphics g ){
		g.drawString(""+c1.getState(),100,200);
		
	}
public static void main(String [] args ){
	FlowLayoutDemo fd= new FlowLayoutDemo();
	fd.setSize(400,400);
	fd.setVisible(true);
	fd.setTitle("FlowLayoutDemo");
	
	
	
}
}