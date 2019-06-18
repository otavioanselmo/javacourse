package secao2_Explicacao;

import java.util.Scanner;

public class Aula28_SintaxeAlternativaSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite de 1 a 7 para identificar o dia da semana: ");
		int x = sc.nextInt();
		String day = null;
		
		
		switch (x) {
		case 1:
			day = "Domingo";
			break;
		case 2:
			day = "Segunda-feira";
			break;
		case 3:
			day = "Terça-feira";
			break;
		case 4:
			day = "Quarta-feira";
			break;
		case 5:
			day = "Quinta-feira";
			break;
		case 6:
			day = "Sexta-feira";
			break;
		case 7:
			day = "Sábado";
			break;
		}
		
		System.out.println("Dia da semana: " + day);
		
		sc.close();
	}

}
