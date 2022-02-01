package Orientacaoaoobjeto;
                  
public class Aviao {

	public String cor;
	public String motor;
	public int lugares = 20;
	public int pessoas;

	public Aviao(int pessoas) {

		this.pessoas = pessoas;
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}

public void voar (int pessoas) {
	this.pessoas = pessoas;
	if (this.pessoas == 20) {
		System.out.println("O avião está pronto para voar, atingimos o número de passageiros");
	}
	else if (this.pessoas<20){
		System.out.println("O avião não pode decolar pois anda não atingiu o número de passageiros...");
	}
  else if (this.pessoas>20) {
	System.out.println("Ultrapassou o número de passageiros, número máximo suportado são 20 passageiros... ");
}
}
}