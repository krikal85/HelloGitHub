package Pruefungsvorbereitung;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrom("O Genie, der Herr ehre Dein Eo!"));

	}
	
	public static boolean isPalindrom(String wort){
		
		if (wort.length()<=1){
			return true;
		}
		char first = Character.toLowerCase(wort.charAt(0));
		char last = Character.toLowerCase(wort.charAt(wort.length()-1));
		if(Character.isLetter(first)&&Character.isLetter(last)) {
			if(first != last){
				 return false;
			 }
			 else if (first==last){
				 return isPalindrom(wort.substring(1,wort.length()-1));
			 }
			 return false;
			}
		else if(!Character.isLetter(first)){
			 return isPalindrom(wort.substring(1,wort.length()));
		}
		else if(!Character.isLetter(last)){
			 return isPalindrom(wort.substring(0,wort.length()-1));
		}
		return false;
	}
}
