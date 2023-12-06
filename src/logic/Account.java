package logic;

public class Account {
	private double balance;
	private String user;
	private String ftName;
	private String ltName;
	private String pass;
	
	public Account(String user,String pass,String ftName,String ltName,double balance) {
		this.ftName = ftName;
		this.ltName = ltName;
		this.user = user;
		this.pass = pass;
		this.balance = balance;
	}
	public Account(String user,String pass) {
		this.user = user;
		this.pass = pass;
	}
	public boolean deposit(double amt) {
		balance = balance + amt;
		return true;
	}
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
