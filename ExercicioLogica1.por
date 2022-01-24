programa
{
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
	
	funcao inicio()
	{
		inteiro idade=0, dias=0, anos=0, meses=0
		
		escreva("Quantos anos voce tem?")
	     leia(anos)
	     escreva("Quantos meses?")
	     leia(meses)
	     escreva("Quantos dias?")
	     leia(dias)

	     
	     idade = (anos*365) + (meses*30) + dias

	     escreva("Você tem:" +idade, " de idade expressa em dias")

	     }
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */