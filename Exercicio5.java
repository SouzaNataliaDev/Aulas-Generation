package Familia44;

import java.util.Scanner;

/* 5.Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente. */
public class Exercicio5 {
	public static void main (String [] args) {
		
		double nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a nota1");
		nota1 = leia.nextDouble();	
		System.out.println("Entre com a nota2:");
		nota2 = leia.nextDouble();	
		System.out.println("Entre com o a nota3");
		nota3 = leia.nextDouble();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5)) / 10;
				
				System.out.println("A m�dia ponderada das notas � de: " +media);
		
	}

}
