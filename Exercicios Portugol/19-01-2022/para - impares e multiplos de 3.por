programa
{
	
	funcao inicio()
	{
		inteiro total = 0
		inteiro i = 1
		para(i; i<=500; i++){
			se(i%3 == 0){
				se(i%2 != 0){
					total += i
					//escreva("\n Esse número aqui, é impar e multiplo de 3: " + i)
				}
			}
		}

		escreva("\nO total é: " + total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 127; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */