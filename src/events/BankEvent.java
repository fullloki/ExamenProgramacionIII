package events;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import logic.*;
public class BankEvent implements ActionListener{
	private JTextField txtName, txtLastName, txtUser, txtPassword, txtSaldoIni;
	private AccountTable table;
	//private Account account;
	private JButton jbModify,jbAdd;
	public BankEvent(AccountTable table,JTextField txtName,JTextField txtLastName,
			JTextField txtUser,JTextField txtPassword,JTextField txtSaldoIni,JButton jbModify,JButton jbAdd){
		this.jbModify = jbModify;
		this.jbAdd = jbAdd;
		this.table = table;
		this.txtName = txtName;
		this.txtLastName = txtLastName;
		this.txtUser = txtUser;
		this.txtPassword = txtPassword;
		this.txtSaldoIni = txtSaldoIni;
	}
	
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(e.getSource() instanceof JButton) {
			if("Agregar".equals(actionCommand)) {
				//addAccount();
				table.addAccountRow(new Account(txtUser.getText().trim(),txtPassword.getText().trim(),
												txtName.getText().trim(),txtLastName.getText().trim(),
												Double.parseDouble(txtSaldoIni.getText())));
			}else if ("Editar".equals(actionCommand)) {
				table.editAccountRow(txtName,txtLastName,txtUser,txtPassword,txtSaldoIni);
				jbModify.setEnabled(true);
			}else if ("Modificar".equals(actionCommand)) {
				table.modifyAccountRow(txtName, txtLastName, txtUser, txtPassword, txtSaldoIni);
				jbModify.setEnabled(false);
			}else if ("Eliminar".equals(actionCommand)) {
				table.deletAccountRow();
			}else if("Limpiar".equals(actionCommand)) {
				table.cleanJtextField(txtName, txtLastName, txtUser, txtPassword, txtSaldoIni);
				jbModify.setEnabled(false);
				jbAdd.setEnabled(false);
			}
		}
	}
	/*private void addAccount() {
		//account = ;
	}*/
}
