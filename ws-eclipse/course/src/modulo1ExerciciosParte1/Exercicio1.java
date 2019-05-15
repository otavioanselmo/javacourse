package modulo1ExerciciosParte1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// ENTRADA DE DADOS
		System.out.println("Insira o primero valor:");
		int n1 = sc.nextInt();
		System.out.println("Insira o segundo valor:");
		int n2 = sc.nextInt();
		
		// SOMA
		int soma = n1 + n2;
		System.out.printf("SOMA = %d", soma);
		
		sc.close();
	}

}
