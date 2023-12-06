package loginGUI;
import details.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import events.*;
import logic.*;
@SuppressWarnings("serial")
public class Login extends JFrame {
	private SignIn sign;
	private JPanel content;
	private Register regit;
	//CONSTRUCTOR
	public Login (DataBus dataBus) {
		UIManager.put("Button.select", new Color(191, 14, 0));
		content =new JPanel();
		sign = new SignIn ();
		regit = new Register ();
		setTitle("Sign In");
		setSize(800, 420);
		
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		content.setBounds(0, 0, 800, 420);
		showPanel(sign);
		LoginEvent lg = new LoginEvent(content,sign,regit,sign.lbHiperVinculo);
	    sign.lbHiperVinculo.addMouseListener(lg);
		sign.lbInicio.addMouseListener(lg);
		regit.botonCancelar.addActionListener(lg);
	    LoginEvent log = new LoginEvent(this,dataBus,sign.getJtfUser(),sign.getJtfPass(),sign.getJLMsg());
		sign.getJBInit().addActionListener(log);
		LoginEvent reg = new LoginEvent(content,sign,regit.txtUser,regit.txtPassword,regit.txtName,regit.txtLastName,
										regit.txtSaldoIni,regit.userMsg,regit.passMsg);
		regit.btnRegist.addActionListener(reg);
		this.add(content);
	}
	public void showPanel(JPanel p){
		content.setLayout(null);
		p.setBounds(0, 0, 800, 420);
		content.removeAll();
		content.add(p);
		content.revalidate();
		content.repaint();
	}
	
    /*=============================== METODO MAIN =======================================*/
	public static void main(String[] args) {
		Login frame = new Login(new DataBus());
		frame.setVisible(true); 
	}

}
