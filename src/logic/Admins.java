package logic;

import java.awt.*;
import javax.swing.*;
/**
 * Clase con los datos de cuenta de administradores
 */
public class Admins {
	private String adm []={"Asbel","Antonio","Jeremy","Pamela"};
	private String key []={"810061766","81003690","89711073","810081973"};
	private JTextField user,pass;
	private JLabel jlMsg;
	private boolean active;
	/**
	 * CONSTRUCTOR PARA OBTENER DATOS INSERTADOS
	 * @param user - Parametro para el usuario.
	 * @param pass - Parametro para el contraseña.
	 * @param jlMsg - Parametro el mensaje de error.
	 */
	public Admins(JTextField user,JTextField pass,JLabel jlMsg) {
		this.user = user;
		this.pass = pass;
		this.jlMsg = jlMsg;
	}
	/**
	 * METODO PARA VALIDAR EL ADMINISTRADOR
	 */
	public void validate() {
		for(int i = 0; i < 4;i++) {
			if(adm[i].equals(user.getText()) && key[i].equals(pass.getText())) {
				//jlMsg.setText("Vienvenido "+adm[i]);
				//jlMsg.setForeground(Color.WHITE);
				jlMsg.setText("");
				active = true;
				break;
			}else {
				jlMsg.setText("Nombre o contraseña incorrecta");
				jlMsg.setForeground(Color.RED);
				active = false;
			} 
		}
	}
	public boolean getActive() {
		return active;
	}
}
