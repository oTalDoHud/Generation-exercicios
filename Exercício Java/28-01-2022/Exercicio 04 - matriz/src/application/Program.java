package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		
		int[][] matrizTrans = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
//				System.out.print("Insira os valores da primeira "
//						+ "matriz na posição [" + i + "][" + j + "]: ");
//				matriz1[i][j] = sc.nextInt();
				matriz1[i][j] = 2;
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
//				System.out.print("Insira os valores da segunda "
//						+ "matriz na posição [" + i + "][" + j + "]: ");
//				matriz2[i][j] = sc.nextInt();
				matriz2[i][j] = 4;
			}
		}

		int op = sc.nextInt();

		switch (op) {
		case 1:
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matrizTrans[i][j] = matriz2[i][j] + matriz1[i][j];
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matrizTrans[i][j]);
				}
			}
			break;
			
		case 2:
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matrizTrans[i][j] = matriz2[i][j] - matriz1[i][j];
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matrizTrans[i][j]);
				}
			}
			break;
			
		case 3:
			System.out.print("Entre com a constante: ");
			int num = sc.nextInt();
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matriz2[i][j] = matriz2[i][j] + num;
					matriz1[i][j] = matriz1[i][j] + num;
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matriz1[i][j]);
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matriz2[i][j]);
				}
			}
			
			break;
		case 4:
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matriz1[i][j]);
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matriz2[i][j]);
				}
			}
			break;

		}
		
		sc.close();
	}
}
