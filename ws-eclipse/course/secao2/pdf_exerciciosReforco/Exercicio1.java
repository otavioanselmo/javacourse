package pdf_exerciciosReforco;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three student scores: ");
		double note1 = sc.nextDouble();
		double note2 = sc.nextDouble();
		double note3 = sc.nextDouble();
		
		double finalScore = note1 + note2 + note3;
		
		System.out.printf("Final score = %.2f %n", finalScore);
		if (finalScore < 60.0) {
			System.out.println("You have been FAILED!");
		}
		
		sc.close();
	}

}
