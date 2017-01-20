package LiveCoding;

public class document {
	protected String fileName;
	
	public document(String fileName){
		this.fileName = fileName;
	}
	
	
	public String getFileName() {
		return fileName;
	}


	public void printDocument(){
		System.out.println(fileName);
	}
}
