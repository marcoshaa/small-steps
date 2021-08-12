package example;

import java.util.Locale;
import java.util.Scanner;
import entities.prodVector;
public class vector {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		int n = sc.nextInt();
		
		prodVector[] vect = new prodVector[n];
		
		for (int i=0; i<n; i++) {
			sc.nextInt();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			}
	sc.close();
	}
}
