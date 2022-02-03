package application;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Program {
	public static void main(String[] args) {
		Cavalo ventania = new Cavalo("Ventania");
		ventania.corre("Sim");
		ventania.latir("não");
		ventania.subirArvore("sim");
		
		System.out.println("\n --------------\n");
		Cachorro tobs = new Cachorro("Tobs");
		tobs.corre("sim");
		tobs.latir("sim");
		tobs.subirArvore("sim");
		
		System.out.println("\n --------------\n");
		Preguica pepe = new Preguica("Pepe");
		pepe.corre("nao");
		pepe.latir("sim");
		pepe.subirArvore("sim");
	}
}
