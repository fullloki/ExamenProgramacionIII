package menuDatos;
import java.awt.*;
import javax.swing.*;
public class Burgers extends JPanel{
	public JPanel jp1,jp2,jp3,jp4;
	public String img1,img2,img3,img4;
	public String name1,name2,name3,name4;
	public String desc1,desc2,desc3,desc4;
	public String price1,price2,price3,price4;
	SetItem s = new SetItem();
	public Burgers() {
		this.setLayout(new GridLayout(2,2));
		jp1 = new JPanel();
		img1 ="burger1.png";
		name1 ="Burger Clasica";
		desc1 ="Pan artesanal con semillas \nde sésamo. 6 oz  de Angus \nBeef, queso cheddar, salsa \nde la casa y vegetales \nfrescos.";
		price1 ="B/.5.99";
		s.setItem(jp1,img1,name1,desc1,price1);
		jp2 = new JPanel();
		img2 ="burger2.png";
		name2 ="Bacon Lovers";
		desc2 ="Pan artesanal con semillas \nde sésamo. 6 oz  de Angus \nBeef  y chuleta de cerdo, \nqueso americano, salsa de \nla casa y vegetales frescos.";
		price2 ="B/.8.99";
		s.setItem(jp2,img2,name2,desc2,price2);
		jp3 = new JPanel();
		img3 ="burger3.png";
		name3 ="Old School Burger";
		desc3 ="Pan artesanal con semillas \nde sésamo. 6 oz  de Angus \nBeef, salsa de la casa, \nvegetales frescos y \naguacate.";
		price3 ="B/.7.99";
		s.setItem(jp3,img3,name3,desc3,price3);
		jp4 = new JPanel();
		img4 ="burger4.png";
		name4 ="Big Mamma Burger";
		desc4 ="Pan artesanal con semillas \nde sésamo tostadas.  Doble \nAngus Beef, queso cheddar, \nsalsa de la casa, cebollas \ny vegetales frescos.";
		price4 ="B/.8.99";
		s.setItem(jp4,img4,name4,desc4,price4);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
	}
}
