package LiveCoding;

import java.util.ArrayList;



public class PrintManager {
	
	private ArrayList<document> documents; //= new ArrayList<>();
	
	public PrintManager(ArrayList<document> documents){
		this.documents = documents;
	}
	
	public void addDocument(document d){
		documents.add(d);
	}
	
	public void printAll(){
		for(document string : documents){
			
			string.printDocument();
		}
	}
	
	public document findDocument(String fileName){
		for(document string : documents){
			if(string.fileName.equals(fileName)){
	
				return string;
			}
			
		}
		return null;
		
	}
}
