package Pruefungsvorbereitung;

public class DemoOrt {

	public static void main(String[] args) {
		Ort graz = new Ort("graz");
		Ort wien = new Ort("wien");
		Ort marburg = new Ort("marburg");
		Ort linz = new Ort ("linz");
		graz.addNachbar(marburg);
		graz.addNachbar(wien);
		wien.addNachbar(linz);
		linz.addNachbar(graz);
		marburg.addNachbar(graz);
		wien.addNachbar(graz);
		linz.addNachbar(wien);
		
		//wien.nachbarn(marburg);
		
		
		System.out.println(marburg.hasCircle());
		System.out.println(wien.countHops(wien,marburg));

	}

}
