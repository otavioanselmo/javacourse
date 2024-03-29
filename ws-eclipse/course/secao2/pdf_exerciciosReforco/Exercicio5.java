package pdf_exerciciosReforco;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number of students: ");
		int students = sc.nextInt();
		
		for (int i = 1; i <= students; i++) {
			System.out.print("Student #" + i + ": ");
			double score1 = sc.nextDouble();
			double score2 = sc.nextDouble();
			double score3 = sc.nextDouble();
			
			double finalScore = score1 + score2 + score3;
			
			System.out.printf("Final score: %.2f %n", finalScore);
		}
		
		
		
		sc.close();
	}

}
