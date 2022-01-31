package entities;

public class Cliente {
	
	//Atributos
	private String name;
	
	private double altura;
	
	private double peso;

	//Construtor
	public Cliente(String hud, double Carol, double lindinho) {
		this.name = hud;
		this.altura = Carol;
		this.peso = lindinho;
	}
	
	public Cliente(String nome, double peso) {
		this.name = nome;
		this.peso = peso;
	}

	//Getter and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	//Arquitetura de software - SOLID
	public String imc() {
		double imc = this.peso / (this.altura * this.altura);
		return String.format("%.2f", imc);//YY,XX
	}
	//Recebe um número e retone o mesmo no tipo String só que 
	//formatado para a moeda da nação
	
	//alt + shift + s 
}