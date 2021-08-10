package exercises;

import java.util.Locale;
import java.util.Scanner;
import entities.useBank;

public class cadBank {

	public static void main (String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		useBank useBank;
		
		System.out.print("Enter account number: ");
		int nr = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depinitial = sc.nextDouble();
		 useBank = new useBank (nr, name, depinitial);
		}
		else {
			useBank = new useBank(nr, name);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(useBank);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depvalue = sc.nextDouble();
		useBank.deposit(depvalue);
		System.out.println("Updated account data: ");
		System.out.println(useBank);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		useBank.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(useBank);
		
		
		sc.close();
	}
}
