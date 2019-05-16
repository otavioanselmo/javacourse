package modulo1Explicacao;

import java.util.Locale;
import java.util.Scanner;

public class Aula18_EntDados2Ex {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Enter your full name
		System.out.println("Enter your full name: ");
		String fullname = sc.nextLine();
		
		// How many bedrooms are there in your house?
		System.out.println("How many bedrooms are there in your house?");
		int bed = sc.nextInt();
		
		// Enter product price:
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		
		// Enter your last name, age and height (same line):
		System.out.println("Enter your last name, age and height (same line): ");
		String lastname = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
				
		System.out.println(fullname);
		System.out.println(bed);
		System.out.printf("%.2f %n", price);
		System.out.println(lastname);
		System.out.println(age);
		System.out.printf("%.2f", height);
		
		sc.close();
	}

}
