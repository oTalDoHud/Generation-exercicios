programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real horas, extras, salario
		escreva("Horas trabalhadas: ")
		leia(horas)

		extras = 0.0
		
		se(horas>50.0){
			extras = horas - 50

			salario = (horas - extras) * 10.00
			salario =  salario + (extras * 20.0)
		}
		senao{
			salario = horas * 10.00
		}

		escreva("Salario: R$" + Matematica.arredondar(salario, 2))
		escreva("\nHoras extras: " + Matematica.arredondar(extras, 2))
		//escreva("Salario extra: R$" + Matematica.arredondar(salario, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */