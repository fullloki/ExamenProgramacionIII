package appGUI;
import java.awt.*;
import details.*;
import javax.swing.*;
public class SectionAboutUs extends JPanel{
	public JPanel panel1;
	Details style = new Details();
	
	public SectionAboutUs() {
		this.setBackground(Color.BLACK);
		this.setLayout(null);
		panel1 = new JPanel();
		this.add(panel1);
		iniciarComponentes();
	}
			
	private void iniciarComponentes() {
		panel1();
		etiquetas();
	}
		
	private void  panel1() {
		panel1.setLayout(null);
		panel1.setBounds(65, 0, 900, 300);
		panel1.setBackground(Color.BLACK);
		panel1.setOpaque(true);
	}
	
	private void etiquetas(){
		//titulo
		JLabel etiqueta1 = new JLabel ();
		etiqueta1.setText("La Cabañita");
		etiqueta1.setBounds(400,40,400,50);
		style.About_H3(etiqueta1);
		panel1.add( etiqueta1);
		//subtitulo
		JLabel etiqueta2 = new JLabel ();
		etiqueta2.setText("v1.20 - Examen Semestral de Programación III");
		etiqueta2.setBounds(440,95,300,30);
		style.AboutBold_P(etiqueta2);
		panel1.add(etiqueta2);
		//parrafo
	    JTextArea etiqueta3 = new JTextArea(" Hemos creado nuestro restaurante virtual llamado La Cabañita. En esta \n"+
				" obra maestra culinaria que eleva una experiencia gastronomica sin igual.\n"+
				" Se presentan diferentes secciones amigables al usuario en el que podrás \n"+
				" registrarse y posteriormente iniciar sesión. Luego, podrá tener acceso a \n"+
				" un menú muy variado, una sección de cupones en el que habrán jugosos \n"+
			    " descuentos y la sección de compra, donde realizarás el pago final.");
	    etiqueta3.setBounds(450,130,600,100);
	    style.AboutTextArea(etiqueta3);      
	    panel1.add(etiqueta3);
		//parrafo
		JLabel etiqueta4 = new JLabel ();
		etiqueta4.setText("Integrantes:");
		etiqueta4.setBounds(445,240,90,15);
		style.AboutBold_P(etiqueta4);
		panel1.add(etiqueta4);
		//parrafo
		JLabel etiqueta5 = new JLabel ();
		etiqueta5.setText("Asbel Jaén, Jeremy González, Antonio Cortés, Pamela Vallejo.");
		etiqueta5.setBounds(450,250,350,30);
		style.AboutPlain_P(etiqueta5);
		panel1.add(etiqueta5);
		//imagen
	    JLabel etiqueta6 = new JLabel();
	    etiqueta6.setIcon(new Imagens("Logo.png",290,290).imagen());
	    etiqueta6.setBounds(100,7,290,290);
	    panel1.add(etiqueta6);
	}
	
}
