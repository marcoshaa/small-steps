package test;

import java.util.Scanner;

public class tT {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com um numero: ");
		int n1 = sc.nextInt();
		
		for(int i=0;i<11;i++ ) {
			
			 System.out.println("Tabuada do "+n1+": "+ i * n1);
			
		}
	sc.close();
	}
}
