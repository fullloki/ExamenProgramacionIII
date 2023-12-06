package events;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import appGUI.*;
public class SlideEvent implements ActionListener{
	private JPanel panel;
	private int np = 1;
	ProductsIntro p = new ProductsIntro();
	public SlideEvent(JPanel panel) {
		this.panel = panel;
	}
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(e.getSource() instanceof JButton) {
			if("next".equals(actionCommand)) {
				if(np == 3) np = 0;
				np++;
				numberPanel(np);
				
			}else if("prev".equals(actionCommand)) {
				np--;
				if(np <= 0) np = 3;
				numberPanel(np);
				//if(np == 0) np = 1;
			}
		}
	}
	public void showProduct(JPanel p){
		panel.setLayout(null);
		p.setBounds(0, 0, 900, 300);
		panel.removeAll();
		panel.add(p);
		panel.revalidate();
		panel.repaint();
	}
	public void numberPanel(int n) {
		if(n == 1)showProduct(p.panel1);
		else if (n == 2)showProduct(p.panel2);
		else if(n == 3)showProduct(p.panel3);
	}
}
