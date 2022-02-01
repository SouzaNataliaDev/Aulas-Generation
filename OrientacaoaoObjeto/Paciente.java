package Orientacaoaoobjeto;

public class Paciente {

	public int idade;
	public String nome;
	public String sintomas;
	
	
	public Paciente(int idade, String nome) {
		
		this.idade = idade;
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public void atendimento (int idade) {
		this.idade = idade;
		if (this.idade<18) {
			System.out.println("Voc� tem:" +idade+ " anos, seu atendimento � pediatrico...");
		}
		else {
			System.out.println("Voc� tem:" +idade+ " anos, seu atendimento � adulto...");
		}
	}

	
}
