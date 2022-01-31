package entities;

public class Account {
	
	private String holder;
	
	private double totalAmmount;

	public Account(String holder, double totalAmmount) {
		this.holder = holder;
		this.totalAmmount = totalAmmount;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getTotalAmmount() {
		return totalAmmount;
	}

	public void setTotalAmmount(double totalAmmount) {
		this.totalAmmount = totalAmmount;
	}
	
	public void deposit(double ammount) {
		this.totalAmmount += ammount;
	}
	
	public void withDraw(double ammount) {
		this.totalAmmount -= ammount;
	}
}
