package prog;


import java.util.Locale;
import java.util.Scanner;

public class Prog_14 {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of tax players: ");
		int p = sc.nextInt();
		
		for(int i =0; i<p; i++) {
			System.out.println("Tax players #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			
		}
		
		
		
		
	sc.close();
	}

}
