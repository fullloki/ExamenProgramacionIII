package appGUI;
import java.awt.*;
import javax.swing.*;
import details.*;
import events.*;
public class SectionProducts extends JPanel{
	private JButton jbBuy,jbMenu,jbPrev,jbNext;
	private JPanel jpProducts;
	SectionProducts(){
		setLayout(null);
		setBackground(Color.BLACK);
		jbBuy = new JButton("COMPRAR");
		jbBuy.getHorizontalTextPosition();
		jbMenu = new JButton("MENU");
		jbPrev = new JButton("prev");
		jbNext = new JButton("next");
		
		jbBuy.setBounds(140, 300, 100, 33);
		jbMenu.setBounds(260, 300, 100, 33);
		jbPrev.setBounds(35, 180, 30, 30);
		jbNext.setBounds(965, 180, 30, 30);
		//detalles
		Colors style = new Colors();
		style.jbBorderRed(jbBuy);
		style.jbBorderRed(jbMenu);
		jbPrev.setBackground(null);jbPrev.setBorder(null);
		jbNext.setBackground(null);jbNext.setBorder(null);
		jbPrev.setIcon(new Imagens("prev.png", 30, 30).imagen());
		jbNext.setIcon(new Imagens("next.png",30,30).imagen());
		//PANEL EN EL QUE SE MUESTRAN LOS PRODUCTOS
		jpProducts = new JPanel();
		jpProducts.setBounds(65, 0, 900, 300);
		Products p1 = new Products();
		jpProducts.setLayout(null);
		jpProducts.add(p1.panel1);
		//AGREGANDO COMPONENTES A ESTE PANEL
		add(jbBuy);
		add(jbMenu);
		add(jbPrev);
		add(jbNext);
		add(jpProducts);
		//EVENTOS DE BOTONES NEXT Y PREV
		SlideEvent slide = new SlideEvent(jpProducts);
		jbNext.addActionListener(slide);
		jbPrev.addActionListener(slide);
	}
}
