package secao2_Explicacao;

import java.util.Scanner;

public class Aula24_EstruturasCondicionaisEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What time is it? ");
		int time = sc.nextInt();
		
		if (time < 12) {
			System.out.println("Good morning!");
		}
		else if (time < 18){
			System.out.println("Good afternoon");
		}
		else {
			System.out.println("Good evening!");
		}
		
		sc.close();
	}

}
