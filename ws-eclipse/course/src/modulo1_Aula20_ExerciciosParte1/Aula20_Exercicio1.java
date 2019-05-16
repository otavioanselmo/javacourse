package modulo1_Aula20_ExerciciosParte1;

import java.util.Scanner;

public class Aula20_Exercicio1 {

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
