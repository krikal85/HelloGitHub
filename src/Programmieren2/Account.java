package Programmieren2;

public class Account {
	private	String	owner;
	private double	balance;
	private double	overdraftFrame;
	
	
	public Account(String owner, double balance, double overdraftFrame) {
		super();
		this.owner = owner;
		this.balance = balance;
		this.overdraftFrame = overdraftFrame;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getOverdraftFrame() {
		return overdraftFrame;
	}
	public void setOverdraftFrame(double overdraftFrame) {
		this.overdraftFrame = overdraftFrame;
	}
	
	public void credit(double amount){
		
		balance = balance + amount;
	}
	
	public void debit(double amount)
			throws NotEnoughMoneyException{
		if(balance - amount <= overdraftFrame){
			throw new NotEnoughMoneyException();
		}
		else{
			balance = balance - amount;
		}
	}
	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", overdraftFrame=" + overdraftFrame + "]";
	}

	
	

}
