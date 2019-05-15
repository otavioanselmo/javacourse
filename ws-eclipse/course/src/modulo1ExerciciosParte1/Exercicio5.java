package modulo1ExerciciosParte1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// ENTRADA DE DADOS PE�A 1
		System.out.println("Digite o c�digo da pe�a 1:");
		int codPeca1 = sc.nextInt();
		
		System.out.println("Digite a quantidade da pe�a 1:");
		int qtdPeca1 = sc.nextInt();
		
		System.out.println("Digite o valor unit�rio da pe�a 1:");
		double valorPeca1 = sc.nextDouble();
		
		// ENTRADA DE DADOS PE�A 2
		System.out.println("Digite o c�digo da pe�a 2:");
		int codPeca2 = sc.nextInt();
				
		System.out.println("Digite a quantidade da pe�a 2:");
		int qtdPeca2 = sc.nextInt();
				
		System.out.println("Digite o valor unit�rio da pe�a 2:");
		double valorPeca2 = sc.nextDouble();
		
		// C�LCULO DO TOTAL
		double total = valorPeca1 * qtdPeca1 + valorPeca2 * qtdPeca2;
		System.out.printf("C�digo das pe�as escolhidas: %n");
		System.out.printf("Pe�a 1 : %d %n", codPeca1);
		System.out.printf("Pe�a 2 : %d %n", codPeca2);
		System.out.printf("Valor total a pagar: R$ %.2f %n", total);
		
		sc.close();
	}

}
