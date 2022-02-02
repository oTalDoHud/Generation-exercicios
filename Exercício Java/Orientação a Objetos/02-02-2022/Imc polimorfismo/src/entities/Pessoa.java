package entities;

public abstract class Pessoa {//mandando o java fazer x coisa
	
	protected String nome;
	
	protected String genero;
	
	protected double peso;
	
	protected double altura;//nome/genero/peso/altura

	public Pessoa(String nome, String genero, double peso, double altura) {
		this.nome = nome;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) { 
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public abstract double imc();
}
