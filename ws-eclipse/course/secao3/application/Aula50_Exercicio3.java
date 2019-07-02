package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aula50_Exercicio3_Student;

public class Aula50_Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aula50_Exercicio3_Student student = new Aula50_Exercicio3_Student();
		
		System.out.print("Enter a name of student: ");
		student.name = sc.nextLine();
		System.out.print("Enter a grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Enter a grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Enter a grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f %n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
