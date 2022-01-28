package Familia44;

import java.util.Scanner;

/* Ler 10 numeros e imprimir quantos são pares e quantos sãi impares. */

public class ExercicoPara {
	
	public static void main (String[] args) {
		
		int n, x, par=0, impar=0;
		Scanner leia = new Scanner (System.in);
		
		
		
		for (x=0; x<=10; x++) {
			
			n = leia.nextInt();
			if (n%2 == 0) {
				par++;
			} else if (n%2 !=0) {
				impar++;
					
				}
		}
	}

}
