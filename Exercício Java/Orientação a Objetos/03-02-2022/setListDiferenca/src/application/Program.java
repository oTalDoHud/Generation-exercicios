package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		//Coleção<Tipo> apelido = Intanciação
		Set<Integer> set = new HashSet<>();
		
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(2);
		
		System.out.println("--LIST--");
		
		for(Integer x: list) {
			System.out.println(x);// 0 1 2 3 1
		}
		
		System.out.println("\n--SET--");
		
		for(Integer x: set) {
			System.out.println(x);// 0 1 2 3 1
		}
	}
}
