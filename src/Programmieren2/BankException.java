package Programmieren2;

public class BankException extends Exception{
	
	public BankException(String msg){
		
	}
	
	public BankException(String msg,Throwable cause){
		super(msg,cause);
	}
}
