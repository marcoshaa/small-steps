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
		
		List<supExList> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int i = sc.nextInt();
		
		for (int o = 1; o <=i; o++ ) {
			
			System.out.println();
			System.out.println("Emplyooe #"+o+":");
			System.out.print("Id: ");
				byte id = sc.nextByte();
			System.out.print("Name: ");
			sc.nextLine();
				String name = sc.nextLine();
			System.out.print("Salary: ");
				double salary = sc.nextDouble();
				
				supExList exList = new supExList(id,name,salary);
		list.add(exList);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalar = sc.nextInt();
		Integer po = position(list,idsalar);
		
			System.out.println();
			System.out.print("List of employees: ");
			
				System.out.print("");
						
		
	sc.close();
	}
	
	public static Integer hasId(List<supExList> list,int id) {
	for(int o = 0; o < list.size(); o++) {
		if(list.get(o).getId()==id) {
			return o;
			}
		}
	return null;
	}
}