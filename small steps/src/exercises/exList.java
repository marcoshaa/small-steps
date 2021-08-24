package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.supExList;


public class exList {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<String> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int i = sc.nextInt();
		
		for (int o = 1; o <= i; o++ ) {
			
			System.out.println();
			System.out.println("Emplyooe #"+o+":");
			
			
		}
	sc.close();
	}
}
