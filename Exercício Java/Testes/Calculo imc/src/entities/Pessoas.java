package entities;

public class Pessoas {
	
	private String nome;
	
	private int idade;
	
	private double altura;
	
	private double peso;

	public Pessoas(String nome, int idade, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Visibilidade - Retorno - nome - (Oq ele recebe de fora)
	//corpo
	
	// shift + alt + s
	
	public String imc() {
		double imc = this.peso / (this.altura * this.altura);
		return String.format("%.2f", imc);
	}
}
