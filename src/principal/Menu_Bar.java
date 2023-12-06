package principal;
import java.awt.*;
import javax.swing.*;
import details.Details;
import events.*;
public class Menu_Bar extends JMenuBar{
	private JLabel jlAdmin;
	private JLabel jltitle;
	//private JButton jbLogin;
	//private JFrame login;
	//private JMenu jmAccount;
	Details style = new Details();
	/*public Menu_Bar(JFrame login,JButton jbLogin) {
		this.jbLogin = jbLogin;
		this.login = login;
	}*/
	/*public Menu_Bar(JFrame jfApp,JFrame jfBank) {
		
		this.setBackground(Color.BLACK);
		this.setBorderPainted(false);
		//----------------------------------------------------creando menu y agregandolo a menBar
		JMenu jmGoTo = new JMenu("Dirigirse a");
		//jmAccount = new JMenu("Cuenta");
		style.jmenuDetails(jmGoTo);
		//cd.jmenuDetails(jmHelp);
		jlAdmin = new JLabel("Admin:");
		this.add(jmGoTo);
		this.add(jlAdmin);
		//this.add(jmAccount);
		//this.add(jmHelp);
		//creando menuItem para account
		JMenuItem jmiBank = new JMenuItem("Banco");
		JMenuItem jmiApp = new JMenuItem("Restaurante");
		//jmiApp.setEnabled(false);//<--------------------------------habilitar
		style.jmItemsDetails(jmiBank);
		style.jmItemsDetails(jmiApp);
		jmGoTo.add(jmiBank);
		jmGoTo.add(jmiApp);
		//creando menuItem para HELP
		//JMenuItem jmiLogIn = new JMenuItem("Iniciar sesion");
		//JMenuItem jmiLogOut = new JMenuItem("Cerrar sesion");
		//style.jmItemsDetails(jmiLogIn);
		//style.jmItemsDetails(jmiLogOut);
		//jmAccount.add(jmiLogIn);
		//jmAccount.add(jmiLogOut);
		//agregando eventos
		jlAdmin.setVisible(false);
		MenubarEvent me = new MenubarEvent(jfApp,jfBank);
		jmiBank.addActionListener(me);
		jmiApp.addActionListener(me);
	}*/
	public Menu_Bar(JFrame jfActual) {
		
		this.setBackground(Color.BLACK);
		this.setBorderPainted(false);
		//----------------------------------------------------creando menu y agregandolo a menBar
		JMenu jmGoTo = new JMenu("Dirigirse a");
		//jmAccount = new JMenu("Cuenta");
		style.jmenuDetails(jmGoTo);
		//cd.jmenuDetails(jmHelp);
		jlAdmin = new JLabel("Admin:");
		this.add(jmGoTo);
		this.add(jlAdmin);
		//this.add(jmAccount);
		//this.add(jmHelp);
		//creando menuItem para account
		JMenuItem jmiBank = new JMenuItem("Banco");
		JMenuItem jmiApp = new JMenuItem("Restaurante");
		//jmiApp.setEnabled(false);//<--------------------------------habilitar
		style.jmItemsDetails(jmiBank);
		style.jmItemsDetails(jmiApp);
		jmGoTo.add(jmiBank);
		jmGoTo.add(jmiApp);
		//creando menuItem para HELP
		//JMenuItem jmiLogIn = new JMenuItem("Iniciar sesion");
		//JMenuItem jmiLogOut = new JMenuItem("Cerrar sesion");
		//style.jmItemsDetails(jmiLogIn);
		//style.jmItemsDetails(jmiLogOut);
		//jmAccount.add(jmiLogIn);
		//jmAccount.add(jmiLogOut);
		//agregando eventos
		jlAdmin.setVisible(false);
		MenubarEvent me = new MenubarEvent(jfActual);
		jmiBank.addActionListener(me);
		jmiApp.addActionListener(me);
	}

	public void jmiLogOut() {
		
	}
}
