package aula26_ExerciciosParte2;

import java.util.Locale;
import java.util.Scanner;

public class Aula26_Exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a coordenada de X:");
		double X = sc.nextDouble();
		
		System.out.println("Insira a coordenada de Y:");
		double Y = sc.nextDouble();
		
		if (X > 0 && Y > 0) {
			System.out.println("Quadrante Q1");
		} else if (X < 0 && Y > 0) {
			System.out.println("Quadrante Q2");
		} else if (X < 0 && Y < 0) {
			System.out.println("Quadrante Q3");
		} else if (X > 0 && Y < 0) {
			System.out.println("Quadrante Q4");
		} else {
			System.out.println("Ponto de Origem");
		}
		
		
		sc.close();
	}

}
