package appGUI;
import java.awt.*;
import javax.swing.*;
import details.*;
import events.*;
import loginGUI.Login;
import logic.*;
import bankGUI.*;
import principal.Menu_Bar;
/**
 * Clase principal, en la que se muestran las secciones INICIO, ACERCA DE, HORARIO, MENU, COMPRAR e INICIAR SESION.
 * Tambien contiene Menubar para cambiar de Frame y dos paneles uno con el encabezado y otro con el contenido.
 */
public class FrameMain extends JFrame{
	private JPanel jpHeader;
	private JPanel jpContent;
	private JButton jbInit,jbAbout,jbHorary,jbFb,jbTw,jbIg,jbLogin;
	private JLabel jlLogo,jlAppName;
	private DataBus busData;
	private int index;
	private boolean resetFacture;
	public FrameMain(String title){
		super(title);
		this.setLayout(null);
		this.setBackground(Color.BLACK);
		//------------------------------------------PANEL CON EL ENCABEZADO
		jpHeader = new JPanel();
		jpHeader.setBounds(0, 0, 1050, 100);
		jpHeader.setLayout(null);
		//instanciando componentes del panel encabezado
		jbInit = new JButton("INICIO");
		jbAbout = new JButton("ACERCA DE");
		jbHorary = new JButton("HORARIO");
		jbLogin = new JButton("Iniciar sesion");
		jbFb = new JButton();//facebook
		jbTw = new JButton();//twiter (x)
		jbIg = new JButton();//instagram
		jlLogo = new JLabel();
		jlAppName = new JLabel("LA CABAÑITA");
		//colocando direccion
		jlLogo.setBounds(40, 20, 40, 40);
		jbInit.setBounds(150, 20, 100, 30);
		//jbCoupon.setBounds(270, 20, 100, 30);
		jbAbout.setBounds(270, 20, 100, 30);
		jlAppName.setBounds(500, 20, 150, 30);
		jbHorary.setBounds(690, 20, 100, 30);
		jbFb.setBounds(960, 0, 25, 25);
		jbTw.setBounds(960, 30, 25, 25);
		jbIg.setBounds(960, 60, 25, 25);
		jbLogin.setBounds(825, 20, 120,30);
		//detalles del Contenido
		jlLogo.setIcon(new Imagens("Logo.png",jlLogo.getWidth(),jlLogo.getHeight()).imagen());
		jbFb.setIcon(new Imagens("icon-fb.png",10,15).imagen());
		jbTw.setIcon(new Imagens("icon-tw.png",15,15).imagen());
		jbIg.setIcon(new Imagens("icon-ig.png",15,15).imagen());
		Details c = new Details();
		c.appName(jlAppName);
		c.jbBorderWhite(jbInit);
		//c.jbBorderWhite(jbCoupon);
		c.jbBorderWhite(jbAbout);
		c.jbBorderWhite(jbHorary);
		c.jbBorderRed(jbFb);
		c.jbBorderRed(jbTw);
		c.jbBorderRed(jbIg);
		c.jbBorderRed(jbLogin);
		//agregando al jpHeader
		jpHeader.add(jlLogo);
		jpHeader.add(jbInit);
		//jpHeader.add(jbCoupon);
		jpHeader.add(jbAbout);
		jpHeader.add(jlAppName);
		jpHeader.add(jbHorary);
		jpHeader.add(jbFb);
		jpHeader.add(jbTw);
		jpHeader.add(jbIg);
		jpHeader.add(jbLogin);
		
		//------------------------------------------PANEL CON LAS SECCIONES
		jpContent = new JPanel();
		jpContent.setBounds(0, 100, 1050, 490);
		jpContent.setLayout(null);
		SectionProducts stProducts = new SectionProducts();
		SectionMenu stMenu = new SectionMenu();
		SectionHorary stHorary = new SectionHorary();
		SectionAboutUs stAbout = new SectionAboutUs();
		busData = new DataBus(jbLogin,stProducts,jpContent,index,resetFacture);
		SectionBuy stBuy = new SectionBuy(busData);
		//Login login = new Login(jbLogin);
		Login login = new Login(busData);
		//showSection(sp);
		stProducts.setBounds(0, 0, 1050, 400);
		jpContent.add(stProducts);
		jpHeader.setBackground(Color.BLACK);
		jpContent.setBackground(Color.BLACK);
		//====================================== agragando paneles al frame
		this.add(jpHeader);
		this.add(jpContent);
		//======================================
		Menu_Bar menubar = new Menu_Bar(this);
		this.setJMenuBar(menubar);
		//====================================== agregando eventos
		//FrameEvent fe = new FrameEvent(jpContent,stProducts,stAbout,stHorary,stMenu,stBuy,login,jbLogin);
		FrameEvent fe = new FrameEvent(busData,stProducts,stAbout,stHorary,stMenu,stBuy,login); 
		jbInit.addActionListener(fe);
		//jbCoupon.addActionListener(fe);
		jbAbout.addActionListener(fe);
		jbHorary.addActionListener(fe);
		stProducts.jbMenu.addActionListener(fe);
		stProducts.jbBuy.addActionListener(fe);
		jbLogin.setActionCommand("LOGIN");
		jbLogin.addActionListener(fe);
	}
}
