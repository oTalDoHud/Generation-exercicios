package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		String fruta = null;

		List<String> frutas = new ArrayList<>();

		System.out.println("-- BEM VINDO AO NOSSO ESTOQUE --");

		do {
			System.out.println("\n--ESTOQUE--");
			System.out.println("(1) Adicionar");
			System.out.println("(2) Remover");
			System.out.println("(3) Consultar");
			System.out.println("(0) Sair");
			System.out.println("------------");
			System.out.print("Digite aqui--> ");
			op = sc.nextInt();

			switch (op) {
			case 1: {
				System.out.println("\n--ADICIONAR--");
				do {
					System.out.println("\n(1) Adicionar fruta:");
					System.out.println("(0) Sair");
					System.out.println("------------");
					System.out.print("Digite aqui--> ");

					op = sc.nextInt();

					switch (op) {
						case 1: {
							System.out.print("\n--Nome da fruta: ");
							fruta = sc.next();
							frutas.add(fruta.toLowerCase());
							System.out.println("\n--Fruta " + fruta + " adicionada.");
							break;
						}
						case 0: {
							System.out.println("--Voltando ao menu.");
							break;
						}
						default:
							System.out.println("\nErro! Valor inválido! Tente utilizar:");
							System.out.print("(1) Adicionar");
							System.out.print(" - (0) Sair");
					}
				} while (op != 0);
				op = 1;
				break;
			}
			case 2: {
				System.out.println("\n--REMOVER--");
				do {
					System.out.println("\n(1) Remover fruta:");
					System.out.println("(0) Sair");
					System.out.println("------------");
					System.out.print("Digite aqui--> ");
					
					op = sc.nextInt();
					
					switch (op) {
					case 1: {
						System.out.print("\n--Nome da fruta: ");
						fruta = sc.next();
						
						if(frutas.contains(fruta.toLowerCase())) {
							System.out.println("Tem a fruta");
							frutas.remove(fruta.toLowerCase());
							System.out.println("A fruta " + fruta + " foi removida com sucesso.");
						}
						else {
							System.out.println("A fruta: " + fruta + " não está em estoque.");
						}
						break;
					}
					case 0: {
						System.out.println("--Voltando ao menu.");
						break;
					}
					default:
						System.out.println("\nErro! Valor inválido! Tente utilizar:");
						System.out.print("(1) Adicionar");
						System.out.print(" - (0) Sair");
					}
				}while(op != 0);
				op = 1;
				break;
			}
			case 3: {
				System.out.println("\n--CONSULTA--");
				do {
					System.out.println("\n(1) Consultar frutas:");
					System.out.println("(0) Sair");
					System.out.println("------------");
					System.out.print("Digite aqui--> ");
					
					op = sc.nextInt();
					
					switch (op) {
						case 1: {
							System.out.println("--TODOS OS ITENS--");
							for(String x: frutas) {
								System.out.println(x);
							}
						}
						case 0: {
							System.out.println("--Voltando ao menu.");
						}
						default:
							if(op != 0 && op != 1) {
								System.out.println("\nErro! Valor inválido! Tente utilizar:");
								System.out.print("(1) Adicionar");
								System.out.print(" - (0) Sair");
							}
					}
					
				}while(op != 0);
				op = 10;
			}
			case 0: {
				if(op == 0) {
					System.out.println("\n------------");
					System.out.println("--OBRIGADO POR USAR O NOSSO ESTOQUE!--");
				}
				break;
			}
			default:
				System.out.println("\nErro! Valor inválido! Tente utilizar:");
				System.out.print("(1) Adicionar");
				System.out.print(" - (2) Remover");
				System.out.print(" - (3) Consultar");
				System.out.println(" - (0) Sair");
			}
		} while (op != 0);

		sc.close();
	}

}
