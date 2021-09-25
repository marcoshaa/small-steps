package entities;

public final class SavAccount extends account{

	private Double interestRate;
	
	public SavAccount() {
		super();
	}

	public SavAccount(Integer number, String holde, Double balance, Double interestRate) {
		super(number, holde, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
