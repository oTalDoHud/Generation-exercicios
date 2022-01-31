package application;

import java.util.Scanner;

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

public class Program {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[2][2];
		
		//int cont = 0;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print("Entra o valor [" + i + "] [" + j + "]: ");
				matriz[i][j] = leia.nextInt();
			}
		}
		
		System.out.println();//para pular linha e ficar bunitinho <3
		int cont = 0;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				
				if(matriz[i][j] > 10) {
					cont++;
				}
			}
		}
		
		System.out.println(cont + " valore/s são maior que 10.");
		
		leia.close();
	}
}
