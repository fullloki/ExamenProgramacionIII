package events;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import menuDatos.*;
/**
 * Clase con los eventos del MENU.
 */
public class MenuEvent implements ActionListener{
	private JPanel jpItems,bgr,brt,vts;
	/**
	 * CONSTRUCTOR PARA OBTENER DATOS DE LOS TIPOS DE PRODUCTOS
	 * @param jpItems. Parametro para mostrar un tipo de producto.
	 * @param bgr. Parametro para productos tipo hamburguesas.
	 * @param brt. Parametro para productos tipo burrito.
	 * @param vts. Parametro para productos tipo variado.
	 */
	public MenuEvent(JPanel jpItems,JPanel bgr,JPanel brt,JPanel vts) {
		this.jpItems = jpItems;
		this.bgr = bgr;
		this.brt = brt;
		this.vts = vts;
	}
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(e.getSource() instanceof JButton) {
			if("Hamburguesas".equals(actionCommand)) {
				//Burgers bgr = new Burgers();
				//System.out.println(bgr.price4);
				showItems(bgr,brt,vts);
			}else if("Burritos".equals(actionCommand)) {
				//Burritos brt = new Burritos();
				//System.out.println(brt.price4);
				showItems(brt,bgr,vts);
			}else if("Variedad".equals(actionCommand)) {
				//Varieties vts = new Varieties();
				//System.out.println(vts.price4);
				showItems(vts,brt,bgr);
			}
		}
	}
	/**
	 * METODO PARA MOSTRAR EL TIPO DE PRODUCTO SELECCIONADO
	 * @param p1. Parametro para mostrar tipo de producto.
	 * @param p2. Parametro para ocultar tipo de producto.
	 * @param p3. Parametro para ocultar tipo de producto.
	 */
	public void showItems(JPanel p1,JPanel p2,JPanel p3){
		jpItems.setLayout(null);
		p1.setBounds(100, 0, 830, 350);
		p1.setVisible(true);
		jpItems.add(p1);
		p2.setVisible(false);
		p3.setVisible(false);
	}
}