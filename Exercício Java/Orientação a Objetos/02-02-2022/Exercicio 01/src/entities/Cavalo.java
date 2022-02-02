package entities;

public class Cavalo extends Animal{

	public Cavalo(String nome) {
		super(nome, "Cavalo");
	}

	@Override
	public void corre(String acoes) {
		if(acoes.toUpperCase().equals("SIM")) {
			System.out.println("O cavalo corre");
		}
		else if(acoes.toUpperCase().equals("NAO") || acoes.toUpperCase().equals("N�O")) {
			System.out.println("O cavalo n�o corre");
		}else {
			throw new IllegalArgumentException("Digite Sim/N�o");
		}
	}

	@Override
	public void latir(String acoes) {
		System.out.println("O cavalo late");
	}

	@Override
	public void subirArvore(String acoes) {
		System.out.println("O cavalo n�o sobe em arvore");
	}
}
