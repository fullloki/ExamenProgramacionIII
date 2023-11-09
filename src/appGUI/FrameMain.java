package appGUI;
import java.awt.*;
import javax.swing.*;
public class FrameMain extends JFrame{
	private JPanel jpHeader;
	private JPanel jpContent;
	public FrameMain(String title){
		super(title);
		this.setLayout(null);
		jpHeader = new JPanel();
		jpContent = new JPanel();
		SectionProducts sp = new SectionProducts();
		showPanel(sp);
		jpHeader.setBackground(Color.BLUE);
		jpContent.setBackground(Color.BLACK);
		
		jpHeader.setBounds(0, 0, 1050, 100);
		jpContent.setBounds(0, 100, 1050, 490);
		
		this.add(jpHeader);
		this.add(jpContent);
	}
	public void showPanel(JPanel p){
		jpContent.setLayout(null);
		p.setBounds(0, 0, 1050, 400);
		jpContent.removeAll();
		jpContent.add(p);
		jpContent.revalidate();
		jpContent.repaint();
	}
}
