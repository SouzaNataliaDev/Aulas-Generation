package Familia44;

import java.util.Scanner;

public class Vetores {

	/*
	 * 2- Faça um programa que receba 6 números inteiros e mostre: • Os números
	 * pares digitados; • A soma dos números pares digitados; • Os números ímpares
	 * digitados; • A quantidade de números ímpares digitados.
	 */

	public static void main(String[] args) {

		int vetor[] = new int[6], x = 0, Npares = vetor[x] % 2, Somapar = 0, Nimpares = 0, Qimpar = 0;
		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 6; x++) {
			System.out.println("Escreva um número:");
			vetor[x] = leia.nextInt();
		}
		for (x = 0; x < 6; x++) {
			if (vetor[x] % 2 == 0) {
				Npares = vetor[x];

				System.out.println("O número " + Npares + " é par...");
				Somapar = Somapar + Npares;
				}
			else {
				Nimpares = vetor[x];
				Qimpar++;
				System.out.println("O número: " + Nimpares + " é impar...");
			}
			}
		System.out.println("A soma dos números pares é: " + Somapar);
		System.out.println(+Qimpar+ " dos números digitados são impares!");

	}

}
