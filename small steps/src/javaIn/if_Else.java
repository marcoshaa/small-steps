package javaIn;

import java.util.Scanner;

public class if_Else {

	public static void main(String[] args) {
		int x;
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("inform the time:");
		x = sc.nextInt();
		
		
		
		
	if( x < 12) {
			System.out.println("Good Morning");
		
	}
	else if(x < 18){
		System.out.println("Good afternoon");
	}
	else if(x < 24 ){
		
		System.out.println("Good nigth");
	}
	else {
		System.out.println("invalid time");
		
	}
	sc.close();
	}
}
