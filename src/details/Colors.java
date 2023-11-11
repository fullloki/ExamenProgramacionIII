package details;
import java.awt.*;
import javax.swing.*;
public class Colors {
	public void jbBorderRed(JButton jbtn) {
		jbtn.setBackground(Color.BLACK);
		jbtn.setForeground(Color.WHITE);
		jbtn.setFont(new Font("Arial Black",Font.PLAIN,11));
		//le da bordes redondos al boton (int radio,Color color,float grosor)
		jbtn.setBorder(new RoundedBorder(30,Color.RED,1.0f));
	}
	public void jbBorderWhite(JButton jbtn) {
		jbtn.setBackground(Color.BLACK);
		jbtn.setForeground(Color.WHITE);
		jbtn.setFont(new Font("Arial Black",Font.PLAIN,11));
		jbtn.setBorder(new RoundedBorder(12,Color.WHITE,2.5f));
	}
	public void fontProductsH1(JLabel jlabel) {
		jlabel.setBounds(65, 25, 500, 50);
		jlabel.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,48));
		jlabel.setForeground(Color.WHITE);
	}
	public void fontProductsP(JTextArea jta) {
		jta.setBounds(65, 120, 370, 170);
		jta.setOpaque(true);
	    jta.setBackground(Color.black);
	    jta.setEditable(false);
	    jta.setFont(new Font("Calibri", Font.PLAIN, 12));
		jta.setForeground(Color.white);
	}
}
