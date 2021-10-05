package ex_130;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class program {
	
	public final static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<employee> list = new ArrayList<>();
		
		System.out.print("Entre the number of employees: ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			System.out.println("EMPLYEE #" + i +" data:");			
			System.out.print("Outsourced (y/n)? ");
			char yn = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(yn == 'y') {
				System.out.print("Additional charge: ");
				double add = sc.nextDouble();
		
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, add));
			}
			else {
				
				list.add(new employee(name, hours, valuePerHour));
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (employee emp : list ) {
			
			System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));
			
		}
			
	sc.close();
	}

}
