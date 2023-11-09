package appGUI;
import java.awt.*;
import javax.swing.*;
import details.*;
public class SectionProducts extends JPanel{
	private JButton jbBuy,jbMenu,jbPrev,jbNext;
	private JPanel jpProducts;
	SectionProducts(){
		setLayout(null);
		setBackground(Color.BLACK);
		jbBuy = new JButton("COMPRAR");
		jbBuy.getHorizontalTextPosition();
		jbMenu = new JButton("MENU");
		jbPrev = new JButton();
		jbNext = new JButton();
		
		jbBuy.setBounds(140, 300, 100, 33);
		jbMenu.setBounds(260, 300, 100, 33);
		jbPrev.setBounds(35, 180, 30, 30);
		jbNext.setBounds(965, 180, 30, 30);
		//detalles
		Colors c = new Colors();
		c.jbBorderRed(jbBuy);
		c.jbBorderRed(jbMenu);
		jbPrev.setBackground(null);jbPrev.setBorder(null);
		jbNext.setBackground(null);jbNext.setBorder(null);
		jbPrev.setIcon(new Imagens("prev.png", 30, 30).imagen());
		jbNext.setIcon(new Imagens("next.png",30,30).imagen());
		//PANEL EN EL QUE SE MUESTRAN LOS PRODUCTOS
		jpProducts = new JPanel();
		jpProducts.setBackground(Color.BLACK);
		jpProducts.setBounds(65, 0, 900, 300);
		Product1 p1 = new Product1(); 
		showPanel(p1);
		//----------------------------------
		add(jbBuy);
		add(jbMenu);
		add(jbPrev);
		add(jbNext);
		add(jpProducts);
	}
	public void showPanel(JPanel p){
		jpProducts.setLayout(null);
		p.setBounds(0, 0, 900, 300);
		jpProducts.removeAll();
		jpProducts.add(p);
		jpProducts.revalidate();
		jpProducts.repaint();
	}
}
