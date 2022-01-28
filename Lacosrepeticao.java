package Familia44;

import java.util.Scanner;

public class Lacosrepeticao {
	
	public static void main(String[] args) {
		
		/* 3- Solicitar a idade de varias pessoas e imprimir: Total de pessoas com menos de 21 anos.
		 * Total de pessoas com mais de 0 anos.
		 * O programa terminaa quando idade for = -99. (While) */
		
		int idade = 0, pessoasmenor21 = 0, pessoasmaior50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade != - 99){
			System.out.println("Entre com a sua idade:");
			idade = leia.nextInt();
			if(idade<21 && idade != -99) { 
				pessoasmenor21++;
			} else if (idade>50) {
				pessoasmaior50++;
				
				}
			
		}
		
		System.out.println("O total de pessoas menores de 21 é: " +pessoasmenor21+ " e as pessoas maiores de 50 é: " +pessoasmaior50);
	}

}
