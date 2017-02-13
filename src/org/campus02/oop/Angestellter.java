package org.campus02.oop;

public class Angestellter extends Einwohner {

	private int kinder;
	public Angestellter(int einkommen, int kinder,String bundesland) {
		super(einkommen, bundesland);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double steuer() {
		double steuer =0;
		switch (kinder) {
		case 0:
			steuer = (getEinkommen()/100)*50;
			break;
		case 1:
			steuer = (getEinkommen()/100)*40;
			break;
		case 2:
			steuer = (getEinkommen()/100)*30;
			break;
		case 3:
			steuer = (getEinkommen()/100)*15;
			break;

		default:
			steuer = (getEinkommen()/100)*5;
			break;
		}
		return steuer;
	}

}
