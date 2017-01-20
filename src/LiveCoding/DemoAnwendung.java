package LiveCoding;

import java.util.ArrayList;

public class DemoAnwendung {

	public static void main(String[] args) {
		Textdocument text = new Textdocument("Text.txt","blabasosifiuoisdutw");
		text.printDocument();
		ImageDocument image = new ImageDocument("Image.jpg", 2, 3, "yellow");
		image.printDocument();
		CsvDocument csv = new CsvDocument("test.csv",new ArrayList<String>());
		csv.addLine("eins");
		csv.addLine("Zwei");
		csv.printDocument();
		System.out.println("---PrintManager-----");
		PrintManager print = new PrintManager(new ArrayList<document>());
		print.addDocument(text);
		print.addDocument(image);
		print.printAll();
		if (print.findDocument("Text.txt")!=null){
			System.out.println("Doc found");
		}
		else {
			System.out.println("Doc not found");
		}

	}

}
