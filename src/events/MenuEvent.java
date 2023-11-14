package events;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import menuDatos.*;
public class MenuEvent implements ActionListener{
	private JPanel jpItems;
	public MenuEvent(JPanel jpItems) {
		this.jpItems = jpItems;
	}
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(e.getSource() instanceof JButton) {
			if("Hamburguesas".equals(actionCommand)) {
				//showItems(mi.jpBurger);
				Burgers bgr = new Burgers();
				//System.out.println(bgr.price4);
				showItems(bgr);
			}else if("Burritos".equals(actionCommand)) {
				//showItems(mi.jpBurrito);
				Burritos brt = new Burritos();
				//System.out.println(brt.price4);
				showItems(brt);
			}else if("Variedad".equals(actionCommand)) {
				//showItems(mi.jpVariety);
				Varieties vts = new Varieties();
				//System.out.println(vts.price4);
				showItems(vts);
			}
		}
	}
	public void showItems(JPanel p){
		p.setBounds(100, 0, 830, 350);
		jpItems.removeAll();
		jpItems.add(p);
		jpItems.revalidate();
		jpItems.repaint();
	}
}