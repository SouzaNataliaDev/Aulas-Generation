package logica;

import java.util.Scanner;

public class sistema {
	public static void main(String[] args) {

		int minutos;
       int preco = 50;
		System.out.println("Quantos minutos voc� consumiu?");
		Scanner sc = new Scanner(System.in);

		minutos = sc.nextInt();

		if (minutos > 100) {
			preco += (minutos - 100) * 2;
			System.out.println("Voc� ultrapassou o plano basico, ser� cobrado 2 reais por minuto. Voc� pagara R$:" + preco+ "reais");
		}
		if (minutos <= 100) {
			System.out.println("Voc� esta no plano basico, pagara R$:" + preco+ " reais");
		}
		sc.close();
	}
	
}
