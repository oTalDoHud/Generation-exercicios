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
		else if(acoes.toUpperCase().equals("NAO") || acoes.toUpperCase().equals("NÃO")) {
			System.out.println("O cachorro não corre");
		}else {
			throw new IllegalArgumentException("Digite Sim/Não");
		}
	}

	@Override
	public void latir(String acoes) {
		if(acoes.toUpperCase().equals("SIM")) {
			System.out.println("O cachorro late");
		}
		else if(acoes.toUpperCase().equals("NAO") || acoes.toUpperCase().equals("NÃO")) {
			System.out.println("O cachorro não late");
		}else {
			throw new IllegalArgumentException("Digite Sim/Não");
		}
	}

	@Override
	public void subirArvore(String acoes) {
		System.out.println("O cachorro não sobe em arvore");
	}
}
