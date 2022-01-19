programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro i, x=20, nFilhos, totalFilhos=0, mediaFilhos=0, cont=0, porcentSalario=0
		real salario, totalSalario=0.0, mediaSalario=0.0, maiorSalario=0.0

		para(i=0;i<x;i++){
			escreva("\nEntre com salário: ")//saida de dados
			leia(salario)//Entrada de dados

			escreva("\nEntre com número de filhos: ")
			leia(nFilhos)

			//totalSalario = totalSalario + salario
			totalSalario += salario
			mediaSalario = totalSalario / x

			totalFilhos += nFilhos
			mediaFilhos = totalFilhos / x

			//101
			//101
			se(salario > maiorSalario){
				maiorSalario = salario
			}

			se (salario <= 100.0){
				cont++
			}
			
			porcentSalario = cont * 100 / x
			
		}

		escreva("\nA média de salário entre esses habitante é: R$" + Matematica.arredondar(mediaSalario, 2))
		escreva("\nA média de filhos entre esses habitante é: " + Matematica.arredondar(mediaFilhos, 2))
		escreva("\nO maior salário informado foi: R$" + Matematica.arredondar(maiorSalario, 2))
		escreva("\nA porcentagem de pessoas recebendo abaixo de R$100 é de: " + Matematica.arredondar(porcentSalario, 2) + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */