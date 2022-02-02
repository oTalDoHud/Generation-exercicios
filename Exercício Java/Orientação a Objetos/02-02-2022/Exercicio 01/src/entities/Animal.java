package entities;

public abstract class Animal {
	
	private String nome;
	
	private String especie;

	public Animal(String nome, String especie) {
		super();
		this.nome = nome;
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public abstract void corre(String acoes);
	
	public abstract void latir(String acoes);
	
	public abstract void subirArvore(String acoes);

}
