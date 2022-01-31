package application;

import entities.Pessoas;

public class Main {
	public static void main(String[] args) {
		
		Pessoas ana = new Pessoas("Ana Caroline", 18, 1.70, 52);
		
		Pessoas hud = new Pessoas("Hudson Lucas", 21, 1.75, 68);
		
		System.out.println("A pessoa " + ana.getNome() + 
				" tem o IMC de: " + ana.imc());
		
		System.out.println("A pessoa " + hud.getNome() + 
				" tem o IMC de: " + hud.imc());
		
		System.out.println((hud.getIdade() + ana.getIdade()) / 2);
	}
}