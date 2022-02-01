package Orientacaoaoobjeto;

public class Paciente1 {

	public static void main(String[] args) {

		Paciente[] Paciente = new Paciente[2];

		Paciente[0] = new Paciente(12, "Davi");
		Paciente[1] = new Paciente(51, "Adimalcy");

		for (int x = 0; x < 2; x++) {

			System.out.println("Nome pacientes:" + Paciente[x].nome + "\n Idade:" + Paciente[x].idade);

			Paciente[x].atendimento(Paciente[x].idade);

		}

	}

}
