package application;

import entities.Homem;
import entities.Mulher;

public class Program {
	public static void main(String[] args) {
		
		Homem hud = new Homem("Hudson Lucas", 68, 1.75);
		
		Mulher carol = new Mulher("Carolina Lopes", 60, 1.77);
		
		System.out.println("A imc da cliente: " 
				+ carol.getNome() + " � de:  " + carol.imc());
		
		System.out.println("A imc da cliente: " 
				+ hud.getNome() + " � de:  " + hud.imc());
		
	}
}
