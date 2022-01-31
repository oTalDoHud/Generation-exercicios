package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = 0;
		
		System.out.print("Qual combustível deseja comprar? ");
		String combustivel = sc.next();
		
		System.out.print("Quantos litros deseja abastecer? ");
		int litros = sc.nextInt();
		
		if(combustivel.toUpperCase().equals("GASOLINA")) {
			if(litros <= 20) {
				preco = litros * 5.50;
				preco = preco - (preco * 7 / 100);
			}
			else {
				preco = litros * 5.50;
				preco = preco - (preco * 8 / 100);
			}
		}
		
		if(combustivel.toUpperCase().equals("ALCOOL")) {
			if(litros <= 20) {
				preco = litros * 4.90;
				preco = preco - (preco * 6 / 100);
			}
			else {
				preco = litros * 4.90;
				preco = preco - (preco * 7 / 100);
			}
		}
		
		
		
		
		//se entrar gasolina e 10 litros e retorno = 
		
		System.out.println("-----------------");
		
		System.out.println(combustivel);
		System.out.println(litros);
		System.out.println(preco);
		
		sc.close();
	}
}
