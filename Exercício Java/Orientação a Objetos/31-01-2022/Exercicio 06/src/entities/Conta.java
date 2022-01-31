package entities;

public class Conta {
	
	private String nome;
	
	private String agencia;
	
	private double saldo;

	public Conta(String nome, String agencia, double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double deposito) {
		this.saldo = this.saldo + deposito;
	}
	
	public double saque(double saque) {
		//if()
		this.saldo = this.saldo - saque;
		return saque;
	}
}
