package Familia44;

import java.util.Scanner;

/*Fa�a um programa que mostre um Menu com op��es de um card�pio de restaurante para uma pessoa. A pessoa vai escolher o prato desejado: 

Ap�s escolher o prato, o programa dever� fazer uma pergunta ao usu�rio, se ele aceita pagar a gorjeta do gar�om 10% sobre o valor do prato. Se o usu�rio aceitar, mostrar o valor final (valor do prato + 10%), caso contr�rio, mostrar o valor final (somente o valor do prato).
Codigo		 Prato		 	Valor 
1 		Picanha 		25,00 
2 		Lasanha 		20,00 
3 		Strogonoff 		18,00 
4 		Bife Acebolado 	15,00 
5 		P�o com ovo 		5,00 

(usar o la�o condicional switch...case).
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
		        + "\n5.P�o com ovo R$: 5,00");
		
		System.out.println("Digite o n�mero da op��o:");
		cardapio = leia.nextInt();
		
		switch(cardapio){
		case 1: System.out.println("Voc� escolheu Picanha.");
				valor = 25;
		break;
		case 2: System.out.println("Voc� escolheu Lasanha.");
		        valor = 20;
		break;
		case 3: System.out.println("Voc� escolheu Strogonoff.");
				valor = 18;
		break;
		case 4: System.out.println("Voc� escolheu Bife acebolado.");
				valor = 15;
		break;
		case 5: System.out.println("Voc� escolheu P�o com ovo.");
				valor = 5;
		break;
		default: System.out.println("N�o � uma op��o v�lida");
		
		}
		
		System.out.println("Voc� aceita pagar 10% de gorgeta para o gar�om? \nDigite 1 para Sim e 2 para N�o:");
		opcao  = leia.nextInt();
		
		gorgeta = valor * 1.1f;
		switch (opcao) {
	    case 1: System.out.println("Obrigada! O valor total do seu pedido �:" +gorgeta); break;
		case 2: System.out.println("Obrigada! O valor total do seu pedido �:" +valor);
		}
		
	}

}
