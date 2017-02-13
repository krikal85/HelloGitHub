package Pruefungsvorbereitung;

public class CSVParser {
	private String csvline;
	
	public CSVParser(String csvline){
		this.csvline=csvline;
		
	}
	
	public int countComma(){
		int numberCommas = 0;
		for (int i = 0; i < csvline.length(); i++) {
			char c = csvline.charAt(i);
			if(c == ','){
				numberCommas++;
			}
			
		}
		return numberCommas;
	}
	
	public void  print(String[] s){
		for (int i = 0; i < s.length; i++) {
			System.out.println("String "+i+" - "+s[i]);
		}
		
	}
	
	public String[] parse(){
		int comma = countComma();
		String[] mystring = new String[comma];
		String addToString = "" ;
		int m = 0;
		for (int i = 0; i < csvline.length(); i++) {
			
			char c = csvline.charAt(i);
			if(c != ','){
				addToString += c;
				
			}
			else if(c == ','){
				mystring[m]=new String(addToString);
				m++;
				addToString="";
			}
			
			
		}
		return mystring;
	}
}
