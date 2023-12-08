package events;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import logic.*;
/**
 * Clase para los eventos de administracion en el BANCO.
 */
public class BankEvent implements ActionListener{
	private JTextField txtName, txtLastName, txtUser, txtPassword, txtSaldoIni;
	private AccountTable table;
	private JButton jbModify,jbAdd;
	/**
	 * Constructor que recibe los datos para insertar, modificar o borrar de la tabla.
	 * @param table. Parametro para obtener la tabla de cuentas.
	 * @param txtName. Parametro para datos del Nombre.
	 * @param txtLastName. Parametro para datos del Apellido.
	 * @param txtUser. Parametro para datos del Usuario.
	 * @param txtPassword. Parametro para datos de la contraseña.
	 * @param txtSaldoIni. Parametro para datos del Monto.
	 * @param jbModify. Parametro para Habilitar y Desabilitar boton de modificar.
	 * @param jbAdd. Parametro para Habilitar y Desabilitar boton de agregar.
	 */
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
}
