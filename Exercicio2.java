package Familia44;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main (String [] args) {
		
		int totaldia, dia, mes, ano;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Há quantos dias você nasceu?");
		totaldia = leia.nextInt();
		
		ano = totaldia / 365;
		mes = (totaldia % 365) / 30; //o resto da divisao que não foi transformado em dias vao ser transformado em meses
		dia = (totaldia % 365) % 30; // dia = totaldia - ano * 365 + mes * 30
		
		System.out.println("Você tem " +ano+ " anos, " +mes+ " meses, e " +dia+ " dias de vida...");
		
	}

}
