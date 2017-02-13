package Pruefungsvorbereitung;

public class Strings1 {

	public static void main(String[] args) {
		String word = "Wörter starten mit Großbuchstaben";
		System.out.println(upperCase(word));
	}
	
	public static String upperCase(String s){
		String result="";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(i==0|| s.charAt(i-1)==' '){
				c = Character.toUpperCase(c);
			}
			result= result +c;
		}
		return result;
		
	}

}
