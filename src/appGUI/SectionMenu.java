package appGUI;
import java.awt.*;
import javax.swing.*;
import details.*;
import events.MenuEvent;
import menuDatos.Burgers;
import menuDatos.Burritos;
public class SectionMenu extends JPanel{
	private JButton jbBar[];
	private JPanel jpItems;
	public SectionMenu() {
		this.setLayout(null);
		setBackground(new Color(13,13,13));
		//INSTANCIANDO COMPONENTES DEL PANEL
		jbBar = new JButton[3];
		jbBar[0] = new JButton("Hamburguesas");
		jbBar[1] = new JButton("Burritos");
		jbBar[2] = new JButton("Variedad");
		//PANEL EN EL QUE VAN LOS BOTOBES
		JPanel jpSelect = new JPanel();
		jpSelect.setBounds(0, 0, 1050, 50);
		jpSelect.setBackground(null);
		jpSelect.setLayout(null);
		Colors style = new Colors();
		int x = 65;//<-----posicion x de los botones
		for(int i = 0; i < 3; i++) {
			jpSelect.add(jbBar[i]);
			jbBar[i].setBounds(x, 5, 140, 40);
			style.MenuButtonStyle(jbBar[i]);
			x = x + 150;
		}
		//-----------------------------------------------
		//PANEL EN EL QUE VA EL CONTENIDO
		jpItems = new JPanel();
		jpItems.setLayout(null);
		jpItems.setBounds(0, 60, 1050, 350);
		jpItems.setBackground(null);
		Burgers bgr = new Burgers();
		bgr.setBounds(100, 0, 830, 350);
		jpItems.add(bgr);
		//AGREGANDO COMPONENTES A ESTE PANEL
		add(jpSelect);
		add(jpItems);
		//AGREGANDO EVENTOS
		MenuEvent me = new MenuEvent(jpItems);
		for(int i = 0; i < 3 ; i++) {
			jbBar[i].addActionListener(me);
		}
	}

}
