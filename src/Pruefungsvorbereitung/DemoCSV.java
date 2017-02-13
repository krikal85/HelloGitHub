package Pruefungsvorbereitung;

public class DemoCSV {

	public static void main(String[] args) {
		CSVParser myParser = new CSVParser("hallo,tach,wie,gehts,");
		System.out.println(myParser.countComma());
		myParser.print(myParser.parse());
	}

}
