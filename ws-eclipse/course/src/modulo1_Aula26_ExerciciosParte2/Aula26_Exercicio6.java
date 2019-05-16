package modulo1_Aula26_ExerciciosParte2;

import java.util.Locale;
import java.util.Scanner;

public class Aula26_Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor (pode ser decimal):");
		double valor = sc.nextDouble();
		
		if (valor >= 0.0 && valor <= 25.0) {
			System.out.println("Intervalo entre 0 e 25");
		} else if (valor >= 25.01 && valor <= 50.00) {
			System.out.println("Intervalo entre 25 e 50");
		} else if (valor >= 50.01 && valor <= 75.00) {
			System.out.println("Intervalo entre 50 e 75");
		} else if (valor >= 75.01 && valor <= 100.00) {
			System.out.println("Intervalo entre 75 e 100");
		} else {
			System.out.println("Fora do intervalo");
		}
		
		System.out.println();
		System.out.printf("Valor digitado: %.2f", valor);
		
		sc.close();
	}

}
