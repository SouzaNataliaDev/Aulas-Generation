package Familia44;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String [] args) {
		double x1, x2, y1, y2, dist;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o valor de Px1:");
		x1 = leia.nextDouble();
		System.out.println("Entre com o valor de Py1:");
		y1 = leia.nextDouble();
		System.out.println("Entre com o valor de Px2:");
		x2 = leia.nextDouble();
		System.out.println("Entre com o valor de Py2:");
		y2 = leia.nextDouble();		
		
		dist = Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
			
			System.out.println("A distancia entre os dois pontos � de:" +dist);
		
	}

}
