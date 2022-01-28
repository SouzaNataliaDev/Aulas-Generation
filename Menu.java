package Familia44;

import java.util.Scanner;

/*Faça um programa que mostre um Menu com opções de um cardápio de restaurante para uma pessoa. A pessoa vai escolher o prato desejado: 

Após escolher o prato, o programa deverá fazer uma pergunta ao usuário, se ele aceita pagar a gorjeta do garçom 10% sobre o valor do prato. Se o usuário aceitar, mostrar o valor final (valor do prato + 10%), caso contrário, mostrar o valor final (somente o valor do prato).
Codigo		 Prato		 	Valor 
1 		Picanha 		25,00 
2 		Lasanha 		20,00 
3 		Strogonoff 		18,00 
4 		Bife Acebolado 	15,00 
5 		Pão com ovo 		5,00 

(usar o laço condicional switch...case).
*/

public class Menu {
	

	public static void main (String[] args) {
			
			int cardapio = 0, opcao = 0; 
			float gorgeta =0, valor = 0;
		 Scanner leia = new Scanner(System.in);
		 
		System.out.println("\t\t\tMenu:"
				+ "\n1.Picanha R$: 25,00"
				+ "\n2.Lasanha R$: 20,00"
				+ "\n3.Strogonoff R$: 18,00"
		        + "\n4.Bife acebolado R$: 15,00"
		        + "\n5.Pão com ovo R$: 5,00");
		
		System.out.println("Digite o número da opção:");
		cardapio = leia.nextInt();
		
		switch(cardapio){
		case 1: System.out.println("Você escolheu Picanha.");
				valor = 25;
		break;
		case 2: System.out.println("Você escolheu Lasanha.");
		        valor = 20;
		break;
		case 3: System.out.println("Você escolheu Strogonoff.");
				valor = 18;
		break;
		case 4: System.out.println("Você escolheu Bife acebolado.");
				valor = 15;
		break;
		case 5: System.out.println("Você escolheu Pão com ovo.");
				valor = 5;
		break;
		default: System.out.println("Não é uma opção válida");
		
		}
		
		System.out.println("Você aceita pagar 10% de gorgeta para o garçom? \nDigite 1 para Sim e 2 para Não:");
		opcao  = leia.nextInt();
		
		gorgeta = valor * 1.1f;
		switch (opcao) {
	    case 1: System.out.println("Obrigada! O valor total do seu pedido é:" +gorgeta); break;
		case 2: System.out.println("Obrigada! O valor total do seu pedido é:" +valor);
		}
		
	}

}
