programa
{
	
	funcao inicio()
	{
		inteiro n1
		escreva("Numero: ")
		leia(n1)

		se(n1 % 2==0){
			se(n1>0){
				escreva("O número é par e positivo")
			}
			senao{
				escreva("O número é par e negativo")
			}
		}
		senao{
			se(n1>0){
				escreva("O número é impar e positivo")
			}
			senao{
				escreva("O número é impar e negativo")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */