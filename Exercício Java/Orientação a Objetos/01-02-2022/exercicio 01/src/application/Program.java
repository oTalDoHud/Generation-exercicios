package application;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Program {
	public static void main(String[] args) {
		
		Cachorro Tobs = new Cachorro("Tobs", 6, true, "Nenem", true);
		
		Cavalo Ventania = new Cavalo("Ventania", 4, true, true);
		
		Preguica Guita = new Preguica("Pépe", 3, false, true);
		
		System.out.println(Tobs);
		System.out.println();
		
		System.out.println(Ventania);
		System.out.println();
		
		System.out.println(Guita);
	}

}
