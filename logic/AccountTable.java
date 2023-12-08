package logic;

import java.awt.Color;
import javax.swing.*;
import javax.swing.table.*;
/**
 * Clase para crear tabla de cuentas
 */
public class AccountTable {
	private String columName[] = {"Usuario","Contraseñas","Nombre","Apellido","Monto"};
	private Object rowData[][];
	private JTable table;
	private DefaultTableModel dtm;
	private Object[] obj = new Object[5];
	private int rowSelected=-1;
	AccountList list = new AccountList();
	public AccountTable() {
		list.fileExist();
		list.readFile();
		//if(list.getList().size()>20) {
			rowData = new Object[list.getList().size()][5];
		//}else rowData = new Object[20][4];
		for(int i = 0; i < list.getList().size(); i++ ) {
			rowData[i][0] = list.getList().get(i).getUser();
			rowData[i][1] = list.getList().get(i).getPass();
			rowData[i][2] = list.getList().get(i).getFtName();
			rowData[i][3] = list.getList().get(i).getLtName();
			rowData[i][4] = list.getList().get(i).getBalance();
		}
		dtm = new DefaultTableModel(rowData,columName) {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		table = new JTable();
		table.setModel(dtm);
		table.getTableHeader().setBackground(Color.BLACK);
		table.getTableHeader().setForeground(Color.WHITE);
		table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.WHITE);
		//dtm.fireTableDataChanged();
		//table.setModel(dtm);
	}
	/**
	 * METODO PARA AGREGAR UNA CUENTA A LA TABLE
	 * @param data - Parametro con los datos de la cuenta.
	 */
	public void addAccountRow(Account data) {
		if(!list.fileExist())list.makeFile();
		list.readFile();
		list.searcher(data);
		//------------------------------------------
		list.valideUser(data);
		list.validePass(data);
		if(list.getValideUser()) {
			//System.out.println("Usuario en uso probar otro");
			JOptionPane.showMessageDialog(null,"Usuario en uso probar otro","ERROR AL AGREGAR USUARIO",JOptionPane.ERROR_MESSAGE);
		}
		if(list.getValidePass()) {
			//System.out.println("Contraseña en uso probar otra");
			JOptionPane.showMessageDialog(null,"Contraseña en uso probar otra","ERROR AL AGREGAR CONTRASEÑA",JOptionPane.ERROR_MESSAGE);
		}
		if(!list.getValidePass() && !list.getValideUser()) {
			list.insert(data);
			list.writeIFile();
			obj[0] = data.getUser().trim();
			obj[1] = data.getPass().trim();
			obj[2] = data.getFtName().trim();
			obj[3] = data.getLtName().trim();
			obj[4] = data.getBalance();
			dtm.addRow(obj);
		}
	}
	/**
	 * METODO PARA BORRAR CUENTA DE LA TABLA
	 */
	public void deletAccountRow() {
		if(table.getSelectedRow()==-1) {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado una cuenta de la tabla","ERROR AL BORRAR",JOptionPane.ERROR_MESSAGE);
		}else {
			list.delet(table.getSelectedRow());
			dtm.removeRow(table.getSelectedRow());
			list.writeIFile();
		}
	}
	/**
	 * METODO PARA EDITAR DATOS DE LA CUENTA SELECCIONADA
	 * @param txtName - Parametro para cargar nombre de la table.
	 * @param txtLastName - Parametro para cargar apellido de la table.
	 * @param txtUser - Parametro para cargar usuario de la table.
	 * @param txtPassword - Parametro para cargar contraseña de la table.
	 * @param txtSaldoIni - Parametro para cargar balance de la table.
	 */
	public void editAccountRow(JTextField txtName,JTextField txtLastName,
			JTextField txtUser,JTextField txtPassword,JTextField txtSaldoIni) {
		
		if(table.getSelectedRow()==-1) {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado una cuenta de la tabla","ERROR AL EDITAR",JOptionPane.ERROR_MESSAGE);
		}else {
			rowSelected = table.getSelectedRow();
			txtUser.setText    (dtm.getValueAt(table.getSelectedRow(), 0).toString());
			txtPassword.setText(dtm.getValueAt(table.getSelectedRow(), 1).toString());
			txtName.setText    (dtm.getValueAt(table.getSelectedRow(), 2).toString());
			txtLastName.setText(dtm.getValueAt(table.getSelectedRow(), 3).toString());
			txtSaldoIni.setText(dtm.getValueAt(table.getSelectedRow(), 4).toString());
			//modifyAccountRow(txtName,txtLastName,txtUser,txtPassword,txtSaldoIni);
		}
	}
	/**
	 * METODO PARA MODIFICAR CUENTA SELECCIONADA
	 * @param txtName - Parametro para modificar nombre.
	 * @param txtLastName - Parametro para modificar apellido.
	 * @param txtUser - Parametro para modificar usuario.
	 * @param txtPassword - Parametro para modificar contraseña.
	 * @param txtSaldoIni - Parametro para modificar balance.
	 */
	public void modifyAccountRow(JTextField txtName,JTextField txtLastName,
			JTextField txtUser,JTextField txtPassword,JTextField txtSaldoIni) {
		if(table.getSelectedRow()==-1) {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado una cuenta de la tabla","ERROR AL Modificar",JOptionPane.ERROR_MESSAGE);
		}else {
			dtm.setValueAt(    txtUser.getText().trim(), rowSelected, 0);
			dtm.setValueAt(txtPassword.getText().trim(), rowSelected, 1);
			dtm.setValueAt(    txtName.getText().trim(), rowSelected, 2);
			dtm.setValueAt(txtLastName.getText().trim(), rowSelected, 3);
			dtm.setValueAt(txtSaldoIni.getText().trim(), rowSelected, 4);
		}
		list.readFile();
		list.getList().get(rowSelected).setUser(txtUser.getText());
		list.getList().get(rowSelected).setPass(txtPassword.getText());
		list.getList().get(rowSelected).setFtName(txtName.getText());
		list.getList().get(rowSelected).setLtName(txtLastName.getText());
		list.getList().get(rowSelected).setBalance(Double.parseDouble(txtSaldoIni.getText()));
		list.writeIFile();
		rowSelected = -1;
	}
	/**
	 * METODO PARA LIMPIAR TEXTFIELDS.
	 * @param txtName
	 * @param txtLastName
	 * @param txtUser
	 * @param txtPassword
	 * @param txtSaldoIni
	 */
	public void cleanJtextField(JTextField txtName,JTextField txtLastName,
			JTextField txtUser,JTextField txtPassword,JTextField txtSaldoIni) {
		txtUser.setText    ("");
		txtPassword.setText("");
		txtName.setText    ("");
		txtLastName.setText("");
		txtSaldoIni.setText("");
	}
	public JTable getTable() {
		return table;
	}
}

