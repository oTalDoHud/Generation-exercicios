programa
{
	
	funcao inicio()
	{
		inteiro numero, cont, total, media, contNegativo
		
		numero = 1
		cont = 0
		total = 0
		media = 0
		contNegativo = 0
		
		enquanto(numero!=0){
			escreva("\nEntre um valor numerico: ")
			leia(numero)

			se(numero>0){
				cont++

				//total = total + n
				total += numero
			}
		}
		
		media = total / cont
		
		escreva("\nO total de números informados: " + cont)
		escreva("\nMedia: " + media)
		escreva("\nTotal: " + total)

		escreva("\nO total de números negativos informados: " + contNegativo)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = 32, 16, 19, 28, 15;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 10, 6}-{cont, 6, 18, 4}-{total, 6, 24, 5}-{media, 6, 31, 5}-{contNegativo, 6, 38, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */