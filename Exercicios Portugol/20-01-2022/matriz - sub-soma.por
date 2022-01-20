programa
{
	
	funcao inicio()
	{
		inteiro vec[10], maiorNumero = 0, cont = 0
		real media, total = 0.0

		//i = linha
		//j =coluna

		//Receber dados
		para(inteiro i=0;i<10;i++){
			escreva("\nEntre com um valor numerico: ")
			leia(vec[i])
			total = total + vec[i]

			se(vec[i] > maiorNumero){
				maiorNumero = vec[i]//11
			}
		}

		para(inteiro i=0;i<10;i++){//3 [7-11-3-11]
			se(vec[i] == maiorNumero){// 11 == 11
				cont++//2
			}
		}

		para(inteiro i=0;i<10;i++){
			escreva("\n" + vec[i])
		}
		
		media = total / 10

		escreva("\nMedia: " + media)
		escreva("\nMario número: " + maiorNumero)
		escreva("\nAparição do maior número: " + cont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vec, 6, 10, 3}-{media, 7, 7, 5}-{total, 7, 14, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */