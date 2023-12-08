package logic;
/**
 * Clase para crear cuenta.
 */
public class Account {
	private double balance;
	private String user;
	private String ftName;
	private String ltName;
	private String pass;
	/**
	 * CONSTRUCTOR PARA DATOS DE UNA NUEVA CUENTA
	 * @param user - Parametro dato usuario.
	 * @param pass - Parametro dato contraseña.
	 * @param ftName - Parametro dato nombre.
	 * @param ltName - Parametro dato apellido.
	 * @param balance - Parametro dato balance.
	 */
	public Account(String user,String pass,String ftName,String ltName,double balance) {
		this.ftName = ftName;
		this.ltName = ltName;
		this.user = user;
		this.pass = pass;
		this.balance = balance;
	}
	/**
	 * CONSTRUCTOR PARA DATOS DE CUENTA EXISTENTE
	 * @param user - Parametro dato usuario.
	 * @param pass - Parametro dato contraseña.
	 */
	public Account(String user,String pass) {
		this.user = user;
		this.pass = pass;
	}
	/**
	 * METODO PARA DEPOSITAR
	 * @param amt - Parametro para cantidad a depositar.
	 * @return - Devuel verdero si se deposita. 
	 */
	public boolean deposit(double amt) {
		balance = balance + amt;
		return true;
	}
	/**
	 * METODO PARA RETIRAR O DESCONTAR AL REALIZAR COMPRA.
	 * @param amt - Parametro para cantidad a retirar.
	 * @return - Devuelve verdadero si amt<balace o falso si amt>balance.
	 */
	public boolean withdraw(double amt) {
		if (balance >= amt) {
			balance = balance - amt;
			return true;
		}else return false;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getFtName() {
		return ftName;
	}
	public void setFtName(String ftName) {
		this.ftName = ftName;
	}
	public String getLtName() {
		return ltName;
	}
	public void setLtName(String ltName) {
		this.ltName = ltName;
	}
	public double getBalance() {
		//return balance;
		return Math.round(balance*100.0)/100.0;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String toString() {
		return (user+"|"+pass);
	}
}
