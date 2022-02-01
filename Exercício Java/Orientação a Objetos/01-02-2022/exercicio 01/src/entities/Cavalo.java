package entities;

public class Cavalo extends Animal{
	
	private boolean deveCorrer;

	public Cavalo(String nome, int idade, boolean imiteSom, boolean deveCorrer) {
		super(nome, idade, imiteSom);
		this.deveCorrer = deveCorrer;
	}

	public boolean isDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}

	@Override
	public String toString() {
		return "Cavalo [deveCorrer=" + deveCorrer + ", isDeveCorrer()=" + isDeveCorrer() + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", isImiteSom()=" + isImiteSom() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
