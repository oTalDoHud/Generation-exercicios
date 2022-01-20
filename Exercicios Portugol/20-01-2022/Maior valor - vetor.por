programa
{
	//Faça um programa que crie um vetor por leitura com 5 valores de 
	//pontuação de uma atividade e o escreva em seguida. Encontre após 
	//a maior pontuação e a apresente.
	
	funcao inicio()
	{
		inteiro vec[5], maiorNumero=0

		para(inteiro i=0;i<5;i++){
			escreva("\nEntre valores numericos: ")
			leia(vec[i])
		}

		para(inteiro i=0;i<5;i++){
			se(vec[i] > maiorNumero){
				maiorNumero = vec[i]
			}
		}

		escreva("\nO maior número é: " + maiorNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */