package appGUI;
import java.awt.*;
import javax.swing.*;
import details.*;
public class SectionMenu extends JPanel{
	private JButton jbBar[];
	private JPanel jpInfo[];
	private JPanel jpItems;
	public SectionMenu() {
		this.setLayout(null);
		setBackground(new Color(13,13,13));
		//INSTANCIANDO COMPONENTES DEL PANEL
		jbBar = new JButton[6];
		jbBar[0] = new JButton("Haburguesas");
		jbBar[1] = new JButton("Burritos");
		jbBar[2] = new JButton("Variedad");
		jbBar[3] = new JButton("Tortas");
		jbBar[4] = new JButton("Combos");
		jbBar[5] = new JButton("Refrescos");
		//PANEL EN EL QUE VAN LOS BOTOBES
		JPanel jpSelect = new JPanel();
		jpSelect.setBounds(0, 0, 1050, 50);
		jpSelect.setBackground(null);
		jpSelect.setLayout(null);
		Colors style = new Colors();
		int x = 65;//<-----posicion x de los botones
		for(int i = 0; i < 6; i++) {
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
		jpItems.setBackground(Color.CYAN);
		jpInfo = new JPanel[4];
		for(int i = 0; i < 4 ; i++) {
			jpInfo[i] = new JPanel();
			jpInfo[i].setBackground(Color.BLUE);
			jpInfo[i].setBounds(50, 60, 175, 175);
			jpItems.add(jpInfo[i]);
			//showSection(jpInfo[i]);
		}
		//AGREGANDO COMPONENTES A ESTE PANEL
		add(jpSelect);
		add(jpItems);
	}
	public void showSection(JPanel p){
		jpItems.setLayout(null);
		p.setBounds(0, 0, 1050, 350);
		jpItems.removeAll();
		jpItems.add(p);
		jpItems.revalidate();
		jpItems.repaint();
	}
}
