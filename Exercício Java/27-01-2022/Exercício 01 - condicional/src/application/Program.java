package application;

import java.util.Scanner;

/*Fa�a um programa que receba tr�s inteiros e diga qual 
 * deles � o maior. */
public class Program {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n = 0;
		int maior = -999999999;
		
		for(int i=0;i<3;i++) {
			System.out.print("Entre um n�mero: ");
			n = leia.nextInt();
			
			if(n > maior) {
				maior = n;
			}
			
		}
		
		System.out.println("O maior n�mero �: " + maior);
		
		leia.close();
	}
}
