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
		System.out.println("O avi�o est� pronto para voar, atingimos o n�mero de passageiros");
	}
	else if (this.pessoas<20){
		System.out.println("O avi�o n�o pode decolar pois anda n�o atingiu o n�mero de passageiros...");
	}
  else if (this.pessoas>20) {
	System.out.println("Ultrapassou o n�mero de passageiros, n�mero m�ximo suportado s�o 20 passageiros... ");
}
}
}