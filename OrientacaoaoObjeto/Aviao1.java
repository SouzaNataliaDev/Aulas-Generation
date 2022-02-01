package Orientacaoaoobjeto;

import java.util.Scanner;

public class Aviao1 {
	public static void main (String[] args){
		
	
	int pessoas;
	
	Scanner leia = new Scanner(System.in);
	
	
 System.out.println("Entre com a quantidade de pessoas:");
 pessoas = leia.nextInt();
		 
		 Aviao Fred = new Aviao(pessoas);
 
		 Fred.voar(pessoas);
}
}