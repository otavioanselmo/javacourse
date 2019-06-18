package pdf_exerciciosReforco;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer value: ");
		int value = sc.nextInt();
		
		while (value != 0) {
			int square = value * value;
			System.out.print("Square of value: " + square);
			System.out.println();
			System.out.print("Enter an integer value: ");
			value = sc.nextInt();
		}
		
		sc.close();
	}

}
