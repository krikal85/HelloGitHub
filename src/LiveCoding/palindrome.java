package LiveCoding;

public class palindrome {

	public static void main(String[] args) {
		String word  = "Re nt ner!";
		//word = word.toLowerCase();
		boolean palindrom = isPalindrom(word);
		System.out.println(palindrom);
		
	}
	
	public static boolean isPalindrom(String text){
		
		if(text.length()<=1){
			return true;
		}
		
		char first = Character.toLowerCase(text.charAt(0));
		char last = Character.toLowerCase(text.charAt(text.length()-1));
		
		if(Character.isLetter(first) && Character.isLetter(last)){	
			if (first == last){
				return isPalindrom(text.substring(1,text.length()-1));
			}
			return false;
		}
		
		if (!Character.isLetter(first)){
			return isPalindrom(text.substring(1,text.length()));
		}
		
		if (!Character.isLetter(last)){
			return isPalindrom(text.substring(0,text.length()-1));
		}
		return false;
		
	}
}
