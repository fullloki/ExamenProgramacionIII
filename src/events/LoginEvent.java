package events;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import bankGUI.*;
import details.Details;
import logic.*;
import appGUI.FrameMain;
/**
 * Clase con los eventos de inicio de sesion del banco y del restaurante.
 */
public class LoginEvent extends MouseAdapter implements ActionListener,MouseListener{
	private JPanel content;
	private Admins adm;
	private JPanel p1,p2;
	private JLabel label,jlMsg;
	private Account logData;
	private JTextField logUser,logPass,logFtName,logLtName,logBalance;
	private JFrame frame;
	private JLabel userMsg,passMsg;
	private DataBus dataBus;
	AccountList accList;
	Details style = new Details();
	
	/**
	 * CONSTRUCTOR PARA INICIAR DEDE EL BOTON LOGIN,APP
	 * @param frame - Parametro para cerrar Frame del login.
	 * @param dataBus - Parametro para asignar usuario al texto del boton "Iniciar sesion".
	 * @param logUser - Parametro para usuarios insertados.
	 * @param logPass - Parametro para contraseñas insertadas.
	 * @param jlMsg - Parametro para enviar alerta.
	 */
	public LoginEvent(JFrame frame,DataBus dataBus,JTextField logUser,JTextField logPass,JLabel jlMsg) {
		this.logUser = logUser;
		this.logPass = logPass;
		this.jlMsg = jlMsg;
		this.frame = frame;
		//this.jbLogin = jbLogin;
		this.dataBus = dataBus;
		accList = new AccountList();
	}
	/**
	 * CONSTRUCTOR PARA CAMBIAR DE PANEL DE INICIO A REGISTRARSE
	 * @param content - Parametro para mostrar contenido.
	 * @param p1 - Parametro para mostrar panel de inicio de sesion.
	 * @param p2 - Parametro para mostrar panel de registro.
	 * @param label - Parametro para hipervinculo.
	 */
	public LoginEvent(JPanel content,JPanel p1,JPanel p2,JLabel label) {
		this.content = content;
		this.p1 = p1;
		this.p2 = p2;
		this.label = label;
	}
	/**
	 * CONSTRUCTOR PARA INICIAR SESION EN EL BANCO
	 * @param content - Parametro para mostrar contenido.
	 * @param logUser - Parametro para usuarios insertados.
	 * @param logPass - Parametro para contraseñas insertadas.
	 * @param jlMsg - Parametro para enviar alerta.
	 */
	public LoginEvent(JPanel content,JTextField logUser,JTextField logPass,JLabel jlMsg) {
		this.content = content;
		this.logUser = logUser;
		this.logPass = logPass;
		this.jlMsg = jlMsg;
		accList = new AccountList();
	}
	/**
	 * CONSTRUCTOR PARA REGISTRARSE
	 * @param content - Parametro para mostrar contenido.
	 * @param p1 - Parametro para mostrar panel de inicio de sesion.
	 * @param logUser - Parametro para usuarios insertados.
	 * @param logPass - Parametro para contraseñas insertadas.
	 * @param logFtName - Parametro para nombres insertados.
	 * @param logLtName - Parametro para apellidos insertados.
	 * @param logBalance - Parametro para balances insertados.
	 * @param userMsg - Parametro para alerta de usuario repetido
	 * @param passMsg - Parametro para alerta de contraseña repetida.
	 */
	public LoginEvent(JPanel content,JPanel p1,JTextField logUser,JTextField logPass,JTextField logFtName
						,JTextField logLtName,JTextField logBalance,JLabel userMsg,JLabel passMsg) {
		this.content = content;
		this.p1 = p1;
		this.logUser = logUser;
		this.logPass = logPass;
		this.logFtName = logFtName;
		this.logLtName = logLtName;
		this.logBalance = logBalance;
		this.userMsg = userMsg;
		this.passMsg = passMsg;
		accList = new AccountList();
	}
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(e.getSource() instanceof JButton) {
			if("Ingresar".equals(actionCommand)) {//<-- Iniciar como usuario
				accList = new AccountList();
				accList.readFile();
				logData = new Account(logUser.getText().trim(),logPass.getText().trim());
				accList.searcher(logData);
				verifyLogin(logUser.getText().trim());
				logUser.setText("");
				logPass.setText("");
			}if("Registrate".equals(actionCommand)) {
				accList.readFile();
				logData = new Account(logUser.getText().trim(),logPass.getText().trim(),logFtName.getText().trim(),
									logLtName.getText().trim(),Double.parseDouble(logBalance.getText()));
				veyfyRegistre();
			}else if("Tengo una cuenta".equals(actionCommand)) {
				showPanel(p1);
			}else if ("INICIAR".equals(actionCommand)) {//<-- INICIAR como administrador
				adm = new Admins(logUser,logPass,jlMsg);
				adm.validate();
				if(adm.getActive()) {
					BankAdmin ba = new BankAdmin();
					showPanel(ba);
				}
				logUser.setText("");
				logPass.setText("");
			}

		}
	}
	/**
	 * METODO PARA VERIFICAR USUARIO
	 */
	public void veyfyRegistre() {
		accList.valideUser(logData);
		accList.validePass(logData);
		if(accList.getValideUser()) {
			//System.out.println("Usuario en uso probar otro");
			userMsg.setText("Usuario en uso probar otro");
			userMsg.setForeground(Color.RED);
		}else userMsg.setText("");
		if(accList.getValidePass()) {
			//System.out.println("Contraseña en uso probar otra");
			passMsg.setText("Contraseña en uso probar otra");
			passMsg.setForeground(Color.RED);
		}else passMsg.setText("");
		if(!accList.getValidePass() && !accList.getValideUser()) {
			//System.out.println("agregar usuario");
			addNewUser();
		}
	}
	/**
	 * METODO PARA AGREGAR USUARIO.
	 */
	public void addNewUser() {
		accList.readFile();
		accList.insert(logData);
		accList.writeIFile();
		cleanTextField();
		showPanel(p1);
	}
	/**
	 * METODO PARA LIMPIAR TEXTFIELDS
	 */
	public void cleanTextField() {
		logUser.setText("");
		logPass.setText("");
		logFtName.setText("");
		logLtName.setText("");
		logBalance.setText("");
	}
	/**
	 * METODO PARA VERIFICAR INICIO DE ADMINISTRADORES
	 * @param logUser
	 */
	public void verifyLogin(String logUser) {
		if(!accList.getExists()) {
			jlMsg.setText("Usuario o contraseña no valida");
			jlMsg.setForeground(Color.RED);
		//	System.out.println(accList.getList());
		}else {
			jlMsg.setText("");
			frame.dispose();
			dataBus.jbtn.setText(logUser);
			style.jbuttonLogIn(dataBus.jbtn);
			dataBus.setIndex(accList.getAccountIndex());
			dataBus.resetFacture = false;
		//	System.out.println(accList.getAccountIndex());
		}
	}
	/**
	 * METODO PARA MOSTRAR PANEL
	 * @param p. Parametro para asignar panel a mostrar.
	 */
	public void showPanel(JPanel p){
		content.setLayout(null);
		p.setBounds(0, 0, 900, 600);
		content.removeAll();
		content.add(p);
		content.revalidate();
		content.repaint();
	}
	/**
	 * METODO PARA IR AL REGISTRO
	 */
    public void mouseClicked (MouseEvent e) {
 	 showPanel(p2);
    }	
    /**
     * METODO PARA ENFOCAR HIPERVINCULO
     */
    @Override
    public void mouseEntered(MouseEvent e) {
 	  label.setForeground(new Color(255, 87, 51));
    	}
    /**
     * METODO PARA DESENFOCAR HIPERVINCULO
     */
    @Override
    public void mouseExited(MouseEvent e) {	
        label.setForeground(new Color(153,153,153));
    }
}