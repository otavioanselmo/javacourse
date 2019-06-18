package aula39_ExerciciosParte4;

import java.util.Locale;
import java.util.Scanner;

public class Aula39_Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para N: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão impossóvel!");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f %n", div);
			}
		}
		
		sc.close();
	}

}
