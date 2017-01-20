package LiveCoding;

import java.util.ArrayList;

public class CsvDocument extends document {

	public CsvDocument(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	
	private ArrayList<String> lines;
	
	public CsvDocument(String fileName,ArrayList<String> lines){
		super(fileName);
		this.lines = lines;
	}
	
	public void addLine(String line){
		lines.add(line);
	}
	
	public void printDocument(){
	//	for(int i = 0; i< lines.size();i++){
		for(String string : lines){
			System.out.println("CsvDocument: "+fileName+" Content: "+string);
		}
		
		
	
	}
	
}
