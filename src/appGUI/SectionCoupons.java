package appGUI;

import java.awt.Color;

import javax.swing.*;
import details.*;
public class SectionCoupons extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public Colors style;
	public JPanel cupon1;
	public JPanel cupon2;
	public JPanel cupon3;
	public JPanel cupon4;
	public JPanel cupon5;
	public JPanel cupon6;
	

	public SectionCoupons() {
		
		//this.setSize(1050, 400);
		this.setLayout(null);
		this.setBackground(Color.black);
		
		cupon1 = new JPanel();
		cupon2 = new JPanel();
		cupon3 = new JPanel();
		cupon4 = new JPanel();
		cupon5 = new JPanel();
		cupon6 = new JPanel();
		
		etiquetas();
		etiquetas2();
		
	}
	
	
	public void etiquetas() {
		style = new Colors();
		
		//Cupon 1
		coupons(cupon1);
		cupon1.setBounds(30, 10, 320, 190);
		this.add(cupon1);
		//Cupon 2
		coupons(cupon2);
		cupon2.setBounds(30, 210, 320, 190);
		this.add(cupon2);
		//Cupon 3
		coupons(cupon3);
		cupon3.setBounds(358, 10, 320, 190);
		this.add(cupon3);
		//Cupon 4
		coupons(cupon4);
		cupon4.setBounds(358, 210, 320, 190);
		this.add(cupon4);
		//Cupon 5
		coupons(cupon5);
		cupon5.setBounds(685, 10, 320, 190);
		this.add(cupon5);
		//Cupon6
		coupons(cupon6);
		cupon6.setBounds(685, 210, 320, 190);
		this.add(cupon6);
		
	}
	//BOTON DE LOS CUPONES
	public void coupons(JPanel cupon) {
		cupon.setLayout(null);
		cupon.setBackground(null);
		JButton btcupon = new JButton("Comprar");
		style.jbBorderRed(btcupon);
		btcupon.setBounds(220, 130, 100, 33);
		cupon.add(btcupon);
		
	}
	//IMAGEN Y TEXTO DE LOS CUPONES
	public void etiquetas2() {
		//-----------------------------------------------------------CUPON 1
		JLabel etiqueta1 = new JLabel();
		etiqueta1.setBounds(0, 20, 150, 130);
		etiqueta1.setIcon(new Imagens("combo1.png",150,130).imagen());
		cupon1.add(etiqueta1);
		
		String texto = "Hamburguesa doble\ncarne    con    papas\ny     soda      grande.";
		JTextArea etiqueta2 = new JTextArea(texto);
		style.fontCouponsP(etiqueta2);
		cupon1.add(etiqueta2);		
		
		JLabel etiqueta3 = new JLabel("¡4.99!");
		style.price(etiqueta3);
		cupon1.add(etiqueta3);
		//-----------------------------------------------------------CUPON 2
		JLabel etiqueta4 = new JLabel();
		etiqueta4.setBounds(0, 20, 150, 130);
		etiqueta4.setIcon(new Imagens("burrito3.png",150,130).imagen());
		cupon2.add(etiqueta4);
	    
		String texto2 = "Burrito     relleno    con\nfrijoles ,arroz, camaron,\naguacate     y     más.";
		JTextArea etiqueta5 = new JTextArea(texto2);
	    style.fontCouponsP(etiqueta5);
		cupon2.add(etiqueta5);		
		
		JLabel etiqueta6 = new JLabel("¡1.99!");
		style.price(etiqueta6);
		cupon2.add(etiqueta6);
		//-----------------------------------------------------------CUPON 3
		JLabel etiqueta7 = new JLabel();
		etiqueta7.setBounds(0, 20, 150, 130);
		etiqueta7.setIcon(new Imagens("torta1.png",150,130).imagen());
		cupon3.add(etiqueta7);
	    
		String texto3 = "Emparedado tradicional\nde    jamon    y    queso.\nPerzonalizable.";
		JTextArea etiqueta8 = new JTextArea(texto3);
		style.fontCouponsP(etiqueta8);
		cupon3.add(etiqueta8);		
		
		JLabel etiqueta9 = new JLabel("¡3.99!");
		style.price(etiqueta9);
		cupon3.add(etiqueta9);
		//-----------------------------------------------------------CUPON 4
		JLabel etiqueta10 = new JLabel();
		etiqueta10.setBounds(0, 20, 150, 150);
	    etiqueta10.setIcon(new Imagens("combo2.png",150,150).imagen());
		cupon4.add(etiqueta10);
			    
		String texto4 = "Hamburguesa   doble\ncarne      sin     queso,\npapas y  soda   grande.";
		JTextArea etiqueta11 = new JTextArea(texto4);
		style.fontCouponsP(etiqueta11);
		cupon4.add(etiqueta11);		
				
		JLabel etiqueta12 = new JLabel("¡3.99!");
		style.price(etiqueta12);
		cupon4.add(etiqueta12);
		//-----------------------------------------------------------CUPON 5
		JLabel etiqueta13 = new JLabel();
		etiqueta13.setBounds(0, 20, 150, 130);
	    etiqueta13.setIcon(new Imagens("burrito4.png",150,130).imagen());
		cupon5.add(etiqueta13);
			    
		String texto5 = "2 burrtios de  carne\ncon lechuga, tomate,\naguacate, mallonesa...";
		JTextArea etiqueta14 = new JTextArea(texto5);
		style.fontCouponsP(etiqueta14);
		cupon5.add(etiqueta14);		
				
		JLabel etiqueta15 = new JLabel("¡2.99!");
		style.price(etiqueta15);
		cupon5.add(etiqueta15);
		//-----------------------------------------------------------CUPON 6
		JLabel etiqueta16 = new JLabel();
		etiqueta16.setBounds(0, 10, 150, 130);
	    etiqueta16.setIcon(new Imagens("torta4.png",150,130).imagen());
		cupon6.add(etiqueta16);
					    
		String texto6 = "Emparedado  de  jamon\ncon    lechuga,   tomate,\nmortadela   y  aderesos";
		JTextArea etiqueta17 = new JTextArea(texto6);
		style.fontCouponsP(etiqueta17);
		cupon6.add(etiqueta17);		
						
		JLabel etiqueta18 = new JLabel("¡3.50!");
		style.price(etiqueta18);
		cupon6.add(etiqueta18);
	}	
}

