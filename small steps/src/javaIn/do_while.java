package javaIn;
import java.util.Scanner;
import java.util.Locale;

public class do_while {

	public static void main (String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char result;
		
		do {
			System.out.print("Enter temperature in Celsius:");
			double c = sc.nextDouble();
			double f = 9.0 * c /5.0+32.0;
			System.out.printf("Transformed in Fahrenheit: %.1f%n", f);
			System.out.print("Repeat (y/n) ?");
			result = sc.next().charAt(0);
			
		} while ( result != 'n');
		
		sc.close();
	}
}
