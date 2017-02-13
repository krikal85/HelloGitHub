package org.campus02.oop;

public class DemoEinwohner {

	public static void main(String[] args) {
		Kuenstler e1 = new Kuenstler(1200,"Steiermark",100);
		Kuenstler e2 = new Kuenstler(1200,"Körnten",100);
		//System.out.println(e1.steuer());
		Bundesstaat b1 = new Bundesstaat();
		b1.add(e1);
		b1.add(e2);
		
		System.out.println(b1.steuerNachBundesland());
		
	}

}
