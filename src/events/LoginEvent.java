package events;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import bankGUI.*;
import details.Details;
import logic.*;
import appGUI.FrameMain;
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
	//CONSTRUCTOR PARA INICIAR DEDE EL BOTON LOGIN,APP
	public LoginEvent(JFrame frame,DataBus dataBus,JTextField logUser,JTextField logPass,JLabel jlMsg) {
		this.logUser = logUser;
		this.logPass = logPass;
		this.jlMsg = jlMsg;
		this.frame = frame;
		//this.jbLogin = jbLogin;
		this.dataBus = dataBus;
		accList = new AccountList();
	}
	//CONSTRUCTOR PARA CAMBIAR DE PANEL DE INICIO A REGISTRARSE
	public LoginEvent(JPanel content,JPanel p1,JPanel p2,JLabel label) {
		this.content = content;
		this.p1 = p1;
		this.p2 = p2;
		this.label = label;
	}
	//CONSTRUCTOR PARA INICIAR SESION EN EL BANCO
	public LoginEvent(JPanel content,JTextField logUser,JTextField logPass,JLabel jlMsg) {
		this.content = content;
		this.logUser = logUser;
		this.logPass = logPass;
		this.jlMsg = jlMsg;
		accList = new AccountList();
	}
	//CONSTRUCTOR PARA REGISTRARSE
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
	public void addNewUser() {
		accList.readFile();
		accList.insert(logData);
		accList.writeIFile();
		cleanTextField();
		showPanel(p1);
	}
	public void cleanTextField() {
		logUser.setText("");
		logPass.setText("");
		logFtName.setText("");
		logLtName.setText("");
		logBalance.setText("");
	}
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

	public void showPanel(JPanel p){
		content.setLayout(null);
		p.setBounds(0, 0, 900, 600);
		content.removeAll();
		content.add(p);
		content.revalidate();
		content.repaint();
	}
	
    public void mouseClicked (MouseEvent e) {
 	 showPanel(p2);
    }	
    
    @Override
    public void mouseEntered(MouseEvent e) {
 	  label.setForeground(new Color(255, 87, 51));
    	}
    
    @Override
    public void mouseExited(MouseEvent e) {	
        label.setForeground(new Color(153,153,153));
    }
}