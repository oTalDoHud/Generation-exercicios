package entities;

public class Pessoas {

	private String name;
	
	private int idade;

	public Pessoas(String name, int idade) {
		super();
		this.name = name;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "O nome do usuario é: " + name + ", e a idade é: " + idade ;
	}
	
	public static void teste() {
		System.out.println("HAHAHAHAHAHAHAH");
		System.out.println("HAHAHAHAHAHAHAH");
		System.out.println("HAHAHAHAHAHAHAH");
		System.out.println("HAHAHAHAHAHAHAH");
		System.out.println("HAHAHAHAHAHAHAH");
	}
}
