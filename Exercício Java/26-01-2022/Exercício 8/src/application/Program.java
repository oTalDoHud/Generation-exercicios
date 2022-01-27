package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double  distri = 28;
		double  impost = 45;
		
		System.out.print("Entre com o valor de fabricação: ");
		double fabri = sc.nextDouble();
		
		distri = (fabri * distri) / 100;
		impost = (fabri * impost) / 100;
		
		double valorFinal = fabri + distri + impost; 
		System.out.println(valorFinal);
		sc.close();
	}
}
