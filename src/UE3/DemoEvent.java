package UE3;

public class DemoEvent {

	public static void main(String[] args) {
		Event first = new Event("A", "M�rz", 5);
		Event second = new Event("B", "M�rz", 7);
		Event third = new Event("C", "Graz", 1230);
		
		EventKalender kalender = new EventKalender();
		kalender.addEvent(first);
		kalender.addEvent(second);
		kalender.addEvent(third);
		
		//System.out.println(kalender.getByTitle("b"));
		//System.out.println(kalender.getByOrt("Graz"));
	//	System.out.println(kalender.getByEintrittsPreis(10, 1000));
		//System.out.println(kalender.getMostExpensiveByOrt("M�rz"));
		System.out.println(kalender.getAvgPreisByOrt("M�rz"));
	}

}
