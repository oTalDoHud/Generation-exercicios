package entities;

public class Preguica extends Animal{

	public Preguica(String nome) {
		super(nome, "Cavalo");
	}

	@Override
	public void corre(String acoes) {
			System.out.println("O preguica não corre");
		
	}

	@Override
	public void latir(String acoes) {
		
			System.out.println("O preguica não late");
		
	}

	@Override
	public void subirArvore(String acoes) {
		if(acoes.toUpperCase().equals("SIM")) {
			System.out.println("O preguica sobe em arvores");
		}
		else if(acoes.toUpperCase().equals("NAO") || acoes.toUpperCase().equals("NÃO")) {
			System.out.println("O preguica não sobe em arvores");
		}else {
			throw new IllegalArgumentException("Digite Sim/Não");
		}
	}
}
