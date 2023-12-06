package appGUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import details.*;
import logic.*;
import events.*;
public class SectionBuy extends JPanel{
private static final long serialVersionUID = 1L;
	
	private JPanel panelbotones;
	private JPanel panelfactura;
	private ProductButtonBuy product[];
 	private JTextArea factura; 
	private JLabel total;  
	private JLabel totalPagar; 
	private JButton jbComprar;
	private JButton jbLimpiar;
	private DataBus dataBus;

	Details style = new Details();
	//************************************ CONSTRUCNTOR *************************************//
	public SectionBuy(DataBus dataBus) {
		this.dataBus = dataBus;
		this.setSize(1050, 400);
		this.setLayout(null);
		this.setBackground(Color.black);
		this.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		JLabel titulo1 = new JLabel("Seleccionar Producto");
		titulo1.setFont(new Font("Arial", Font.BOLD, 20));
		titulo1.setForeground(Color.white);
		titulo1.setBounds(150, 0, 300, 30);
		JLabel titulo2 = new JLabel("Productos seleccionados");
		titulo2.setFont(new Font("Arial", Font.BOLD, 20));
		titulo2.setForeground(Color.white);
		titulo2.setBounds(650, 0, 300, 30);
		this.add(titulo1);
		this.add(titulo2);
		
		factura = new JTextArea();
		total = new JLabel(); 
		totalPagar = new JLabel("0.0");
		panelbotones = new JPanel();
		panelfactura = new JPanel();
		jbComprar = new JButton("Comprar");
		jbLimpiar = new JButton("Quitar Todo");
		PanelFactura();
		PanelBotones();
	}
	
	//********************************* TODO RELACIONADO AL PANEL DE PRODUCTOS CON PRECIOS ******************************
	public void PanelBotones() {
		
		panelbotones.setBackground(Color.black);
		panelbotones.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		panelbotones.setBounds(0, 30, 510, 370);
		//panelbotones.setLayout(new GridLayout(3,1,4,1));
		panelbotones.setLayout(new GridLayout(3,4));
		estiloboton();
		añadirbotones(panelbotones);
		this.add(panelbotones);
		panelbotones.setVisible(true);
		
	}
	
    public void estiloboton() {

		product = new ProductButtonBuy[16];
    	product[0] = new ProductButtonBuy("BurgerClasica    ","burger1.png","5.99");
    	product[1] = new ProductButtonBuy("Bacon Lovers     ","burger2.png","8.00");
    	product[2] = new ProductButtonBuy("Old School Burger","burger3.png","7.00");
    	product[3] = new ProductButtonBuy("Big Mamma Burger ","burger4.png","8.99");
    	
    	product[4] = new ProductButtonBuy("Burrito Clasico  ","burrito1.png","5.99");
    	product[5] = new ProductButtonBuy("Lazena           ","burrito2.png","9.00");
    	product[6] = new ProductButtonBuy("El Mediterraneo  ","burrito3.png","7.99");
    	product[7] = new ProductButtonBuy("Burrito          ","burrito4.png","6.00");
    	
    	product[8] = new ProductButtonBuy("Medallones Gourmet","variado1.png","12.00");
    	product[9] = new ProductButtonBuy("Brochetas         ","variado2.png","7.99");
    	product[10] = new ProductButtonBuy("Punta de Ancla   ","variado3.png","10.99");
    	product[11] = new ProductButtonBuy("Pizzas           ","variado4.png","15.99");
		
	}
    
    
	//************************ METODO QUE SE USAN EN E PANEL DE PRODUCTOS CON PRECIO Y PANEL DE BORRAR *******************************
	public void añadirbotones(JPanel panel) {
		
		BuyEvent buy = new BuyEvent(product,factura,totalPagar,jbComprar,dataBus);
		
		for(int i = 0; i < 12; i++) {
			panel.add(product[i]);
			product[i].setActionCommand(String.valueOf(i));
			product[i].addActionListener(buy);
			product[i].quit.setActionCommand("delet"+i);
			product[i].quit.addActionListener(buy);
		}
		jbComprar.setActionCommand("BUY");
		jbComprar.addActionListener(buy);
		jbLimpiar.addActionListener(buy);
	}
	
	
	//************************* METODO DEL TEXTAREA *************************************
	public void PanelFactura() {
		
		panelfactura.setLayout(null);
		panelfactura.setBounds(525, 30, 500, 370);
		panelfactura.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		panelfactura.setBackground(null);
		
		factura.setBounds(5, 2, 334, 250);
		factura.setBackground(Color.black);
		factura.setFont(new Font("Arial", Font.BOLD, 15));
		factura.setForeground(Color.WHITE);
		factura.setEditable(false);
		panelfactura.add(factura);
		

		total.setBounds(10, 250, 400 , 50);
		total.setFont(new Font("Arial Black", Font.BOLD, 30));
		total.setForeground(Color.white);
		total.setText("TOTAL                 B/.");
		totalPagar.setBounds(350, 250, 130, 50);
		totalPagar.setFont(new Font("Arial Black", Font.BOLD, 30));
		totalPagar.setForeground(Color.white);
		
		
		jbLimpiar.setBounds(10, 300, 150, 40);
		jbComprar.setBounds(320, 300, 150, 40);
		jbComprar.setEnabled(false);
		style.jbBorderRed(jbComprar);
		style.jbBorderRed(jbLimpiar);
		
		panelfactura.add(total);
		panelfactura.add(totalPagar);
		panelfactura.add(jbComprar);
		panelfactura.add(jbLimpiar);
		this.add(panelfactura);
	}

}
