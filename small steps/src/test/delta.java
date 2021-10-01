package test;

import java.util.Scanner;

public class delta {

	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculo de Delta: ");
		
		System.out.print("Insira a variavel A : ");
		float a = sc.nextFloat();
		
		System.out.print("Insira a variavel B : ");
		float b = sc.nextFloat();
		
		System.out.print("Insira a variavel C : ");
		float c = sc.nextFloat();
		
		float del = b*b -(4*a*c);
		
		System.out.println("O valor de DELTA é : "+del);
		
		sc.close();
	}
}
