package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz =  new int [3][2];
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<2;j++) {
				
				System.out.print("Entre com o valor da linha [" 
					+ i + "] e coluna ["+ j +"] : ");
				
				matriz[i][j] = sc.nextInt();
				
			}
		}
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<2;j++) {
				System.out.println("O resultado da  linha ["
						+  i + "] e coluna ["+ j +"] multiplicado por 2 é: " +matriz[i][j]*2);
			}
		}
		
		sc.close();
	}

}
