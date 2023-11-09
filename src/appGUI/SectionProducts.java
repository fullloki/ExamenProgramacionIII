package appGUI;
import java.awt.*;
import javax.swing.*;
public class SectionProducts extends JPanel{
	private JButton jbBuy,jbMenu,jbPrev,jbNext;
	private JPanel jpProducts;
	SectionProducts(){
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		jbBuy = new JButton("COMPRAR");
		jbMenu = new JButton("MENU");
		jbPrev = new JButton();
		jbNext = new JButton();
		
		jbBuy.setBounds(140, 300, 100, 30);
		jbMenu.setBounds(260, 300, 100, 30);
		jbPrev.setBounds(35, 180, 30, 30);
		jbNext.setBounds(965, 180, 30, 30);
		
		ImageIcon png1 = new ImageIcon("C:\\Users\\HomeWork\\OneDrive\\tareas de asbel\\JAVA\\Proyecto-Recursos\\Proyecto-img\\prev.png");
		ImageIcon img = new ImageIcon(png1.getImage().getScaledInstance(jbPrev.getWidth(), jbPrev.getHeight(), Image.SCALE_SMOOTH));
		jbPrev.setIcon(img);
		
		ImageIcon png2 = new ImageIcon("C:\\Users\\HomeWork\\OneDrive\\tareas de asbel\\JAVA\\Proyecto-Recursos\\Proyecto-img\\next.png");
		ImageIcon img2 = new ImageIcon(png2.getImage().getScaledInstance(jbNext.getWidth(), jbNext.getHeight(), Image.SCALE_SMOOTH));
		jbNext.setIcon(img2);
		//----------------------------------
		jpProducts = new JPanel();
		jpProducts.setBackground(Color.GREEN);
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
