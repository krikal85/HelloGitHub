package Pruefungsvorbereitung;

public class Strings1 {

	public static void main(String[] args) {
		String word = "W�rter starten mit Gro�buchstaben";
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
