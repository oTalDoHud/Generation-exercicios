programa
{
	
	funcao inicio()
	{
		//233 a 456
		//3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		inteiro cont

		cont = 233
		faca{
			escreva("\n" + cont)

			se(cont>=300 e cont<=400){
				//cont = cont + 3
				cont += 3
			}
			senao{
				cont += 5
			}
		}
		enquanto(cont<=456)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 178; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */