package application;

import java.util.Scanner;

/*Faça um sistema que leia o tempo de duração expresso em 
segundos e mostre-o expresso em horas, minutos e segundos.*/
public class Program {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int totalSegundos, horas, minutos, segundos;
		
		System.out.print("Entre com o total de segundos: ");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos / 3600;//3900/3600 = 1,08
		
		minutos = (totalSegundos % 3600) / 60;
		
		segundos = (totalSegundos % 3600) % 60;
		//3944
		
		System.out.println("O evento durou: "+horas+" hora");
		System.out.println("O evento durou: "+minutos+" minutos");
		System.out.println("O evento durou: "+segundos+" segundos");
		
		leia.close();
	}
}
