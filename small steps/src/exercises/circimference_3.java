
package exercises;

import java.util.Locale;
import java.util.Scanner;
import util.calcu_3;

public class circimference_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calcu_3.circu(radius);

		double v = calcu_3.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calcu_3.PI);

		sc.close();
	}
}
