package logic;
import java.io.*;
import java.util.LinkedList;
import appGUI.ProductButtonBuy;
import javax.swing.*;
/**
 * Clase para generar la lista de productos.
 */
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
	/**
	 * METODO PARA INSERTAR PRODUCTO A LA LISTA
	 * @param data - Parametro con los datos del producto.
	 */
	public void insert(Product data) {
		list.add(data);
	}
	/**
	 * METODO PARA COMPROBAR SI EL PRODUCTO YA SE HA AGREGADO
	 * si el producto existe en la liste este aumenta su cantidad.
	 * @param data - Parametro con los datos del producto.
	 */
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
	/**
	 * METODO PARA BORRAR EL PRODUCTO DE LA LISTA
	 * si la cantidad es 0 se borra el producto.
	 */
	public void deletNode() {
		if(!list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).amount == 0) {
					list.remove(i);
				}
			}
		}
	}
	/**
	 * METODO PARA BORRAR TODA LA LISTA DE PRODUCTOS
	 */
	public void deletList() {
		if(!list.isEmpty()){
			list.removeAll(list);
			total = 0.0;
		}
	}
	/**
	 * METODO PARA MOSTRAR LISTA EN LA FACTURA
	 * @param jta - Parametro para mostrar lista en el textArea.
	 */
	public void display(JTextArea jta) {
		if(!list.isEmpty()) {
			jta.setText(list+"\n");
		}else jta.setText("");
			
	}
	/**
	 * METODO PARA MOSTRAR EL TOTAL DE LA COMPRA 
	 * @param jl - Parametro para la cantidad a mostrar en la factura.
	 */
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
