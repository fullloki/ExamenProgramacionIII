package events;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import appGUI.*;
/**
 * Clase para eventos de deslizar en el INICIO.
 */
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
	/**
	 * METODO PARA MOSTRAR PANEL
	 * @param p. Parametro para asignar panel.
	 */
	public void showProduct(JPanel p){
		panel.setLayout(null);
		p.setBounds(0, 0, 900, 300);
		panel.removeAll();
		panel.add(p);
		panel.revalidate();
		panel.repaint();
	}
	/**
	 * METODO PARA DESLIZAR EN ORDEN
	 * @param n. Parametro para el numero del panel.
	 */
	public void numberPanel(int n) {
		if(n == 1)showProduct(p.panel1);
		else if (n == 2)showProduct(p.panel2);
		else if(n == 3)showProduct(p.panel3);
	}
}
