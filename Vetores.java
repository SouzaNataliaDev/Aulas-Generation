package Familia44;

import java.util.Scanner;

public class Vetores {

	/*
	 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: � Os n�meros
	 * pares digitados; � A soma dos n�meros pares digitados; � Os n�meros �mpares
	 * digitados; � A quantidade de n�meros �mpares digitados.
	 */

	public static void main(String[] args) {

		int vetor[] = new int[6], x = 0, Npares = vetor[x] % 2, Somapar = 0, Nimpares = 0, Qimpar = 0;
		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 6; x++) {
			System.out.println("Escreva um n�mero:");
			vetor[x] = leia.nextInt();
		}
		for (x = 0; x < 6; x++) {
			if (vetor[x] % 2 == 0) {
				Npares = vetor[x];

				System.out.println("O n�mero " + Npares + " � par...");
				Somapar = Somapar + Npares;
				}
			else {
				Nimpares = vetor[x];
				Qimpar++;
				System.out.println("O n�mero: " + Nimpares + " � impar...");
			}
			}
		System.out.println("A soma dos n�meros pares �: " + Somapar);
		System.out.println(+Qimpar+ " dos n�meros digitados s�o impares!");

	}

}
