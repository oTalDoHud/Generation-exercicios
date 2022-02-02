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
		else if(acoes.toUpperCase().equals("NAO") || acoes.toUpperCase().equals("NÃO")) {
			System.out.println("O cavalo não corre");
		}else {
			throw new IllegalArgumentException("Digite Sim/Não");
		}
	}

	@Override
	public void latir(String acoes) {
		System.out.println("O cavalo late");
	}

	@Override
	public void subirArvore(String acoes) {
		System.out.println("O cavalo não sobe em arvore");
	}
}
