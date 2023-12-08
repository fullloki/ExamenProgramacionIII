package principal;
import java.awt.*;
import javax.swing.*;
import details.Details;
import events.*;
/**
 * Clase para con el menubar de los frames.
 */
public class Menu_Bar extends JMenuBar{
	private JLabel jlAdmin;
	private JLabel jltitle;
	Details style = new Details();
	/**
	 * Constructor para obtener el frame
	 * @param jfActual - Parametro con el frame activo.
	 */
	public Menu_Bar(JFrame jfActual) {
		
		this.setBackground(Color.BLACK);
		this.setBorderPainted(false);
		JMenu jmGoTo = new JMenu("Dirigirse a");
		style.jmenuDetails(jmGoTo);
		jlAdmin = new JLabel("Admin:");
		this.add(jmGoTo);
		this.add(jlAdmin);
		JMenuItem jmiBank = new JMenuItem("Banco");
		JMenuItem jmiApp = new JMenuItem("Restaurante");
	
		style.jmItemsDetails(jmiBank);
		style.jmItemsDetails(jmiApp);
		jmGoTo.add(jmiBank);
		jmGoTo.add(jmiApp);

		jlAdmin.setVisible(false);
		MenubarEvent me = new MenubarEvent(jfActual);
		jmiBank.addActionListener(me);
		jmiApp.addActionListener(me);
	}
}
