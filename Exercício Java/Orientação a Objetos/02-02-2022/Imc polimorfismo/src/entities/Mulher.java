package entities;

public class Mulher extends Pessoa{

	public Mulher(String nome, double peso,
			double altura) {
		super(nome, "Feminino", peso, altura);
	}

	@Override
	public double imc() {//calcula o imc
		return peso * peso / (altura * altura);
	}
	
	public void imprimirMulher(Mulher m) {
		System.out.println("A imc da cliente: " 
				+ m.getNome() + " é de:  " + m.imc());
	}
}
