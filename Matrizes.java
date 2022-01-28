package Familia44;

import java.util.Scanner;

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

public class Matrizes {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int y = 0, z = 0, x = 0, Quant = 0;
		Scanner leia = new Scanner(System.in);

		for (matriz[y][z] = 0; x < 9; x++) {

			System.out.println("Escreva um número:");
			matriz[y][z] = leia.nextInt();

			if (matriz[y][z] > 10) {
				Quant++;

			}
		}
		System.out.println(+Quant + " dos valores digitados são maior que 10...");
	}
}
