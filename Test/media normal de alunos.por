programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real n1, n2, n3, media, somaMedia=0.0, mediaGeral
		
		inteiro x
		
		para(x=1;x<=5;x++
){
			escreva("\nEntre com a primeira nota: ")
			leia(n1)

			escreva("\nEntre com a segunda nota: ")
			leia(n2)

			escreva("\nEntre com a terceira nota: ")
			leia(n3)

			media = (n1+n2+n3) / 3

			escreva("\nMédia do aluno: "+x+" foi de: "+media)
			se(media>=7.0){
				escreva("\nAluno foi aprovado")
				
			}
			senao se(media>=5.0){
				escreva("\nAluno está de exame")
			}
			senao{
				escreva("\nAluno reprovado")
			}
			
			somaMedia = somaMedia + media
			
			
		}
		mediaGeral = somaMedia / 5
		
		escreva("\nA media de todos os Aluno é " + Matematica.arredondar(mediaGeral, 2))
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 687; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */