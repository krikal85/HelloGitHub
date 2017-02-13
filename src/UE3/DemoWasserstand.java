package UE3;

public class DemoWasserstand {

	public static void main(String[] args) {
		Wasserstand w1 = new Wasserstand(1, "Mürz", 20, 25, 19);
		Wasserstand w2 = new Wasserstand(2, "Mürz", 204, 25, 12356);
		Wasserstand w3 = new Wasserstand(3, "See", 25, 25, 123578);
		Wasserstand w4 = new Wasserstand(4, "Mürz", 20, 30, 33);
		
		WasserstandManager manager = new WasserstandManager();
		manager.addStand(w1);
		manager.addStand(w2);
		manager.addStand(w3);
		manager.addStand(w4);
		
		//System.out.println(manager.findById(4));
		//System.out.println(manager.findAllByGewaesser("Mürz"));
		//System.out.println(manager.findNewestWasserstandForGewaesser("Mürz"));
		//System.out.println("Oldest : "+manager.findOldestWasserstandForGewaesser("Mürz"));
		//System.out.println("Alarm: "+manager.findForAlarmierung());
		
		System.out.println("Zeitspane: "+manager.findByZeitspanne(19, 32, "Mürz"));

	}

}
