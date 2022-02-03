package application;

import java.util.ArrayList;
import java.util.List;

import entities.Pessoas;

public class Program {
	public static void main(String[] args) {//Onde o programa
		//CLASSE MAIN
		
		//int não aceitar null; int = 0
		//Integer aceita null;  Integer = null (null, 0 , 0)
//		String nome = null;
//		Integer idade = null;
		
		List<Integer> list = new ArrayList<>();// 0 = 35
		
		List<Pessoas> listPessoas = new ArrayList<>();
		
		list.add(35);
		
		Pessoas Carol = new Pessoas("Carol Lopes", 27);//Pessoas
		Pessoas Hud = new Pessoas("Hudson Lucas", 21);
		Pessoas Gege = new Pessoas("Geraldo nomeEsquisito", 25);
		
		listPessoas.add(Carol);
		listPessoas.add(Hud);
		listPessoas.add(Gege);
		
		//for each (Tipo apelido: nomeConjunto) - SERVE PARA PERCORRER UM CONJUNTO INTEIRO
		int total = 0;
		int media = 0;
		
//		for(Pessoas x: listPessoas) {//Carol -> Carol.getNome(); <3 gege
//			System.out.println("O nome do usuario é: " 
//					+ x.getName() + ", a idade é: " 
//						+ x.getIdade());
//			total += x.getIdade();//
//		}
//		
//		media = total / listPessoas.size();//leught
//		System.out.println(total);
//		System.out.println(media);
		
		for (Pessoas x: listPessoas) {
			System.out.println(x);
		}
		
		
	}
}
