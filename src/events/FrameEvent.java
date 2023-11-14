package events;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import appGUI.*;
public class FrameEvent implements ActionListener{
	public JPanel content;
	public FrameEvent(JPanel content) {
		this.content = content;
	}
	
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(e.getSource() instanceof JButton) {
			if("INICIO".equals(actionCommand)) {
				SectionProducts sp = new SectionProducts();
				showSection(sp);
			}else if("CUPONES".equals(actionCommand)) {
				SectionCoupons sc = new SectionCoupons();
				showSection(sc);
			}else if("ACERCA DE".equals(actionCommand)) {

			}else if("HORARIO".equals(actionCommand)) {
				SectionHorary sh = new SectionHorary();
				showSection(sh);
			}else if("COMPRAR".equals(actionCommand)) {
				
			}else if("MENU".equals(actionCommand)) {
				SectionMenu sm = new SectionMenu();
				showSection(sm);
			}
		}
	}
	
	public void showSection(JPanel p){
		content.setLayout(null);
		p.setBounds(0, 0, 1050, 400);
		content.removeAll();
		content.add(p);
		content.revalidate();
		content.repaint();
	}
}
