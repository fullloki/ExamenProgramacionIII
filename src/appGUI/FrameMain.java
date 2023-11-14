package appGUI;
import java.awt.*;
import javax.swing.*;
import details.*;
import events.*;
public class FrameMain extends JFrame{
	private JPanel jpHeader;
	private JPanel jpContent;
	private JButton jbInit,jbCoupon,jbAbout,jbHorary,jbFb,jbTw,jbIg;
	private JLabel jlLogo,jlAppName;
	public FrameMain(String title){
		super(title);
		this.setLayout(null);
		//------------------------------------------PANEL CON EL ENCABEZADO
		jpHeader = new JPanel();
		jpHeader.setBounds(0, 0, 1050, 100);
		jpHeader.setLayout(null);
		//instanciando componentes del panel 
		jbInit = new JButton("INICIO");
		jbCoupon = new JButton("CUPONES");
		jbAbout = new JButton("ACERCA DE");
		jbHorary = new JButton("HORARIO");
		jbFb = new JButton();//facebook
		jbTw = new JButton();//twiter (x)
		jbIg = new JButton();//instagram
		jlLogo = new JLabel();
		jlAppName = new JLabel("LA CABAÑITA");
		//colocando direccion
		jlLogo.setBounds(40, 20, 40, 40);
		jbInit.setBounds(150, 20, 100, 30);
		jbCoupon.setBounds(270, 20, 100, 30);
		jbAbout.setBounds(390, 20, 100, 30);
		jlAppName.setBounds(500, 20, 150, 30);
		jbHorary.setBounds(690, 20, 100, 30);
		jbFb.setBounds(825, 25, 25, 25);
		jbTw.setBounds(865, 25, 25, 25);
		jbIg.setBounds(905, 25, 25, 25);
		//detalles del Contenido
		jlLogo.setIcon(new Imagens("Logo.png",jlLogo.getWidth(),jlLogo.getHeight()).imagen());
		jbFb.setIcon(new Imagens("icon-fb.png",10,15).imagen());
		jbTw.setIcon(new Imagens("icon-tw.png",15,15).imagen());
		jbIg.setIcon(new Imagens("icon-ig.png",15,15).imagen());
		Colors c = new Colors();
		jlAppName.setForeground(Color.WHITE);
		c.jbBorderWhite(jbInit);
		c.jbBorderWhite(jbCoupon);
		c.jbBorderWhite(jbAbout);
		c.jbBorderWhite(jbHorary);
		c.jbBorderRed(jbFb);
		c.jbBorderRed(jbTw);
		c.jbBorderRed(jbIg);
		//agregando al jpHeader
		add(jlLogo);
		add(jbInit);
		add(jbCoupon);
		add(jbAbout);
		add(jlAppName);
		add(jbHorary);
		add(jbFb);
		add(jbTw);
		add(jbIg);
		//------------------------------------------PANEL CON LAS SECCIONES
		jpContent = new JPanel();
		jpContent.setBounds(0, 100, 1050, 490);
		jpContent.setLayout(null);
		SectionProducts sp = new SectionProducts();
		//SectionCoupons sc = new SectionCoupons();
		//SectionMenu sm = new SectionMenu();
		//SectionHorary sh = new SectionHorary();
		//showSection(sp);
		sp.setBounds(0, 0, 1050, 400);
		jpContent.add(sp);
		jpHeader.setBackground(Color.BLACK);
		jpContent.setBackground(Color.BLACK);
		//====================================== agragando paneles al frame
		this.add(jpHeader);
		this.add(jpContent);
		//====================================== agregando eventos
		FrameEvent fe = new FrameEvent(jpContent); 
		jbInit.addActionListener(fe);
		jbCoupon.addActionListener(fe);
		jbAbout.addActionListener(fe);
		jbHorary.addActionListener(fe);
	}
}
