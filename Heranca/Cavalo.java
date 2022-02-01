package Heranca;

import java.util.Scanner;

public class Cavalo extends Animal {

	Scanner leia = new Scanner(System.in);
	boolean op = true;

	public void correr() {/* Cavalo corre quando recebe um comando */

		System.out.println("O cavalo consegue correr quando recebe um comando. \nO cavalo recebeu o comando?");
		op = leia.nextBoolean();
		if (op == true) {
			System.out.println("O cavalo correu...");
		} else if (op != true) {
			System.out.println("O cavalo não recebeu comando para correr...");
		}

	}
	public void Emitirsom() {
		System.out.println("\nIiiirrrrrí...(Cavalo emitindo som)");
		
	}

}
