package entities;

public class Cachorro extends Animal{
	
	private String apelido;
	
	private boolean deveCorrer;

	public Cachorro(String nome, int idade, boolean imiteSom, String apelido, boolean deveCorrer) {
		super(nome, idade, imiteSom);
		this.apelido = apelido;
		this.deveCorrer = deveCorrer;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public boolean isDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}

	@Override
	public String toString() {
		return "Cachorro [apelido=" + apelido + ", deveCorrer=" + deveCorrer + ", getApelido()=" + getApelido()
				+ ", isDeveCorrer()=" + isDeveCorrer() + ", getNome()=" + getNome() + ", getIdade()=" + getIdade()
				+ ", isImiteSom()=" + isImiteSom() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
