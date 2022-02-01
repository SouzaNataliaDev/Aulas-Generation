package Heranca;

import java.util.Scanner;

public class Preguica extends Animal {
	boolean op = true;
	Scanner leia = new Scanner(System.in);
	public void Subiremarvores() { /*Tati sobe em arvores sempre que às vê.*/
		
		
		System.out.println("A preguiça viu uma arvore?");
		op = leia.nextBoolean();
		if (op == true) {
			System.out.println("A preguiça subiu na árvore...");
		}
		else if (op != true) {
			System.out.println("A preguiça não subiu na árvore pois não avistou nenhuma...");
		}
	}
	public void Emitirsom() {
		System.out.println("\n(Imaginar preguiça emitindo barulhos....)");
	
}
}
