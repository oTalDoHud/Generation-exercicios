programa
{
	
	funcao inicio()
	{
		inteiro n, cont, total, media

		n = 1
		cont = 0
		total = 0
		media = 0
		
		enquanto(n>0){
			escreva("Informe um valor: ")
			leia(n)
			se (n>0){
				cont++
				total += n
			}
		}
		
		media = total / cont
		escreva("\nForam inseridos " + cont + " valores diferentes")
		escreva("\nA soma foi de: " + total)
		escreva("\nA média foi de: " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */