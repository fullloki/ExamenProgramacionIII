package appGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import details.*;
import events.BuyEvent;
public class ProductButtonBuy extends JButton{
	public JButton quit;
	public String nameProduct;
	public double price;
	public JLabel precio;
	public String costo;
	public String imagen;
	Details style = new Details();
	public ProductButtonBuy(String nameProduct,String imagen,String costo) {
		this.nameProduct = nameProduct;
		this.imagen = imagen;
		this.costo = costo;
		this.price = Double.parseDouble(costo);
		EstiloBoton();
	}
   public void EstiloBoton() {
		this.setLayout(null);
		precio = new JLabel(costo);
		precio.setForeground(Color.white);
		precio.setFont(new Font("Arial", Font.BOLD, 20));
		precio.setBounds(10, 90, 70, 20);
		this.add(precio);
		this.setBackground(Color.black);
		this.setIcon(new Imagens(imagen,90,75).imagen());
		this.setBorderPainted(false);
		quit = new JButton("---");
		quit.setBounds(90, 0, 20, 20);
		quit.setEnabled(false);
		style.jbBorderRed(quit);
		this.add(quit);
		
	}
	
}
