package events;
import java.awt.event.*;
import javax.swing.*;
import appGUI.FrameMain;
import bankGUI.*;

public class MenubarEvent implements ActionListener{
	//public JFrame app,bank;
	private JFrame jfActual;
	private JPanel content, jpLog;
	/*public MenubarEvent(JFrame app,JFrame bank) {
		this.app = app;
		this.bank = bank;
	}*/
	public MenubarEvent(JFrame jfActual) {
		this.jfActual = jfActual;
		//this.bank = bank;
	}
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
				System.out.println("out");
				showPanel(jpLog);
			}
		}
	public void showPanel(JPanel p){
		content.setLayout(null);
		p.setBounds(0, 0, 900, 600);
		content.removeAll();
		content.add(p);
		content.revalidate();
		content.repaint();
	}
	
	/*public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
			if("Banco".equals(actionCommand)) {
				app.setVisible(false);
				bank.setVisible(true);
			}else if("Restaurante".equals(actionCommand)) {
				bank.setVisible(false);
				app.setVisible(true);
			}
		}*/
}
