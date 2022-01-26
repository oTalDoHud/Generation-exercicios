package application;

import java.util.Scanner;

public class Program {
//	Faça um sistema que leia a idade de uma pessoa expressa 
//	em anos, meses e dias e mostre-a expressa apenas em dias.
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);//leia
		//double anos;
		
		System.out.print("Entre quantidade de anos: ");//Escreva
		double anos = leia.nextDouble();
		
		System.out.print("Entre com a quantidade de meses: ");//Escreva
		double meses = leia.nextDouble();
		
		System.out.print("Entre com a quantidade de dias: ");//Escreva
		double dias = leia.nextDouble();
		
		double total = 0;
		total += dias;//total = total + dias;
		total += (meses * 30);
		total += (anos * 365);
		
		System.out.printf("O total em dias é: %.0f", total);
		
		//System.out.printf("\nO total em dias é: %.0f", Math.PI);
		
		leia.close();
	}
}