package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aula50_Exercicio1_Rectangle;

public class Aula50_Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aula50_Exercicio1_Rectangle rect = new Aula50_Exercicio1_Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %2f %n", rect.area());
		System.out.printf("PERIMETER = %.2f %n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f %n", rect.diagonal());
		
		sc.close();
	}
	
}
