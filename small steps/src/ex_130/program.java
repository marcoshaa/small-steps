package ex_130;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class program {
	
	public final static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<employee> list = new ArrayList<>();
		
		System.out.print("Entre the number of employees: ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			System.out.print("EMPLYEE #" + i +" data:");			
			System.out.print("Outsourced (y/n)? ");		
			
			}
		
		
		sc.close();
	}

}
