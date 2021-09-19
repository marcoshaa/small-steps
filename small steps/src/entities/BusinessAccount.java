package entities;

public class BusinessAccount extends account {
	
	private Double loanLimit;
	
	public BusinessAccount () {
		
	}

	public BusinessAccount(Integer number, String holde, Double balance, Double loanLimit) {
		super(number, holde, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount<=loanLimit)
		balance += amount -10;
	}

}
