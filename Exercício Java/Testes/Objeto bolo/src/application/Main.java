package application;

import entities.Bolo;

public class Main {
	public static void main(String[] args) {
		
		Bolo chocolate = new Bolo("Chocolate", "Redondo", 1.250);
		Bolo mulangu = new Bolo("Morango", "Coração", 1);
		
		double pesoTotal = chocolate.getPeso() + mulangu.getPeso();
		
		System.out.println(pesoTotal);
	}
}
