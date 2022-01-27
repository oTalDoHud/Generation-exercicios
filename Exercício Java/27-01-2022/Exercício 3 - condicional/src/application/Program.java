package application;

import java.util.Scanner;

/*Faça um programa que receba a idade de uma 
pessoa e mostre na saída em qual categoria 
ela se encontra:
 
10-14 infantil
15-17 juvenil
18-25 adulto */

public class Program {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade = 0;
		while(true) {
			System.out.print("Entre uma idade: ");
			idade = leia.nextInt();
			
			if(idade >= 10 && idade <= 14) {
				System.out.println("Infantil");
			}
			else if(idade > 14 && idade <= 17) {
				System.out.println("Juvenil");
			}
			else if (idade > 17 && idade <= 25) {
				System.out.println("Adulto");
			}
			else {
				System.out.println("Idade inválida");
			}
			
		}
	}
}
