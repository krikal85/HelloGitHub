package Vererbung;

import java.util.ArrayList;

public class Hasenstall {

	public static void main(String[] args) {
		Osterhase oh = new Osterhase("Felix");
		oh.hoppeln();
		oh.schlafen();
		oh.functionOster();
		
		Hase h = oh;
		h.schlafen();
		
		Weihnachsthase wh = new Weihnachsthase("santa");
		wh.hoppeln();
		wh.schlafen();
		wh.verteiltGeschenke();
		
		ArrayList<Osterhase> osterhase = new ArrayList<>();
		
		ArrayList<Weihnachsthase> weihnachtshase = new ArrayList<>();
		ArrayList<Hase> hase = new ArrayList<>();
		hase.add(h);
		hase.add(wh);
		hase.add(oh);
	}

}
