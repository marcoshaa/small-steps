package entities;

public class useBank {

	private int nr;
	private String name;
	private double value;
	
	public useBank(int nr, String name) {
		this.nr = nr;
		this.name = name;
	}
	public useBank(int nr, String name, double depinitial) {		
		this.nr = nr;
		this.name = name;
		deposit(depinitial);
	}
	public int getNr() {
		return nr;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	
	public void deposit(double amount) {
		value += amount;
	}

	public void withdraw(double amount) {
		value -= amount + 5.00;
	}
	public String toString() {
		return "Account "
				+ nr
				+", Holder: "
				+ name
				+", Balance: $ "
				+String.format("%.2f", value);
				
	}
}