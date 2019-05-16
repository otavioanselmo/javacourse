package modulo1_Aula20_ExerciciosParte1;

import java.util.Locale;
import java.util.Scanner;

public class Aula20_ExercicioExemplo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// LARGURA = 10.0
		System.out.println("Insira a largura do terreno: ");
		double largura = sc.nextDouble();
		
		// COMPRIMENTO 30.0
		System.out.println("Insira o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		
		// VALOR METRO QUADRADO 200.0
		System.out.println("Insira o valor do Metro Quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		// C�LCULO DE AREA E PRE�O
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		// EXIBI��O DOS RESULTADOS
		System.out.printf("AREA = %.2f %n", area);
		System.out.printf("PRECO = %.2f %n", preco);
		
		sc.close();
	}

}
