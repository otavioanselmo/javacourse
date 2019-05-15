package modulo1ExerciciosParte2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para A:");
		int A = sc.nextInt();
		
		System.out.println("Digite um valor para B:");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos!");
		} else {
			System.out.println("Não são múltiplos!");
		}
		
		sc.close();
	}

}
