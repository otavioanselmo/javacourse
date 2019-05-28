package secao2Explicacao;

import java.util.Scanner;

public class Aula29_ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o preço: R$ ");
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("Valor do desconto: R$ " + desconto);
		
		sc.close();
	}

}
