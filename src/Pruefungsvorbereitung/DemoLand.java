package Pruefungsvorbereitung;


public class DemoLand {
	public static void main(String[] args) {
		Bundesstaat staat = new Bundesstaat();
		Bundesland land1 = new Bundesland(100);
		Bundesland land2 = new Bundesland(100);
		
		staat.addLand(land1);
		staat.addLand(land2);
		
		System.out.println(staat.getBruttoSozialProdukt());
	}
}
