package Familia44;

import java.util.Scanner;

/* 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

public class Exercicio3 {
	
	public static void main (String[] args) {
		
		int totalseg, seg, min, hora;
		
		System.out.println("Quantos segundos durou o evento?");
		
		Scanner leia = new Scanner(System.in);
		totalseg = leia.nextInt();
		
		hora = totalseg / 3600; 
		min = (totalseg % 3600) / 60; // 
		seg = (totalseg%3600) % 60; 
		
		System.out.println("O evento durou " +hora+ " hora (s), " +min+ " minutos, e " +seg+ " segundos..." );
	}

}
