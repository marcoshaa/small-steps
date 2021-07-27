package exercises;

import java.util.Locale;
import java.util.Scanner;
import util.calcu;

public class circumference_2 {

		public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		calcu calc = new calcu();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circu(radius);
		
		double v =calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}
}
