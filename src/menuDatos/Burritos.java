package menuDatos;
import java.awt.*;
import javax.swing.*;
public class Burritos extends Burgers{
	//SetItem s = new SetItem();
	public Burritos() {
		this.removeAll();
		this.setLayout(new GridLayout(2,2));
		jp1 = new JPanel();
	 	img1 ="burrito1.png";
	 	name1 ="Burrito Clasico";
	 	desc1 ="Tortillas de trigo,\ncarne molida, queso \namericano y vegetales \nfrescos.";
	 	price1 ="B/.5.99";
		s.setItem(jp1,img1,name1,desc1,price1);
		jp2 = new JPanel();
		img2 ="burrito2.png";
		name2 ="Lazena";
		desc2 ="Tortillas de trigo, filete de \npuerco en trozos, arroz, \nguacamole, frijoles y \nvegetales frescos.";
		price2 ="B/.9.00";
		s.setItem(jp2,img2,name2,desc2,price2);
		jp3 = new JPanel();
		img3 ="burrito3.png";
		name3 ="El Mediterraneo";
		desc3 ="Tortillas de trigo, filete \nde atun en trozos, camarones, \narroz, guacamole, frijoles \ny vegetales frescos.";
		price3 ="B/.7.99";
		s.setItem(jp3,img3,name3,desc3,price3);
		jp4 = new JPanel();
		img4 ="burrito4.png";
		name4 ="Burritico";
		desc4 ="Tortillas de trigo, filete de \npechuga, arroz, guacamole, \ncebolla morada caramelisada \ny vegetales frescos.";
		price4 ="B/.6.00";
		s.setItem(jp4,img4,name4,desc4,price4);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
		
		revalidate();
		repaint();
	}
}
