package application;

import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account ac = new Account("Hudson Lucas", 500.0);
		
		int op = 1;
		System.out.println("Bem vindo ao banco saca/deposita");
		
		do {
			System.out.println("\n-- 1: DEPOSITO --");
			System.out.println("-- 2: SAQUE    --");
			System.out.println("-- 3: EXTRATO  --");
			System.out.println("-- 0: SAIR     --");
			//System.out.println("# # # # # # # #");
			System.out.print("DIGITE AQUI --> ");
			
			op = sc.nextInt();
			double quantity = 0;
			switch(op) {
			  case 1:
				  System.out.print("\nQuanto deseja depositar: ");
				  quantity = sc.nextDouble();
				  ac.deposit(quantity);
			    break;
			  case 2:
				  System.out.print("\nQuanto deseja sacar: ");
				  quantity = sc.nextDouble();
				  ac.withDraw(quantity);
			    break;
			  case 3:
				  System.out.println("\nVocê tem R$:"+ ac.getTotalAmmount() + " em conta");
				break;
			  case 0:
				  System.out.println("\nObrigado por usar o banco Saque/Deposito");
					break;
			  default:
				  if(op != 0) {
					  System.out.println("\nOpção inválida, tente 1, 2 ou 3.");
				  }
			}
		}while(op != 0);
		sc.close();
	}
}
