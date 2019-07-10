package application;

import java.util.Locale;
import java.util.Scanner;

import util.Aula51_MembroEstatico_Problema_v3_Calculator;

public class Aula51_MembroEstatico_Problema_v3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Aula51_MembroEstatico_Problema_v3_Calculator.circumference(radius);
		
		double v = Aula51_MembroEstatico_Problema_v3_Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f %n", c);
		System.out.printf("Volume: %.2f %n", v);
		System.out.printf("PI value: %.2f %n", Aula51_MembroEstatico_Problema_v3_Calculator.PI);
		
		sc.close();
	}

}
