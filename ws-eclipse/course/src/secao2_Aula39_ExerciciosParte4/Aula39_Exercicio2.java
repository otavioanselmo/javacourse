package secao2_Aula39_ExerciciosParte4;

import java.util.Scanner;

public class Aula39_Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor para N: ");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println("Dentro do intervalo: " + in);
		System.out.println("Fora do intervalo: " + out);
		
		sc.close();
	}

}
