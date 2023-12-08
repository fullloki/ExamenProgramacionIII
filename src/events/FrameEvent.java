package events;
import java.awt.event.*;
import javax.swing.*;
import details.*;
import logic.*;
import appGUI.SectionBuy;
/**
 * Clase para los eventos de cambiar de panel en el Frame (INICIO).
 */
public class FrameEvent implements ActionListener{
	private JPanel main,about,horary,menu,buy;//content
	private JFrame login;
	private JButton jbLog;
	private DataBus busData;
	//private JOptionPane jOptionPane;
	//private String logUser;
	Details style = new Details();
	public FrameEvent(DataBus busData,JPanel main,JPanel about,
			JPanel horary,JPanel menu,JPanel buy,JFrame login) {
		//this.content = content;
		this.busData = busData;
		this.about = about;
		this.horary = horary;
		this.main = main;
		this.menu = menu;
		this.buy = buy;
		this.login = login;
		this.jbLog = busData.jbtn;
	}
	
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(e.getSource() instanceof JButton) {
			if("INICIO".equals(actionCommand)) {
				//MUESTRA EL PANEL PRINCIPAL
				showSection(main);
			}else if("ACERCA DE".equals(actionCommand)) {
				//MUESTRA EL PANEL ASCERCA DE
				showSection(about);
			}else if("HORARIO".equals(actionCommand)) {
				//MUESTRA EL PANEL DE HORARIO
				showSection(horary);
			}else if("COMPRAR".equals(actionCommand)) {
				//MUESTRA EL PANEL COMPRAR SI SE INICIO SESION
				if(jbLog.getText().equals("Iniciar sesion")) {
					login.setVisible(true);
				}else showSection(buy);
			}else if("MENU".equals(actionCommand)) {
				//MUESTRA EL PANEL DE MENU
				showSection(menu);
			}else if("LOGIN".equals(actionCommand)) {
				//MUESTRA EL FRAME DE INICIAR SESION
				if(jbLog.getText().equals("Iniciar sesion")) {
					login.setVisible(true);
				}else {
					//MUESTRA CONFIRMAR PARA CERRAR SESION
					confirm();
				}
				
			}
		}
	}
	/**
	 * Metodo para cambiar de panel.
	 * @param p1. Parametro que asigna el panel a mostrar.
	 */
	public void showSection(JPanel p1){
		busData.content.setLayout(null);
		p1.setBounds(0, 0, 1050, 400);
		busData.content.removeAll();
		busData.content.add(p1);
		busData.content.revalidate();
		busData.content.repaint();
	}
	/**
	 * Metodo para confirmar cerrar sesion.
	 */
	public void confirm() {
		String buttons[] = {"Cerrar","Cancelar"};
		int op = JOptionPane.showOptionDialog(null,"¿Desea salir de la cuenta?", "Cerrar sesion", 0, JOptionPane.QUESTION_MESSAGE, null, buttons, this);
		if(op == JOptionPane.YES_OPTION) {
			//SE CAMBIA EL BOTON DE LOGIN
			style.jbuttonLogOut(jbLog);
			busData.resetFacture = true;
			showSection(main);
		}
	}

}
