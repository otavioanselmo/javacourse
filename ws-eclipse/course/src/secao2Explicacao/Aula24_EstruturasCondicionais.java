package secao2Explicacao;

import java.util.Locale;
import java.util.Scanner;

public class Aula24_EstruturasCondicionais {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros na mesma linha: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("Maior = " + a);
		} else if (b > c){
			System.out.println("Maior = " + b);
		} else {
			System.out.println("Maior = " + c);
		}
		
		sc.close();
	}

}
