package Pruefungsvorbereitung;

public class DemoRezept {

	public static void main(String[] args) {
		Zutat[] zutaten = new Zutat[2];
		zutaten[0] = new Zutat("Brot", 10);
		zutaten[1] = new Zutat("Butter", 20);
		
		byte person = 4;
		Rezept butterbrot = new Rezept("Butterbrot",person,zutaten);
		butterbrot.printRezept();
		Rezept b2 = butterbrot.umrechnen((byte)8);
		b2.printRezept();
	}

}
