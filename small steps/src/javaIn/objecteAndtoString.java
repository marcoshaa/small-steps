package javaIn;

import java.util.Locale;
import java.util.Scanner;
import entities.product_toString;

public class objecteAndtoString {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		product_toString product = new product_toString();
		System.out.println("enter productor data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Qauntity in stock: ");
		
		System.out.println(product.toString());
		
		sc.close();
	}
	
}
