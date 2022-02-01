package Heranca;

public class TesteAnimal  {
	
	public static void main (String[] args) {
		
		Cachorro Mel = new Cachorro();
		Cavalo Pedepano = new Cavalo();
		Preguica tati = new Preguica();
		
		System.out.println("Responda as perguntas com true ou false.");
		Mel.correr();
		Pedepano.correr();
		tati.Subiremarvores();
		Mel.Emitirsom();
		Pedepano.Emitirsom();
		tati.Emitirsom();
	}

}
