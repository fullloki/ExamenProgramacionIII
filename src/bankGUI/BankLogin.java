package bankGUI;
import java.awt.*;
import javax.swing.*;
import loginGUI.*;
import details.*;
import events.*;
/**
 * Clase que contiene el Inicio de sesion del banco.
 */
public class BankLogin extends SignIn{
	private JLabel jlBankNismo;
	//private JLabel jlMsg;
	Details style = new Details();
	public BankLogin() {
		super();
		removeAll();
		this.setBackground(Color.black);
		this.setBounds(0, 0, 900, 600);
		//==========================================================
		jlBankNismo = new JLabel("BankNismo");
		jlBankNismo.setBounds(695, 0, 200, 50);
		jlBankNismo.setForeground(Color.WHITE);
		jlBankNismo.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,30));
		this.add(jlBankNismo);
		//========================================================== HEREDACIONES
		//---------------------------------------cambiando imagen
		lbImagen4.setIcon(new Imagens("gtr.png",500,300).imagen());
		lbImagen4.setBounds(195,10,500,100);
		//---------------------------------------cambiando titulo
		lbTitle.setText("AdminLogin");
		style.loginFont_H1(lbTitle);
		lbTitle.setBounds(360, 90, 250, 31);
		//---------------------------------------cambiando subtitulo
		lbSubTitle.setText("Cuenta de administrador");
		style.loginFont_P(lbSubTitle);
		lbSubTitle.setBounds(380, 125, 250, 30);
		//---------------------------------------cambiando etiqueta y textfield de insertar nombre
		lbUser.setLocation(320, 190);
		lbWarning.setLocation(380, 195);
		style.loginFont_P(lbUser);
		txtUser.setBounds(320, 215,250,40);
		lbImagen1.setLocation(580, 220);
		style.loginJTextField(txtUser);
		//---------------------------------------cambiando etiqueta y textfield de insertar contraseña
		lbPassword.setLocation(320, 250);
		style.loginFont_P(lbPassword);
		txtPassword.setBounds(320, 275,250,40);
		lbImagen2.setLocation(580, 285);
		lbImagen3.setLocation(580, 285);
		style.loginJTextField(txtPassword);
		//---------------------------------------cambiando mensaje
		lbMsg = new JLabel("iniciar sesion",SwingConstants.CENTER);
		style.loginFont_P(lbMsg);
		lbMsg.setBounds(350, 320,200,20);
		//---------------------------------------cambiando boton de iniciar
		btnIngresar.setBounds(385, 350, 130, 35);
		btnIngresar.setText("INICIAR");
		//==========================================================
		this.add(lbTitle);
		this.add(lbSubTitle);
		this.add(lbImagen4);
		this.add(lbUser);
		this.add(lbWarning);
		this.add(txtUser);
		this.add(lbImagen1);
		this.add(lbPassword);
		this.add(txtPassword);
		this.add(lbImagen2);
		this.add(lbImagen3);
		this.add(btnIngresar);
		this.add(lbMsg);
		//==========================================================
		
		//==========================================================
		revalidate();
		repaint();
	}


}
