package details;
import java.awt.*;
import javax.swing.*;
public class Colors {
	//ESTILO DE LOS BOTONES CON BORDES ROJOS
	public void jbBorderRed(JButton jbtn) {
		jbtn.setBackground(Color.BLACK);
		jbtn.setForeground(Color.WHITE);
		jbtn.setFont(new Font("Arial Black",Font.PLAIN,11));
		//le da bordes redondos al boton (int radio,Color color,float grosor)
		jbtn.setBorder(new RoundedBorder(30,Color.RED,1.0f));
	}
	//ESTILO DE LOS BOTONES CON BORDES BLANCOS
	public void jbBorderWhite(JButton jbtn) {
		jbtn.setBackground(Color.BLACK);
		jbtn.setForeground(Color.WHITE);
		jbtn.setFont(new Font("Arial Black",Font.PLAIN,11));
		jbtn.setBorder(new RoundedBorder(12,Color.WHITE,2.5f));
	}
	//ESTILO DE FUENTE DE ENCABEZADO, SECCION DE PRODUCTOS 
	public void fontProductsH1(JLabel jlabel) {
		jlabel.setBounds(65, 25, 500, 50);
		jlabel.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,48));
		jlabel.setForeground(Color.WHITE);
	}
	//ESTILO DE FUENTE DE PARRAFOS, SECCION DE PRODUCTOS
	public void fontProductsP(JTextArea jta) {
		jta.setBounds(65, 120, 370, 170);
		jta.setOpaque(true);
	    jta.setBackground(Color.black);
	    jta.setEditable(false);
	    jta.setFont(new Font("Calibri", Font.PLAIN, 12));
		jta.setForeground(Color.white);
	}
	//ESTILO FUENTE DE PARRAFOS, SECCION DE CUPONES
	public void fontCouponsP(JTextArea jta) {
    	jta.setOpaque(true);
		jta.setLayout(null);
		jta.setEditable(false);
		jta.setBackground(Color.black);
		jta.setFont(new Font("Aptos", Font.BOLD, 12));
		jta.setForeground(Color.white);
		jta.setBounds(155, 60, 195, 90);
    }
	//ESTILO DE FUENTE PRECIO, SECCION DE CUPONES
    public void price(JLabel price) {
    	price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setFont(new Font("Aptos", Font.BOLD, 35));
		price.setForeground(Color.white);
		price.setBounds(150, 0, 145, 40);
    }
	//ESTILO DE LOS BOTONES DE LA SECCION DE MENU
	public void MenuButtonStyle(JButton jbtn) {
		jbtn.setBackground(null);
		jbtn.setForeground(new Color(166,166,166));
		jbtn.setFont(new Font("Times New Roman",Font.BOLD,18));
		jbtn.setBorder(new RoundedBorder(12,Color.DARK_GRAY,1.0f));
	}
    public void ItemLabels(JLabel jl) {
    	jl.setForeground(Color.WHITE);
    	jl.setFont(new Font("Times New Roman",Font.BOLD,18));
    }
    public void ItemTextArea(JTextArea jta) {
    	jta.setBackground(null);
    	jta.setForeground(Color.GRAY);
    	jta.setFont(new Font("Times New Roman",Font.PLAIN,18));
    }
}
