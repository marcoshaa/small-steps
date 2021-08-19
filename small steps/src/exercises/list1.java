package exercises;

import java.util.Locale;
import java.util.Scanner;
import entities.cadList;

public class list1 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		cadList[] vect = new cadList[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int o = 1; o <= n; o++ ) {
			
			System.out.println();
			System.out.println("Rent #" + o +":");
			System.out.print("Name: ");
			sc.nextLine();
		String name = sc.nextLine();
			System.out.print("Email: ");
		String email = sc.nextLine();
			System.out.print("Room: ");
		int room = sc.nextInt();
		vect[room] = new cadList(name, email);		
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i <10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
		
	sc.close();
	}
}

