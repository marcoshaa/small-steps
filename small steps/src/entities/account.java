package entities;

public class account {

	private Integer number;
	private String holde;
	protected Double balance;
	
	public account() {
		
	}

	public account(Integer number, String holde, Double balance) {
		this.number = number;
		this.holde = holde;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolde() {
		return holde;
	}

	public void setHolde(String holde) {
		this.holde = holde;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
}
