package modulo1_Aula20_ExerciciosParte1;

import java.util.Locale;
import java.util.Scanner;

public class Aula20_Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Iremos calcular a diferen�ca do produto de A e B pelo produto de C e D. DIFERENCA = (A * B - C * D)");
		
		// LEITURA DE VALORES
		System.out.println("Digite um valor para A:");
		int a = sc.nextInt();
		
		System.out.println("Digite um valor para B:");
		int b = sc.nextInt();

		System.out.println("Digite um valor para C:");
		int c = sc.nextInt();
		
		System.out.println("Digite um valor para D:");
		int d = sc.nextInt();
		
		// C�LCULO
		int diferenca = (a * b - c * d);
		System.out.printf("DIFERENCA = %d", diferenca);
		
		sc.close();
	}

}
