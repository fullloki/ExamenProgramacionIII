package logic;
/**
 * Clase para crear un producto.
 */
public class Product {
	public String name;
	public double price;
	public int amount;
	public double subtotal; 
	/**
	 * CONSTRUCTOR PARA DATOS DEL PRODUCTO EN LA LISTA DE COMPRAS
	 * @param name - Parametro con el nombre del producto.
	 * @param price - Parametro con el precio del producto.
	 * @param amount - Parametro con la cantidad del producto.
	 */
	public Product(String name,double price,int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	/**
	 * METODO PARA EL SUBTOTAL DEL PRODUCTO
	 * @return - Devuelve el subtotal del producto para mostrar en la factura.
	 */
	public double subtotal() {
		subtotal = price *amount;
		return Math.round(subtotal*100.0)/100.0;
	}
	/**
	 * METODO PARA DISMINUIR CANTIDAD DEL PRODUCTO
	 * resta la cantidad cuando se presiona el boton de borrar un producto
	 * @return - Devuelde la cantidad del producto.
	 */
	public int subtract() {
		return amount -=1;
	}
	/**
	 * METODO PARA AUMENTAR CANTIDAD DEL PRODUCTO
	 * suma la cantidad caundo se presiona el boton del producto a comprar.
	 * @return - Devuelve la cantidad del producto.
	 */
	public int addition() {
		return amount +=1;
	}
	/**
	 * METODO PARA MOSTRAR LOS DATOS EN LA FACTURA
	 */
	public String toString() {
		return(name+"\tx"+amount+"\t"+subtotal()+"\n");
	}
}
