package Pruefungsvorbereitung;

public class Bundesland extends Land {
	
	private double bruttoSozialProdukt;
	
	public Bundesland(double bruttoSozialProdukt ){
		this.bruttoSozialProdukt=bruttoSozialProdukt;
	}
	
	
	public double getBruttoSozialProdukt() {
		return bruttoSozialProdukt;
	}
	
	
	
}
