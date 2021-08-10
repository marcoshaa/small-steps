package exercises;

import java.util.Locale;
import java.util.Scanner;
import entities.useBank;

public class cadBank {

	public static void main (String[] args) {
		
		char x;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		useBank us = new useBank();
		
		System.out.print("Enter account number: ");
		us.setNr(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		us.setName(sc.nextLine());
		
		System.out.print("Is there na initial deposit (y/n) ? ");
		x = sc.next().charAt(0);
		if (x == 'y' ){
			
		System.out.print("Enter initial deposit value: ");
		us.setValue(sc.nextDouble());
		System.out.print("");//line in white
			
		} else {
			System.out.print("");//line in white
		}
		System.out.println("Accout data: ");
		
		System.out.print(us.toString());
		
		System.out.print("");//line in white
		System.out.print("Enter a deposit value: ");
		
		
		
		sc.close();
	}
}
