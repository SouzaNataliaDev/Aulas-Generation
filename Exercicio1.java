package Familia44;

//1. Faça um sistema que leia a idade de uma pessoa em dias, meses, e anos e mostre-a expressa apenas em dias.

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String[] args) {
		
		int dia, mes, ano, totaldia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva os anos:");
		ano = leia.nextInt();
		System.out.println("Escreva os meses:");
		mes= leia.nextInt();
		System.out.println("Escreva os dias:");
		dia= leia.nextInt();
		
		ano = ano  * 365; //convertendo os anos em dias
		mes = mes * 30; //convertendo meses em dias
		totaldia = ano + mes + dia;
		
		System.out.println("Fazem " +totaldia+ " dias que você nasceu!");
				
		
	}

}
