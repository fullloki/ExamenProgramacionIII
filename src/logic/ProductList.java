package logic;
import java.io.*;
import java.util.LinkedList;
import appGUI.ProductButtonBuy;
import javax.swing.*;
public class ProductList{
	private double total;
	private boolean exists = false;
	LinkedList<Product> list = new LinkedList<Product>();
	
	public boolean getExists() {
		return exists;
	}
	public LinkedList<Product> getList() {
		return list;
	}
	//------------------------------------------- Metodo para agregar una cuenta a la lista
	public void insert(Product data) {
		list.add(data);
	}
	//------------------------------------------- Metodo para buscar y comprobar usuarios
	public void searcher(Product data) {
		String productName;
		if(!list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
				productName = list.get(i).name;
				if(data.name.equals(productName)) {
					exists = true;
					list.get(i).addition();
					break;
				}else exists = false;
			}
		}
	}
	//------------------------------------------- Metodo para borrar nodo
	public void deletNode() {
		if(!list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).amount == 0) {
					list.remove(i);
				}
			}
		}
	}
	public void deletList() {
		if(!list.isEmpty()){
			list.removeAll(list);
			total = 0.0;
		}
	}
	//------------------------------------------- Metodo para mostrar lista
	public void display(JTextArea jta) {
		if(!list.isEmpty()) {
			jta.setText(list+"\n");
		}else jta.setText("");
			
	}
	//------------------------------------------
	public void total(JLabel jl) {
		double aux = 0;
		if(!list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
			aux=aux + list.get(i).subtotal();
			total = aux;
			}
			jl.setText(String.valueOf(Math.round(total*100.0)/100.0));
		}else {
			jl.setText("0.0");
			total = 0.0;
		}
	}
	
	public double getTotal() {
		return total;
	}
}
