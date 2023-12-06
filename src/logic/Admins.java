package logic;

import java.awt.*;
import javax.swing.*;

public class Admins {
	private String adm []={"Asbel","Antonio","Jeremy","Pamela"};
	private String key []={"810061766","81003690","89711073","810081973"};
	private JTextField user,pass;
	private JLabel jlMsg;
	private boolean active;
	
	public Admins(JTextField user,JTextField pass,JLabel jlMsg) {
		this.user = user;
		this.pass = pass;
		this.jlMsg = jlMsg;
	}
	
	public void validate() {
		for(int i = 0; i < 4;i++) {
			if(adm[i].equals(user.getText()) && key[i].equals(pass.getText())) {
				jlMsg.setText("Vienvenido "+adm[i]);
				jlMsg.setForeground(Color.WHITE);
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
