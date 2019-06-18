package pdf_exerciciosReforco;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two integer numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int begin = x, end = y;
		
		if (y < x) {
			begin = y;
			end = x;
		}
		
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		
		System.out.println("Sum of odd numbers = " + sum);
		
		sc.close();
	}

}
