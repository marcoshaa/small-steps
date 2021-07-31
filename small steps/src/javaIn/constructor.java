package javaIn;

import java.util.Locale;
import java.util.Scanner;
import entities.product_toString;

public class constructor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter productor data: ");
		System.out.print("Name: ");
		 String name = sc.nextLine();
		
		 System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Qauntity in stock: ");
		int quantity = sc.nextInt();
		product_toString product = new product_toString(name,price,quantity);

		System.out.println(product.toString());
		System.out.println("");// line in white
		System.out.print("to add in stock: ");
		quantity = sc.nextInt();
		product.addProduct(quantity);

		System.out.println();// line in white
		System.out.println("Updated data:  " + product);

		System.out.println();// line in white
		System.out.print("to remove product in the stock: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);

		System.out.println();// line in white
		System.out.println("Updated data:  " + product);

		sc.close();
	}

}
