package loginGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import details.*;
import events.*;
@SuppressWarnings("serial")
public class Register extends JPanel {
	protected JLabel name, lastName, user, password, saldoIni, warning;
	protected JLabel lbTitle;
	protected JTextField txtName, txtLastName, txtUser, txtPassword, txtSaldoIni;
	//protected JRadioButton rbTerminoCd;
	protected JLabel userMsg,passMsg;
	//protected boolean jtfName=false,jtfLtName=false,jtfUser=false,jtfPass=false,jtfBalance=false;
	protected JLabel lbFondo;
	protected JtextfEvents event;
	public JButton botonCancelar;
	public JButton btnRegist;
	Details style = new Details ();
	//CONSTRUCTOR
	public Register () {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		lbFondo = new JLabel();
		lbFondo.setBounds(0, 0, 800, 420);
		lbFondo.setIcon(new Imagens("fondoblack.jpg",800,420).imagen());
		btnRegist = new JButton ("Registrate");
		userMsg = new JLabel("",SwingConstants.CENTER);
		passMsg = new JLabel("",SwingConstants.CENTER);
		style.loginFont_P(userMsg);
		style.loginFont_P(passMsg);
		iniComponent ();
		this.add(lbFondo);
		
	}
	
	
	private void iniComponent () {
		etiqDatos ();
		textFieldDatos (); 
		buttonDatos ();
		//radioButton ();
		botonVinculo ();
		event = new JtextfEvents(txtName,txtLastName,txtUser,txtPassword,txtSaldoIni,btnRegist);
        event.focusEvent(txtName, " Nombre");
        event.focusEvent(txtLastName, " Apellido");
		event.focusEvent(txtUser, " Usuario");
        event.focusEvent(txtPassword, " Contraseña");
        event.focusEvent(txtSaldoIni, " Saldo Inicial");
	}
	
	
	//METODO PARA LAS ETIQUETAS DE DATOS
	private void etiqDatos () {
	    
	    lbTitle = new JLabel ("CREA UNA NUEVA CUENTA");
		name = new JLabel ("Nombre: ");
		lastName = new JLabel ("Apellido: ");
		user = new JLabel ("Usuario: ");
		password = new JLabel ("Contraseña: ");
		saldoIni = new JLabel ("Saldo Inicial: ");
		warning = new JLabel ("Máximo 8-12 carácter");
		
		//POSICION  LUGAR DE LAS ETIQUETAS DE DATOS
		lbTitle.setBounds(60, 50, 310, 50);
		name.setBounds(60,100, 298,20);
		lastName.setBounds(60, 170, 298, 20);
		user.setBounds(60, 240, 298, 28);
		userMsg.setBounds(60, 305, 298, 20);
		password.setBounds(420, 100, 298, 20);
		passMsg.setBounds(420, 165, 298, 20);
		saldoIni.setBounds(420, 190, 298, 20);
		warning.setBounds(150, 245, 150, 20);
		warning.setForeground(new Color(131,131,131));
		warning.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		//ESTILO A LAS EITQUETA COMO FUENTE, TAMAÑO Y FORMA
		style.styleEtiquetaRegit(name);
		style.styleEtiquetaRegit(lastName);
		style.styleEtiquetaRegit(user);
		style.styleEtiquetaRegit(password);
		style.styleEtiquetaRegit(saldoIni);
		style.styleTitle(lbTitle);
		add(userMsg);
		add(passMsg);
		add(name);
		add(lastName);
		add(user);
		add(password);
		add(saldoIni);
		add(lbTitle);
		add(warning);
	}
	
	//METODOS PARA LOS TEXTFIELDS
	public void textFieldDatos () {
		txtName = new JTextField (" Nombre");
		txtLastName = new JTextField (" Apellido");
		txtUser = new JTextField (" Usuario");
		txtPassword = new JTextField (" Contraseña");
		txtSaldoIni = new JTextField (" Saldo Inicial");
		Details txtField = new Details();
		
		//BORDE Y  POSICIONES DE LOS TEXTFIELD DE DATOS
		txtName.setBounds(60,130,298,36);
		txtLastName.setBounds(60, 200, 298, 36);
		txtUser.setBounds(60, 270, 298, 36);
		txtPassword.setBounds(420, 130, 298, 36);
		txtSaldoIni.setBounds(420, 220, 298, 36);
		
        txtField.styleTextField(txtName);
        txtField.styleTextField(txtLastName);
        txtField.styleTextField(txtUser);
        txtField.styleTextField(txtPassword);
        txtField.styleTextField(txtSaldoIni);

        
        txtUser.addKeyListener( new KeyAdapter () {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtUser.getText().length() >= 12) {  //DICE QUE LA LONGITUD DE LA CADENA NO SUPERE EL LIMITE DE 10
					e.consume();
				}
			}
		});
        txtSaldoIni.addKeyListener(new KeyAdapter() {
        	
        	public void keyTyped(KeyEvent e) {
        		int key = e.getKeyChar();
        		boolean num = key >= 48 && key <= 57;
        		if(!num) {
        			e.consume();
        		}
        	}
        });
      

		this.add(txtName);
		this.add(txtLastName);
		this.add(txtUser);
		this.add(txtPassword);
		this.add(txtSaldoIni);
	}
	
	//METODO PARA LOS BOTONES
	public void buttonDatos () {
		
		btnRegist.setBounds(420, 290, 140, 55);
        Details btn = new Details();
        btn.jbBorderRed(btnRegist);
		this.add(btnRegist);
		btnRegist.setEnabled(false);
	}
	
	//METODO PARA EL RADIOBUTTON
	/*private void radioButton () {
		//btnRegist = new JButton ("Regístrate");
		rbTerminoCd = new JRadioButton ("Acepto todos los terminos y condiciones");
		rbTerminoCd.setBounds(420, 240, 298, 36);
        rbTerminoCd.setForeground(new Color(153,153,153));
		rbTerminoCd.setFocusable (false);
		rbTerminoCd.setOpaque(false);
		this.add(rbTerminoCd);
	}*/
    private void botonVinculo (){
        Details botonCan = new Details();
        botonCancelar = new JButton ("Tengo una cuenta");
        botonCancelar.setBounds(580, 290, 140, 55);
        botonCan.jbBorderRed(botonCancelar);
        this.add(botonCancelar);
    }
}
