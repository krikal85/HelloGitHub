package LiveCoding;

public class Textdocument extends document{

	public Textdocument(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	private String content;
	public Textdocument(String fileName, String content){
		super(fileName);
		this.content = content;
	}
	
	public void printDocument(){
		System.out.println("Textdokument: "+fileName+" => "+content);
	}
}
