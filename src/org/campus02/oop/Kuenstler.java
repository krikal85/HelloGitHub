package org.campus02.oop;

public class Kuenstler extends Einwohner {
	
	private int einmalerloese;
	
	public Kuenstler(int einkommen, String bundesland, int einmalerloese) {
		super(einkommen, bundesland);
		this.einmalerloese=einmalerloese;
	}

	@Override
	public double steuer() {
		double steuer = (einmalerloese/100)*2 + (getEinkommen()/100)*25;
		return steuer;
	}


	
	
}
