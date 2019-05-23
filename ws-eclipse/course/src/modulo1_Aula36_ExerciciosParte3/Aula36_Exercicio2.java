package modulo1_Aula36_ExerciciosParte3;

import java.util.Locale;
import java.util.Scanner;

public class Aula36_Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma coordenada para x: ");
		int x = sc.nextInt();
		
		System.out.print("Digite uma coordenada para y: ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Coordenada do Primeiro Quadrante!");
				} 
			else if (x < 0 && y > 0) {
				System.out.println("Coordenada do Segundo Quadrante!");
					} 
			else if (x < 0 && y < 0) {
				System.out.println("Coordenada do Terceiro Quadrante!");
							} 
			else {
				System.out.println("Coordenada do Quarto Quadrante!");
					}
			System.out.println();
			System.out.print("Digite uma coordenada para x: ");
			x = sc.nextInt();
			System.out.print("Digite uma coordenada para y: ");
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
