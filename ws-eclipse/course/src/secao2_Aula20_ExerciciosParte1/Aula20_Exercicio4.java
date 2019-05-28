package secao2_Aula20_ExerciciosParte1;

import java.util.Locale;
import java.util.Scanner;

public class Aula20_Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Por favor, digite o ID do funcion�rio:");
		int funcionario = sc.nextInt();
		
		System.out.println("Por favor, digite a quantidade de horas trabalhadas:");
		int horasTrabalhadas = sc.nextInt();
		
		System.out.println("Por favor, digite o valor que recebe por horas trabalhadas:");
		double valorHorasTrabalhadas = sc.nextDouble();
		
		// C�LCULO SAL�RIO
		double salario = horasTrabalhadas * valorHorasTrabalhadas;
		
		System.out.printf("ID Funcion�rio = %d %n", funcionario);
		System.out.printf("Quantidade de horas trabalhadas = %d %n", horasTrabalhadas);
		System.out.printf("Sal�rio do m�s = U$ %.2f %n", salario);
		
		sc.close();
	}

}
