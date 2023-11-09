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
}
