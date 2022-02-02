package entities;

public class Cachorro extends Animal{

	public Cachorro(String nome) {
		super(nome, "Cavalo");
	}

	@Override
	public void corre(String acoes) {
		if(acoes.toUpperCase().equals("SIM")) {
			System.out.println("O cachorro corre");
		}
		else if(acoes.toUpperCase().equals("NAO") || acoes.toUpperCase().equals("N�O")) {
			System.out.println("O cachorro n�o corre");
		}else {
			throw new IllegalArgumentException("Digite Sim/N�o");
		}
	}

	@Override
	public void latir(String acoes) {
		if(acoes.toUpperCase().equals("SIM")) {
			System.out.println("O cachorro late");
		}
		else if(acoes.toUpperCase().equals("NAO") || acoes.toUpperCase().equals("N�O")) {
			System.out.println("O cachorro n�o late");
		}else {
			throw new IllegalArgumentException("Digite Sim/N�o");
		}
	}

	@Override
	public void subirArvore(String acoes) {
		System.out.println("O cachorro n�o sobe em arvore");
	}
}
