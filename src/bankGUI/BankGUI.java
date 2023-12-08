package bankGUI;
import java.awt.*;
import loginGUI.*;
import principal.Menu_Bar;
import appGUI.FrameMain;
import javax.swing.*;
import details.*;
import events.*;
import logic.*;
/**
 * Clase principal del banco, que muestra el inicio de sesion como administrador y la seccion de administrativa.
 */
public class BankGUI extends JFrame{
	private JPanel content;
	Details style = new Details();
	public BankGUI(String title) {
		content = new JPanel();
		content.setLayout(null);
		content.setBounds(0, 0, 900, 600);
		content.setBackground(Color.BLACK);
		//==============================================
		Menu_Bar menubar = new Menu_Bar(this);
		JMenu exit = new JMenu("Salir");
		JMenuItem jmiLogOut = new JMenuItem("cerrar sesion"); 
		style.jmenuDetails(exit);
		style.jmItemsDetails(jmiLogOut);
		exit.add(jmiLogOut);
		menubar.add(exit);
		this.setJMenuBar(menubar);
		
		//======================================
		//BankAdmin ba = new BankAdmin();//--------------temporal
		BankLogin blg = new BankLogin();
		showPanel(blg);
		LoginEvent log = new LoginEvent(content,blg.getJtfUser(),blg.getJtfPass(),blg.getJLMsg());
		blg.getJBInit().addActionListener(log);
		MenubarEvent me = new MenubarEvent(content,blg);
		jmiLogOut.addActionListener(me);
		this.add(content);
	}

	public void showPanel(JPanel p){
		content.setLayout(null);
		//p.setBounds(0, 0, 900, 600);
		content.removeAll();
		content.add(p);
		content.revalidate();
		content.repaint();
	}
	public static void main(String[] args) {
		BankGUI b = new BankGUI("BankNismo");
		b.setSize(900, 600);
		b.setVisible(true);
		b.setResizable(false);
		b.setLocationRelativeTo(null);
	}
}
