package generics;

public class WoerterStartenMitGrossbuchstaben {
	public static void main(String[] args) {
		String woerter = "Wörter starten mit Großbuchstaben";
		String result ="";
		for(int i = 0; i<woerter.length();i++){
			char c = woerter.charAt(i);
			if(i == 0 ||  woerter.charAt(i-1) == ' '){
				
				c = Character.toUpperCase(c);
			
				
			}
			result = result +c;
		}
		System.out.println(result);
	}
}
