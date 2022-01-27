package application;

import java.util.Scanner;

/*Faça um programa que receba três inteiros e diga qual 
 * deles é o maior. */
public class Program {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n = 0;
		int maior = -999999999;
		
		for(int i=0;i<3;i++) {
			System.out.print("Entre um número: ");
			n = leia.nextInt();
			
			if(n > maior) {
				maior = n;
			}
			
		}
		
		System.out.println("O maior número é: " + maior);
		
		leia.close();
	}
}
