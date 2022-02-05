package Familia44;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque.
 * O programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

public class ExercicioCollections {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int op = 0;
		String itemlista = null;
		List<String> Estoque = new ArrayList<String>();

		Estoque.add("Banana");
		do {
			System.out.println(
					"Escolha uma opção para o seu estoque:" + "\n(1) Incluir um item:" + "\n(2) Excluir um item:"
							+ "\n(3) Substituir um item:" + "\n(4) Mostrar lista:" + "\n(5) Finalizar programa.");
			op = leia.nextInt();
			

			switch (op) {

			case 1:
				System.out.println("Qual item deseja incluir na lista?");
				itemlista = leia.next();
				Estoque.add(itemlista);
				System.out.println("Os produtos do estoque são:" + Estoque);
				break;
			case 2:
				System.out.println("Qual item deseja excluir da lista?");
				itemlista = leia.next();
				Estoque.remove(itemlista);
				break;
			case 3:
				System.out.println("Qual item deseja substituir?");
				String verificar = null;
				verificar = leia.next();
				if (Estoque.contains(verificar)) {
					Estoque.remove(verificar);
				}
				else {
					System.out.println("O item não foi encontrado na lista...");
				}
			
				System.out.println("Deseja subistituir " + verificar + " por qual item?");
				itemlista = leia.next();
				Estoque.add(itemlista);
				
				break;
			case 4:
				System.out.println("Os produtos do estoque são:" + Estoque);

			}

		} while (op <= 4);
		
		leia.close();

	}

}
