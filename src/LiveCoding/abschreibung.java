package LiveCoding;

public class abschreibung {

	public static void main(String[] args) {
		Anlage schreibtisch = new Anlage("Schreibtisch", 10000, 12);
		schreibtisch.simulate(3, 0);
		schreibtisch.renew(2000,10);
		schreibtisch.printAnlage(schreibtisch);
		

	}

}
