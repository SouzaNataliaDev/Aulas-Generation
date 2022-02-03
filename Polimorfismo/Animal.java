package Polimorfismo;

public abstract class Animal {
	
	protected String nome;
	protected int idade; //atributos
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public abstract void Emitirsom(); //M�todos

}
