package Programmieren2;

import java.util.HashMap;

public class Bank {
	private HashMap<String,Account>	accounts = new HashMap<>();
	
	public void addAccount(String owner, double
			balance, double overdraftFrame)
			throws BankException{
		if(accounts.containsKey(owner)){
			throw new BankException("Account existiert bereits");
		}
		else
			accounts.put(owner,new Account(owner, balance, overdraftFrame));
	}
	
	public void transfer(String fromOwner, String
			toOwner, double amount) throws
			AccountNotFoundException, BankException{
			
			//Account accountFrom = new Account("", 0.0, 0.0);
			//Account accountTo = new Account("", 0.0, 0.0);
			
		if(!accounts.containsKey(fromOwner) || !accounts.containsKey(toOwner)){
			throw new AccountNotFoundException("Account not found");
		}
		else{
			
				
				try {
				accounts.get(fromOwner).debit(amount);
				accounts.get(toOwner).credit(amount);
				} catch (NotEnoughMoneyException e) {
					throw new BankException("Not enough money", e);
				}
				
			
				
			}
		//}
		
	}

	@Override
	public String toString() {
		return "Bank [accounts=" + accounts + "]";
	}
	
	
}
