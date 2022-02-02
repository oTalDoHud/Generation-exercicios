package entities;

public class Preguica extends Animal{

	public Preguica(String nome) {
		super(nome, "Cavalo");
	}

	@Override
	public void corre(String acoes) {
			System.out.println("O preguica n�o corre");
		
	}

	@Override
	public void latir(String acoes) {
		
			System.out.println("O preguica n�o late");
		
	}

	@Override
	public void subirArvore(String acoes) {
		if(acoes.toUpperCase().equals("SIM")) {
			System.out.println("O preguica sobe em arvores");
		}
		else if(acoes.toUpperCase().equals("NAO") || acoes.toUpperCase().equals("N�O")) {
			System.out.println("O preguica n�o sobe em arvores");
		}else {
			throw new IllegalArgumentException("Digite Sim/N�o");
		}
	}
}
