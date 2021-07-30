package exercises;

import java.util.Scanner;
import java.util.Locale;
import entities.supDollar;

public class dollar {

	public static void main(System[] args){
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		
		System.out.print("What is the Dollar price? ");
		supDollar.exchange = sc.nextDouble();
		
		System.out.print("what is the rate dollar in conversion? ");
		supDollar.rate = sc.nextDouble();
		
		System.out.print("how many dollars do you need? ");
		supDollar.money = sc.nextDouble();
		
		System.out.print("will be necessary " + supDollar.convert() + "real");
		
	sc.close();	
	}
}
