package aula36_ExerciciosParte3;

import java.util.Locale;
import java.util.Scanner;

public class Aula36_Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("POSTO DE COMBUSTÍVEIS");
		System.out.println("---------------------");
		System.out.println("     1 - ALCOOL      ");
		System.out.println("     2 - GASOLINA    ");
		System.out.println("     3 - DIESEL      ");
		System.out.println();
		System.out.println("Qual o tipo de combustível abastecido?");
		System.out.print("Resposta: ");
		int tipo = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			System.out.println();
			System.out.println("Qual o tipo de combustível abastecido?");
			System.out.print("Resposta: ");
			tipo = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
