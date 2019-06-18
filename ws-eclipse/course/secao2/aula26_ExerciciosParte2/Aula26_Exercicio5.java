package aula26_ExerciciosParte2;

import java.util.Locale;
import java.util.Scanner;

public class Aula26_Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("         Lista de Produtos        ");
		System.out.println("----------------------------------");
		System.out.println("CÓDIGO  |  ESPECIFICAÇÃO  |  PREÇO");
		System.out.println("1       | Cachorro Quente | R$4,00");
		System.out.println("2       |    X-Salada     | R$4,50");
		System.out.println("3       |    X-Bacon      | R$5,00");
		System.out.println("4       | Torrada Simples | R$2,00");
		System.out.println("5       |  Refrigerante   | R$1,50");
		System.out.println("");
		
		System.out.println("Insira o código do produto:");
		int codigo = sc.nextInt();
		System.out.println("");
		
		System.out.println("Insira a quantidade do produto:");
		int quantidade = sc.nextInt();
		System.out.println("");
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.5;
		} else if (codigo == 3) {
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			total = quantidade * 2.0;
		} else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	}

}
