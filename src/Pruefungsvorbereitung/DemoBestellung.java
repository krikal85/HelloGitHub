package Pruefungsvorbereitung;

public class DemoBestellung {

	public static void main(String[] args) {
		Bestellzeile[] zeile1 = new Bestellzeile[2];
		zeile1[0]= new Bestellzeile("PC", 1,200 );
		zeile1[1]= new Bestellzeile("PC2", 2,200 );
		Bestellung b1 = new Bestellung("AT15", zeile1);
		b1.printBestellung();
		System.out.println(b1.getKosten());
	
	}

}
