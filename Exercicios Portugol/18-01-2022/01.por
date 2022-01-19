programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real E, M, T
		escreva("Insir o peso dos tomates: ")
		leia(T)

		E = 0.0
		M = 0.0

		se(T>50.0){
			E = T - 50.0
			M = E * 4.0
		}

		escreva("O peso do tomate é: " + T + " KG")
		escreva("\nO execesso é: " + E + " KG")
		escreva("\nA multa é de: R$" + Matematica.arredondar(M, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */