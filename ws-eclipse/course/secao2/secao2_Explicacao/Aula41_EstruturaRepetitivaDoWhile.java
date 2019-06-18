package secao2_Explicacao;

import java.util.Locale;
import java.util.Scanner;

public class Aula41_EstruturaRepetitivaDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char resp;
		
		do { 
			System.out.print("Enter a number: ");
			double n = sc.nextDouble();
		
			double sq = Math.sqrt(n);
			System.out.printf("Square root: %.3f %n", sq);
			
			System.out.print("Repeat (y/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
		
	}

}
