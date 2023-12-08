package appGUI;
import java.awt.*;
import javax.swing.*;
import details.*;
import events.*;
/**
 * Clase que muestra la informacion de la clase ProductIntro en la seccion INICIO.
 */
public class SectionProducts extends JPanel{
	public JButton jbBuy,jbMenu,jbPrev,jbNext;
	private JPanel jpProducts;
	public SectionProducts(){
		setLayout(null);
		setBackground(Color.BLACK);
		jbBuy = new JButton("COMPRAR");
		jbMenu = new JButton("MENU");
		jbPrev = new JButton("prev");
		jbNext = new JButton("next");
		
		jbBuy.setBounds(140, 300, 100, 33);
		jbMenu.setBounds(260, 300, 100, 33);
		jbPrev.setBounds(35, 180, 30, 30);
		jbNext.setBounds(965, 180, 30, 30);
		//detalles
		Details style = new Details();
		style.jbBorderRed(jbBuy);
		style.jbBorderRed(jbMenu);
		jbPrev.setBackground(null);jbPrev.setBorder(null);
		jbNext.setBackground(null);jbNext.setBorder(null);
		jbPrev.setIcon(new Imagens("prev.png", 30, 30).imagen());
		jbNext.setIcon(new Imagens("next.png",30,30).imagen());
		//PANEL EN EL QUE SE MUESTRAN LOS PRODUCTOS
		jpProducts = new JPanel();
		jpProducts.setBounds(65, 0, 900, 300);
		ProductsIntro p1 = new ProductsIntro();
		jpProducts.setLayout(null);
		jpProducts.add(p1.panel1);
		//AGREGANDO COMPONENTES A ESTE PANEL
		add(jbBuy);
		add(jbMenu);
		add(jbPrev);
		add(jbNext);
		add(jpProducts);
		//AGREGANDO EVENTOS
		SlideEvent slide = new SlideEvent(jpProducts);
		jbNext.addActionListener(slide);
		jbPrev.addActionListener(slide);
	}
}
