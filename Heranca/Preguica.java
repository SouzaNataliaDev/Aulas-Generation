package Heranca;

import java.util.Scanner;

public class Preguica extends Animal {
	boolean op = true;
	Scanner leia = new Scanner(System.in);
	public void Subiremarvores() { /*Tati sobe em arvores sempre que �s v�.*/
		
		
		System.out.println("A pregui�a viu uma arvore?");
		op = leia.nextBoolean();
		if (op == true) {
			System.out.println("A pregui�a subiu na �rvore...");
		}
		else if (op != true) {
			System.out.println("A pregui�a n�o subiu na �rvore pois n�o avistou nenhuma...");
		}
	}
	public void Emitirsom() {
		System.out.println("\n(Imaginar pregui�a emitindo barulhos....)");
	
}
}
