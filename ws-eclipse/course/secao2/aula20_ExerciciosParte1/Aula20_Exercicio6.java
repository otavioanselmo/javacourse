package aula20_ExerciciosParte1;

import java.util.Locale;
import java.util.Scanner;

public class Aula20_Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Digite um valor para A:");
		double A = sc.nextDouble();
		
		System.out.println("Digite um valor para B:");
		double B = sc.nextDouble();
		
		System.out.println("Digite um valor para C:");
		double C = sc.nextDouble();
		
		// C�LCULOS
		
			// TRI�NGULO
			double triangulo = (A * C) / 2.0;
			System.out.printf("TRI�NGULO: %.3f %n", triangulo);
			
			// C�RCULO
			double circulo = 3.14159 * (C * C);
			System.out.printf("C�RCULO: %.3f %n", circulo);
			
			// TRAP�ZIO
			double trapezio = (A + B) / 2.0 * C;
			System.out.printf("TRAP�ZIO: %.3f %n", trapezio);
			
			// QUADRADO
			double quadrado = B * B;
			System.out.printf("QUADRADO: %.3f %n", quadrado);
			
			// RET�NGULO
			double retangulo = A * B;
			System.out.printf("RET�NGULO: %.3f %n", retangulo);
			
			sc.close();
	}

}
