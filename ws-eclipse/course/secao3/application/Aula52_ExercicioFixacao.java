package application;

import java.util.Locale;
import java.util.Scanner;

import util.Aula52_CurrencyConverter;

public class Aula52_ExercicioFixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double result = Aula52_CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f %n", result);
				
		sc.close();
	}

}
