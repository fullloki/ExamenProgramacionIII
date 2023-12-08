package events;
import java.awt.event.*;
import javax.swing.*;
import appGUI.FrameMain;
import bankGUI.*;
/**
 * Clase con los eventos del menubar
 */
public class MenubarEvent implements ActionListener{
	//public JFrame app,bank;
	private JFrame jfActual;
	private JPanel content, jpLog;
	/**
	 * CONSTRUCTOR PARA OBTENER EL FRAME
	 * @param jfActual. Parametro para mostrar frame.
	 */
	public MenubarEvent(JFrame jfActual) {
		this.jfActual = jfActual;
		//this.bank = bank;
	}
	/**
	 * CONSTRUCTOR PARA CERRAR CUENTA EN EL BANCO
	 * @param content. Parametro para mostrar contenido.
	 * @param jpLog. Parametro para volver al inicio del banco.
	 */
	public MenubarEvent(JPanel content, JPanel jpLog) {
		this.content = content;
		this.jpLog = jpLog;
	}
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
			if("Banco".equals(actionCommand)) {
				BankGUI bank = new BankGUI("BankNismo");
				bank.setVisible(true);
				bank.setSize(900, 600);
				//bank.setVisible(false);
				bank.setResizable(false);
				bank.setLocationRelativeTo(null);
				jfActual.setVisible(false);
			}else if("Restaurante".equals(actionCommand)) {
				FrameMain app = new FrameMain("LA CABAÑITA");
				app.setSize(1050, 590);
				app.setVisible(true);
				app.setResizable(false);
				app.setLocationRelativeTo(null);
				jfActual.setVisible(false);
			}else if("cerrar sesion".equals(actionCommand)) {
				//System.out.println("out");
				showPanel(jpLog);
			}
		}
	/**
	 * METODO PARA MOSTRAR PANEL
	 * @param p. Parametro para asignar panel.
	 */
	public void showPanel(JPanel p){
		content.setLayout(null);
		p.setBounds(0, 0, 900, 600);
		content.removeAll();
		content.add(p);
		content.revalidate();
		content.repaint();
	}
	
}
