package menuDatos;
import java.awt.*;
import javax.swing.*;
public class Varieties extends Burgers{
	//SetItem s = new SetItem();
	public Varieties() {
		this.removeAll();

		this.setLayout(new GridLayout(2,2));
		jp1 = new JPanel();
		img1 ="variado1.png";
		name1 ="Medallones Gourmet";
		desc1 ="Carne, pollo o puerco a \nelegir con ensalada griega \nbañado en salsa bechamel y \nmiel.";
		price1 ="B/.12.00";
		s.setItem(jp1,img1,name1,desc1,price1);
		jp2 = new JPanel();
		img2 ="variado2.png";
		name2 ="Brochetas";
		desc2 ="Carne, pollo o puerco a \nelegir con ensalada fresca \ny pimientos al carbón.";
		price2 ="B/.7.99";
		s.setItem(jp2,img2,name2,desc2,price2);
		jp3 = new JPanel();
		img3 ="variado3.png";
		name3 ="Punta de Ancla";
		desc3 ="Filete de atún al vapor con \nensalada turca, papas fritas \ny salsa de la casa.";
		price3 ="B/.10.99";
		s.setItem(jp3,img3,name3,desc3,price3);
		jp4 = new JPanel();
		img4 ="variado4.png";
		name4 ="Pizzas";
		desc4 ="Hecha artesanalmente con \ningredientes frescos. \nDisponible: Jardín oculto \no Salami.";
		price4 ="B/.15.99";
		s.setItem(jp4,img4,name4,desc4,price4);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
		
		revalidate();
		repaint();
	}
}
