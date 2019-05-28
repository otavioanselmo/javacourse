package secao2_Aula26_ExerciciosParte2;

import java.util.Locale;
import java.util.Scanner;

public class Aula26_Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um n�mero inteiro:");
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("N�O NEGATIVO");
		}
		
		System.out.println(numero);
		
		sc.close();
	}

}
