package logic;
import java.io.*;
import javax.swing.*;
import java.util.LinkedList;
public class AccountList {
	private File file;
	private boolean exists,validePass,valideUser;
	private int index;
	
	LinkedList<Account> list = new LinkedList<Account>();
	public AccountList() {
		file = new File("ListaDeCuentas.txt");
	}
	public boolean getExists() {
		return exists;
	}
	public boolean getValidePass() {
		return validePass;
	}
	public boolean getValideUser() {
		return valideUser;
	}
	public LinkedList<Account> getList() {
		return list;
	}
	//------------------------------------------- Metodo para agregar una cuenta a la lista
	public void insert(Account data) {
		list.add(data);
	}
	public void delet(int x) {
		list.remove(x);
	}
	//------------------------------------------- Metodo para buscar y comprobar usuarios
	public void searcher(Account data) {
		String userName;
		String pass;
		if(!list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
				userName = list.get(i).getUser();
				pass = list.get(i).getPass();
				if(data.getUser().equals(userName)&&data.getPass().equals(pass)) {
					exists = true;
					index = i;
					break;
				}else exists = false;
			}
		}
	}
	public int getAccountIndex() {
		return index;
	}
	public void searcher(String data) {
		String userName;
		if(!list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
				userName = list.get(i).getUser();
				if(data.equals(userName)) {
					exists = true;
					break;
				}else exists = false;
			}
		}
	}
	public void valideUser(Account data) {
		String user;
		if(!list.isEmpty()) {
			for(int i = 0; i < list.size();i++) {
				user = list.get(i).getUser();
				if(data.getUser().equals(user)) {
					valideUser = true;
					break;
				}else valideUser = false;
			}
		}
	}
	public void validePass(Account data) {
		String pass;
		if(!list.isEmpty()) {
			for(int i = 0; i < list.size();i++) {
				pass = list.get(i).getPass();
				if(data.getPass().equals(pass)) {
					validePass = true;
					break;
				}else validePass = false;
			}
		}
	}
	//==================================================== METODOS DEL ARCHIVO
	
	public boolean fileExist() {
		if(file.exists()) {
			System.out.println("El archivo existe");
			return true;
		}else {
			System.out.println("El archivo NO existe");
			return false;
		}
	}
	//------------------------------------------- Crear archivo
	public void makeFile() {
		try {
			if(file.createNewFile()) {
				
				System.out.println("Se ha creado el archivo.");
			}else {
				System.out.println("LISTA EXISTENTE");
			}
		}catch(IOException e) {
			e.printStackTrace(System.out);
		}
	}
	//------------------------------------------- Escribir en el archivo
	public void writeIFile() {
		try {
			if(!list.isEmpty()) {
				FileWriter w = new FileWriter(file);
				for(int i = 0; i < list.size(); i++) {
					w.write(list.get(i).getUser().trim()+"\n");
					w.write(list.get(i).getPass().trim()+"\n");
					w.write(list.get(i).getFtName().trim()+"\n");
					w.write(list.get(i).getLtName().trim()+"\n");
					w.write(list.get(i).getBalance()+"\n");
				}
				w.close();
			}
		}catch(IOException e) {
			e.printStackTrace(System.out);
		}
	}
	//------------------------------------------- Leer el archivo y cargar en la lista
	public void readFile() {
		String ftName,ltName,user,pass;
		double balance;
		try {
			if(list.isEmpty()) {
				FileReader reader = new FileReader(file);//<--indicando el archivo a leer
				BufferedReader read = new BufferedReader(reader);
				while(read.ready()) {
					user = read.readLine();
					pass = read.readLine();
					ftName = read.readLine();
					ltName = read.readLine();
					//balance =Double.parseDouble(read.readLine());
					balance =Math.round(Double.parseDouble(read.readLine())*100.0)/100.0;
					//jta.setText(jta.getText()+user+" \t "+ftName+" \t "+ltName+" \t "+balance+"\n");
					insert(new Account(user,pass,ftName,ltName,balance));
				}
				read.close();
			}
		}catch(IOException e) {
			e.printStackTrace(System.out);
		}
	}
	//-------------------------------------------
	
}
