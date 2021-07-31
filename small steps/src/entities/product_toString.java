package entities;

public class product_toString {

	public String name;
	public double price;
	public int quantity;
	
	public product_toString() {//using overload
		
	}
	
	public product_toString(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		
	}
	
	public double valueStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
public void removeProduct(int quantity) {
	this.quantity -= quantity; 
		
	}

	public String toString() {
		return name 
				+ ", $ "
				+ String.format("%.2f",price )
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f",valueStock());
				
	}
}
