package application;

import entities.Cliente;

public class Program {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Hudson", 21, 1.75, 65.5);
		
		double imc = c1.peso / (Math.pow(c1.altura, 2));
		
		System.out.println("Nome: " + c1.name);
		System.out.println("Idade: " + c1.idade);
		System.out.println("Altura: " + c1.altura);
		System.out.printf("Imc: %.2f\n", imc);
		System.out.println();
		
		Cliente c2 = new Cliente("Robson", 17, 1.92, 83.4);
		
		imc = c2.peso / (Math.pow(c2.altura, 2));
		
		System.out.println("Nome: " + c2.name);
		System.out.println("Idade: " + c2.idade);
		System.out.println("Altura: " + c2.altura);
		System.out.printf("Imc: %.2f", imc);
	}

}
