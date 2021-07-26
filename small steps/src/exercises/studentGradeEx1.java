package exercises;

import java.util.Locale;
import java.util.Scanner;


public class studentGradeEx1 {

	public static void main(String[] args) {

		boolean x;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		supEx1 sup = new supEx1();

		System.out.println("Enter Etudent Data: ");
		System.out.print("Name: ");
		sup.name = sc.next();

		do {
			System.out.print("Enter the grade for the first semester(0 to 30): ");
			sup.note1 = sc.nextDouble();
			x = sup.note1 >= 0 && sup.note1 <= 30;
		} while (x == false);
		System.out.println("valid note! ");

		do {
			System.out.print("Enter the grade for the second semester(0 to 35): ");
			sup.note2 = sc.nextDouble();
			x = sup.note2 >= 0 && sup.note2 <= 35;
		} while (x == false);
		System.out.println("valid note! ");

		do {
			System.out.print("Enter the grade for the third semester(0 to 35): ");
			sup.note3 = sc.nextDouble();
			x = sup.note3 >= 0 && sup.note3 <= 35;
		} while (x == false);
		System.out.println("valid note! ");

				if(sup.average() > 60){
			System.out.println(sup.average());
			System.out.println("Approved good vacation!!");
			
		}else {
			System.out.print(sup.toString());
			
		}
		sc.close();
	}
}
