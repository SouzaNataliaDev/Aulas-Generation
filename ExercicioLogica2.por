programa
{
/* 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
	
	funcao inicio()
	{
	inteiro idade, anos, dias, meses
	
		escreva("Qual a sua idade em dias?")
		leia(dias)

		
		anos = dias / 365
		meses=(anos / 30) 
		dias = (dias % 365)/30



		escreva("Você tem:" +anos, " anos, " +meses, " meses, e " +dias, " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */