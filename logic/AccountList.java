package logic;
import java.io.*;
import javax.swing.*;
import java.util.LinkedList;
/**
 * Clase para insertar las cuentas en listas y guardar en archivo txt.
 */
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
	/**
	 * METODO PARA AGREGAR UNA CUENTA A LA LISTA
	 * @param data -Parametro con los datos de la cuenta a comprobar.
	 */
	public void insert(Account data) {
		list.add(data);
	}
	/**
	 * METODO PARA BORRAR UNA CUENTA DE LA LISTA
	 * @param x - Parametro con la posicion de la cuenta en la lista.
	 */
	public void delet(int x) {
		list.remove(x);
	}
	/**
	 * METODO PARA BUSCAR Y COMPROBAR UNA CUENTA EN LA LISTA
	 * @param data - Parametro con los datos de la cuenta a comprobar.
	 */
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
	/**
	 * METODO PARA OBTENER POSICION DEL USUARIO EN LA LISTA
	 * @return - Devuelve la posicion del usuario en la lista.
	 */
	public int getAccountIndex() {
		return index;
	}
	/**
	 * METODO PARA VALIDAR SI EL NOMBRE DE USUARIO ESTA EN USO.
	 * @param data - Parametro con los datos de la cuenta a comprobar. 
	 */
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
	/**
	 * METODO PARA VALIDAR SI LA CONTRASEÑA ESTA EN USO.
	 * @param data - Parametro con los datos de la cuenta a comprobar. 
	 */
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
	/**
	 * METODO PARA VALIDAR SI EL ARCHIVO EXISTE
	 * @return - Devuelve un mensaje sobre si existe o no el archivo.
	 */
	public boolean fileExist() {
		if(file.exists()) {
			System.out.println("El archivo existe");
			return true;
		}else {
			System.out.println("El archivo NO existe");
			return false;
		}
	}
	/**
	 * METODO PARA CREAR ARCHIVO
	 */
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
	/**
	 * METODO PARA GUARDAR LOS DATOS DE LA LISTA EN EL ARCHIVO
	 */
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
	/**
	 * METODO PARA CARGAR LOS DATOS DEL ARCHIVO A LA LISTA
	 */
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
}
