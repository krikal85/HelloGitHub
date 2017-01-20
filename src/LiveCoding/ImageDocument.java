package LiveCoding;

public class ImageDocument extends document{

	public ImageDocument(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	
	private int sizeX;
	private int sizeY;
	private String colour;
	
	public ImageDocument(String fileName,int sizeX,int sizeY, String colour){
		super(fileName);
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.colour = colour;
	}
	
	public void printDocument(){
		System.out.println("Imagedokument: "+fileName+" => "+sizeX+", "+sizeY+", "+colour);
	}

}
