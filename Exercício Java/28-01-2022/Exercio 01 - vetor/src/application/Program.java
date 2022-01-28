package application;

/*1- Faça um programa que possua um vetor denominado 
A que armazene 6 números inteiros. O programa deve executar os seguintes passos:
  
 (a) Atribua os seguintes valores a esse 
 vetor: 1, 0, 5, -2, -5, 7.
 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das 
posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 

(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 

(d) Mostre na tela cada valor do vetor A, um em cada linha.

 */

public class Program {
	public static void main(String[] args) {
		int[] A = new int[6];//1, 0, 5, -2, -5, 7.
		//
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		int soma = A[0] + A[1] + A[5];
		System.out.println("O resultado da soma é: " + soma);
		
		A[3] = 100;
		System.out.println(A[3]);
		
		for(int i=0; i<A.length; i++) {//A função .length retorna o tamanho do vetor
			
			System.out.println("O valor " + (i+1) + " é: " + A[i]);
			
		}
	}
}
