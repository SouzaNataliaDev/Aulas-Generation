package Familia44;

import java.util.Scanner;

/* Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior*/

public class sesenao {
	
	public static void main (String[] args){
		
		int n1 = 0, n2 = 0, n3 = 0, n = 0, maiorn = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
				System.out.println("Digite um n�mero:");
				n1 = leia.nextInt();
				System.out.println("Digite um n�mero:");
				n2 = leia.nextInt();
				System.out.println("Digite um n�mero:");
				n3 = leia.nextInt();
				
				System.out.println("Os n�meros foram " +n1+ "-" +n2+ '-' +n3);
				
				if (maiorn < n1) {
					maiorn = n1;
					
	               if (maiorn<n2)
						maiorn = n2;
						
					else if (maiorn<n3) 
							maiorn = n3;
				}
						
				 
				 System.out.println("O maior n�mero �: " +maiorn);
							
											
	}
}



