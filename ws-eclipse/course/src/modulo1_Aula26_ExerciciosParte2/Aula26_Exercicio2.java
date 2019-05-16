package modulo1_Aula26_ExerciciosParte2;

import java.util.Locale;
import java.util.Scanner;

public class Aula26_Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um n�mero inteiro:");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("�MPAR");
		}
		
		System.out.println(numero);

		sc.close();
	}

}
