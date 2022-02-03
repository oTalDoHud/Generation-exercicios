package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		while(idade != -99) {
			System.out.print("Entre a sua idade: ");
			try {//tente
				idade = sc.nextInt();
				
				System.out.println(idade);
				
			}
			catch (InputMismatchException e) {//pegue
				System.out.println("ERRO! Por favor, digite um número!");
			}
			finally {//finalize
				System.out.println("Estamos no finally");
			}
		}
	}
}
