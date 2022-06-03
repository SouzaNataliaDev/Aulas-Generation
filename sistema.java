package logica;

import java.util.Scanner;

public class sistema {
	public static void main(String[] args) {

		int minutos;
       int preco = 50;
		System.out.println("Quantos minutos você consumiu?");
		Scanner sc = new Scanner(System.in);

		minutos = sc.nextInt();

		if (minutos > 100) {
			preco += (minutos - 100) * 2;
			System.out.println("Você ultrapassou o plano basico, será cobrado 2 reais por minuto. Você pagara R$:" + preco+ "reais");
		}
		if (minutos <= 100) {
			System.out.println("Você esta no plano basico, pagara R$:" + preco+ " reais");
		}
		sc.close();
	}
	
}
