package modulo1Explicacao;

import java.util.Locale;
import java.util.Scanner;

public class Aula37_EstruturaRepetitivaFor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many integer numbers are you going to enter? ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Value #" + i + ": ");
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println("Sum = " + sum);
		
		sc.close();
	}

}
