package heritage;

import entities.BusinessAccount;
import entities.SavAccount;
import entities.account;

public class program {
	
	public static void main (String[]args) {
		
		account acc = new account(1000, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		account acc1 = bacc;
		account acc2 = new BusinessAccount(1003, "Fernanda", 0.0, 300.0);
		account acc3 = new SavAccount(1004, "Anna", 500.00, 0.01); 
	}

}
