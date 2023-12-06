package bankGUI;
import java.awt.*;
import javax.swing.*;
import details.*;
import events.*;
import logic.*;
import loginGUI.*;
public class BankAdmin extends Register{
	private JButton jbAdd,jbEdit,jbModify,jbDelet,jbClean;
	public JPanel panel1,panel2;
	private BankEvent bankEvent;
	private AccountTable table; 
	
	Details style = new Details();
	public BankAdmin () {
		super();
		removeAll();
		this.setSize(900,600);
		this.setLayout(null);
		this.setBackground(Color.BLACK);
		//===============================================================
		JLabel jlTitle = new JLabel("Cuentas de BankNismo");
		//back = new JButton("REGRESAR");
		//---------------------------------------------
		//style.bankAdmindButtons(back);
		style.loginFont_H1(jlTitle);
		//---------------------------------------------
		//back.setBounds(0, 10, 100, 30);
		jlTitle.setBounds(280, 50, 340, 30);
		//--------------------------------------------
		//this.add(back);
		this.add(jlTitle);
		//=====================================================
		table = new AccountTable();
		
		//=====================================================
		JScrollPane scroll = new JScrollPane(table.getTable(),JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(100, 320, 700, 200);
		scroll.getViewport().setBackground(Color.DARK_GRAY);
		this.add(scroll);
		//======================================================
		panel1 = new JPanel();
		panel2 = new JPanel();
		//panel1.setVisible(true);
		this.add(panel1);
		this.add(panel2);
		//txtName.setText("");
		
		//list.readFile();
		iniciarComponentes();
		revalidate();
		repaint();
	}
			
	private void iniciarComponentes() {
		panel1();
		panel2();
		colocarBotones();
		heredaciones();
	}
		
	
	private void  panel1() {
		
		panel1.setLayout(null);
		panel1.setBounds(100, 285, 700, 40);
		panel1.setBackground(null);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void colocarBotones() {
		jbAdd = new JButton();
		//boton1.setLayout(null);
		jbAdd.setBounds(0,0,80,30);
		jbAdd.setText("Agregar");
		style.bankAdmindButtons(jbAdd);
		jbAdd.setEnabled(false);
		panel1.add(jbAdd);
		
		
		jbEdit = new JButton();
		jbEdit.setBounds(100,0,80,30);
		jbEdit.setText("Editar");
		style.bankAdmindButtons(jbEdit);
		panel1.add(jbEdit);
		
		jbModify = new JButton();
		jbModify.setBounds(200,0,80,30);
		jbModify.setText("Modificar");
		style.bankAdmindButtons(jbModify);
		panel1.add(jbModify);
		jbModify.setEnabled(false);
		
		jbClean = new JButton();
		jbClean.setBounds(300,0,80,30);
		jbClean.setText("Limpiar");
		style.bankAdmindButtons(jbClean);
		panel1.add(jbClean);
		
		jbDelet = new JButton();
		jbDelet.setBounds(620,0,80,30);
		jbDelet.setText("Eliminar");
		style.bankAdmindButtons(jbDelet);
		panel1.add(jbDelet);
		
	   // JLabel etiqueta1 = new JLabel();
	    //etiqueta1.setIcon(new Imagens("gtr.png",450,280).imagen());
	    //etiqueta1.setBounds(420,70,450,300);
	   // panel1.add(etiqueta1);
		bankEvent = new BankEvent(table,txtName,txtLastName,txtUser,txtPassword,txtSaldoIni,jbModify,jbAdd);
		event = new JtextfEvents(txtName,txtLastName,txtUser,txtPassword,txtSaldoIni,jbAdd);
	    jbAdd.addActionListener(bankEvent);
	    jbEdit.addActionListener(bankEvent);
	    jbModify.addActionListener(bankEvent);
	    jbDelet.addActionListener(bankEvent);
	    jbClean.addActionListener(bankEvent);
	}

   	private void panel2() {
   		panel2.setLayout(null);
   		panel2.setBounds(100, 80, 700, 200);
   		panel2.setBackground(null);
	}
   	private void heredaciones() {
   		name.setLocation(5,0);
   		txtName.setLocation(5, 25);
   		lastName.setLocation(5, 65);
   		txtLastName.setLocation(5, 90);
   		user.setLocation(5, 130);
   		userMsg.setLocation(20,130);
   		txtUser.setLocation(5, 160);
   		password.setLocation(400,0);
   		txtPassword.setLocation(400, 25);
   		//saldoIni.setText("Nuevo Monto");
   		saldoIni.setLocation(400, 65);
   		txtSaldoIni.setLocation(400,90);
   		//style.focusEvent(txtSaldoIni,"Nuevo Monto");
   		
   		
   		panel2.add(name);
   		panel2.add(txtName);
   		panel2.add(lastName);
   		panel2.add(txtLastName);
   		panel2.add(user);
   		panel2.add(txtUser);
   		panel2.add(password);
   		panel2.add(txtPassword);
   		panel2.add(saldoIni);
   		panel2.add(txtSaldoIni);
   	}
}