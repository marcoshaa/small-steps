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
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new prodVector(name, price);
			
			}
		
		double sum = 0;
			for (int i=0; i<vect.length; i++) {
				sum += vect[i].getPrice();
				
			}
		
		double med = sum / vect.length;
		
		System.out.printf("Average Price: %.2f%n", med);
		
	sc.close();
	}
}
