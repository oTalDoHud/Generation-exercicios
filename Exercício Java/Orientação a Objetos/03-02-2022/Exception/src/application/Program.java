package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade = 0;
		try {
			do {
				System.out.print("Entre a sua idade: ");
				idade = sc.nextInt();

				System.out.println(idade);

			} while (idade > 1);
		} catch (InputMismatchException e) {// Peguei
			System.out.println("ERRO! Por favor, digite um número!");
		}
		sc.close();
	}
}
