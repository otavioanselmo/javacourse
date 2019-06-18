package aula26_ExerciciosParte2;

import java.util.Locale;
import java.util.Scanner;

public class Aula26_Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para A:");
		int A = sc.nextInt();
		
		System.out.println("Digite um valor para B:");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o m�ltiplos!");
		} else {
			System.out.println("N�o s�o m�ltiplos!");
		}
		
		sc.close();
	}

}
