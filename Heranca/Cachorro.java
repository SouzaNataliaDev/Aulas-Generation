package Heranca;

import java.util.Scanner;

public class Cachorro extends Animal {

	boolean op = true;
	Scanner leia = new Scanner(System.in);

	public void correr() { /* meu cachorro corre quando v� o dono */
		System.out.println("O dono do cachorro chegou em casa?");
		op = leia.nextBoolean();
		if (op == true) {
			System.out.println("O cachorro consegue correr e abanar o rabo...");
		} else if (op != true) {
			System.out.println("O dono n�o chegou, por isso o cachorro n�o correu...");

		}
	}

	public void Emitirsom() {
		System.out.println("\nAu au au au...(Latido de cachorro)");
	}

}
