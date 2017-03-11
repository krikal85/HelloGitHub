package Programmieren2;

public class DemoBank {

	public static void main(String[] args) throws BankException, AccountNotFoundException {
		Bank bank = new Bank();
		Account Viki = new Account("Viki",1000, -1000);
		Account Eli = new Account("Eli",2000, -500);
		Account Chris = new Account("Chris",3000, -2000);
	try{	
		bank.addAccount("Viki",1000, -1000);
		bank.addAccount("Eli",2000, -500);
		bank.addAccount("Chris",3000, -2000);
		//ausgabe für bank noch dazu programmieren!
		bank.transfer("Eli", "Viki", 2000);
		System.out.println(bank);
	}catch(AccountNotFoundException e){
		e.printStackTrace();
	}catch(BankException e){
		e.printStackTrace();
	}
	finally{
		
	}
		

	}

}
