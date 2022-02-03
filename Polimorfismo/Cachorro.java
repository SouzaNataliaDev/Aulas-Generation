package Polimorfismo;

public class Cachorro extends Animal {
	
	public void Correr() {
		System.out.println("Cachorro  correndo...");
	}

	@Override
	public void Emitirsom() {
		System.out.println("\nLatido...");
		
	}

}
