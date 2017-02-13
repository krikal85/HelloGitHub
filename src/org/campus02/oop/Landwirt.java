package org.campus02.oop;

public class Landwirt extends Einwohner {

	private int grundflaeche;
	public Landwirt(int grundflaeche, String bundesland) {
		super(grundflaeche*100, bundesland);
		 this.grundflaeche=grundflaeche;
	}

	public int getGrundflaeche() {
		return grundflaeche;
	}

	public void setGrundflaeche(int grundflaeche) {
		this.grundflaeche = grundflaeche;
	}

	@Override
	public double steuer() {
		double steuer = 0;
		steuer = (getEinkommen()/100)*22.5;
		return steuer;
	}

}
