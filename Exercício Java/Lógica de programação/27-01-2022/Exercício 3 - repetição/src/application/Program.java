package application;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. Total de 
 * pessoas com mais de 50 anos. O programa termina 
 * quando idade for =-99. (WHILE) */

public class Program {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade = 0;
		int cont21 = 0;
		int cont50 = 0;

		while (idade != -99) {
			System.out.print("Entre com a idade: ");
			idade = leia.nextInt();

			if (idade < 21 && idade > 0) {
				cont21++;
			}

			if (idade > 50 && idade < 115) {
				cont50++;
			}
		}

		System.out.println("Total de pessoas com menos "
				+ "de 21 anos: " + cont21);

		System.out.println("Total de pessoas com mais "
				+ "de 50 anos: " + cont50);

		leia.close();
	}
}