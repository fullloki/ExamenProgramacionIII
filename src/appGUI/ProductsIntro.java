package appGUI;
import java.awt.*;
import javax.swing.*;
import details.*;
/**
 * Esta clase contiene la informacion de los productos: Hamburguesas, Burritos y Variados. 
 */
public class ProductsIntro {
//private static final long serialVersionUID = 1L;
	public JPanel panel1;
	public JPanel panel2;
	public JPanel panel3;
	public JPanel panelbase;
	
	Details style = new Details();
	public ProductsIntro() {
		panel1 = new JPanel();
		panel1();
		panel2 = new JPanel();
		panel2();
		panel3 = new JPanel();
		panel3();
	}
	public void panel1() {
		panel1.setLayout(null);
		panel1.setBounds(0, 0, 900, 300);
		panel1.setBackground(Color.BLACK);
		
		JLabel etiqueta1 = new JLabel("HAMBURGUESA");
	    style.fontProductsH1(etiqueta1);
		panel1.add(etiqueta1);
		
		String texto1 = " Deléitate con nuestras hamburguesas gourmet, una obras maestra "+
						"\n culinarias que eleva  la  experiencia gastronómica. La jugosa"+
						"\n carne de res, sazonada con  nuestras especias secretas, se"+
						"\n funde con queso derretido de alta calidad.";
				
		JTextArea etiqueta2 = new JTextArea();
		etiqueta2.setText(texto1);
		style.fontProductsP(etiqueta2);
		panel1.add(etiqueta2);

		JLabel etiqueta3 = new JLabel();
	    etiqueta3.setBounds(450, 50, 350, 242);
	    etiqueta3.setIcon(new Imagens("burger1.png",350,242).imagen());
	    panel1.add(etiqueta3);
	}
	public void panel2() {
		panel2.setLayout(null);
	    panel2.setBounds(0, 0, 900, 300);
	    panel2.setBackground(Color.BLACK);
	    
	    JLabel etiqueta4 = new JLabel("BURRITOS");
	    style.fontProductsH1(etiqueta4);
		panel2.add(etiqueta4);
		
		String texto1 = " Disfruta de nuestros burritos artesanales, una explosión de sabor"+
						"\n en cada envoltura. El tierno relleno de carne sazonada se mezcla"+
						"\n armoniosamente con frijoles, arroz y queso fundido con toques "+
						"\n frescos de guacamole y pico de gallo.";  
				
		JTextArea etiqueta5 = new JTextArea();
		etiqueta5.setText(texto1);
		style.fontProductsP(etiqueta5);
		panel2.add(etiqueta5);
		
		JLabel etiqueta6 = new JLabel();
	    etiqueta6.setBounds(450, 50, 350, 242);
	    etiqueta6.setIcon(new Imagens("burrito1.png",350,242).imagen());
	    panel2.add(etiqueta6);
		
	}
	public void panel3() {
		panel3.setLayout(null);
		panel3.setBounds(0, 0, 900, 300);
		panel3.setBackground(Color.BLACK);
		
		JLabel etiqueta7 = new JLabel("VARIADOS");
		style.fontProductsH1(etiqueta7);
		panel3.add(etiqueta7);
			
		String texto1 = " Con una varidad de platillos a ofrecer, un menu amplio para los"+
						"\n distintos paladares gastronómicos. Ven y prueba uno de ellos o"+
						"\n mas. Comidas llenas de sabor y color para toda ocacion.";
					
		JTextArea etiqueta8 = new JTextArea();
		etiqueta8.setText(texto1);
		style.fontProductsP(etiqueta8);
		panel3.add(etiqueta8);
			
		JLabel etiqueta9 = new JLabel();
		etiqueta9.setBounds(450, 50, 350, 242);
		etiqueta9.setIcon(new Imagens("variado2.png",350,242).imagen());
		panel3.add(etiqueta9);
	}
}
