package logic;

public class Product {
	public String name;
	public double price;
	public int amount;
	public double subtotal; 
	
	public Product(String name,double price,int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public double subtotal() {
		subtotal = price *amount;
		return Math.round(subtotal*100.0)/100.0;
	}
	public int subtract() {
		return amount -=1;
	}
	public int addition() {
		return amount +=1;
	}
	public String toString() {
		return(name+"\tx"+amount+"\t"+subtotal()+"\n");
	}
}
