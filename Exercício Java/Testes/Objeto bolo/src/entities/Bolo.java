package entities;

public class Bolo {
	
	private String sabor;
	
	private String formato;
	
	private double peso;

	public Bolo(String sabor, String formato, double peso) {
		this.sabor = sabor;
		this.formato = formato;
		this.peso = peso;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}