package aula20_ExerciciosParte1;

import java.util.Locale;
import java.util.Scanner;

public class Aula20_Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// ENTRADA VALOR DO RAIO
		System.out.println("Digite o valor do raio do c�rculo:");
		double raio = sc.nextDouble();
		
		// C�LCULO DA �REA
		System.out.println("Calculando a area...");
		double pi = 3.14159;
		double area = pi * (raio * raio);
		System.out.printf("Area = %.4f", area);
		
		sc.close();
	}

}
