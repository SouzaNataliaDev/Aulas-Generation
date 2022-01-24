programa
{
/* 1. Faça um programa que crieum vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
 *  Após encontre a maior pontuação e a apresente.*/
 
	
	funcao inicio()
	{
		inteiro vetor[5], X, Mpontuacao = 0

		para(X=0;X<5;X++) {
			escreva("Entre com a pontuação:")
			leia(vetor[X])

			se (vetor[X]>Mpontuacao){
				Mpontuacao=vetor[X]
				
			}
			
		}
		escreva("A primeira pontuação é:" +vetor[0],"\nSegundos:" +vetor[1], "\nTerceira:" +vetor[2], "\nQuarta:" +vetor[3], 
		"\nQuinta:" +vetor[4])
		escreva("\nA maior pontuação foi:"+Mpontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */