package Pruefungsvorbereitung;

public class DemoKonto {

	public static void main(String[] args) {
		JugenGiroKonto myKonto = new JugenGiroKonto("Viki", 10, 20);
		Konto konto = myKonto;
		Girokonto giro = (Girokonto) konto;
	}

}
