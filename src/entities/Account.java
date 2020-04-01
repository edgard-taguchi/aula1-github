package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
//construtores
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
// valor inicial é um deposito
//		this.balance = balance;
	}
	
	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

//getters e setters
	public int getNumber() {
		return number;
	}

//numero da conta não pode ser alterado
/*	public void setNumber(int number) {
		this.number = number;
	}*/ 

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

//saldo da conta é alterado com deposito ou saque	
/*	public void setBalance(double balance) {
		this.balance = balance;
	}*/
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0; 
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}
}
