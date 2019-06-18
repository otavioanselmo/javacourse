package aula39_ExerciciosParte4;

import java.util.Scanner;

public class Aula39_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor para x: ");
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println("Valores ímpares até o valor de X informado: " + i);
			}
		}
		
		sc.close();
	}

}
