package entities;

public class Homem extends Pessoa{

	// Construtor 
	// Homem hud = new Homem("Hudson", 68, 1.75);

	public Homem(String nome, double peso,
			double altura) {
		super(nome, "Masculino", peso, altura);
	}

	@Override
	public double imc() {//calcula o imc
		return peso / (altura * altura);
	}
}
