package Polimorfismo;
/*Exerc�cio:
Implemente um programa que crie os 3 tipos de animais e invoque o m�todo que emite o som de cada um de forma polim�rfica, 
isto �, independente do tipo de animal.*/

public class TestaAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cachorro cachorro = new Cachorro();
      Cavalo cavalo = new Cavalo();
      Preguica preguica = new Preguica();
      
      cachorro.setNome("Mel");
      cachorro.setIdade(5); 
      cavalo.setNome("Pedepano");
      cavalo.setIdade(7);
      preguica.setNome("Tati");
      preguica.setIdade(2);
      
      cachorro.Emitirsom();
      cavalo.Emitirsom();
      preguica.Emitirsom();
	}

}
