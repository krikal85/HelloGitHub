package UE3;

import java.util.ArrayList;

public class WasserstandManager {
	private ArrayList<Wasserstand> wasserstand = new ArrayList<>();
	
	
	public void addStand(Wasserstand w){
		wasserstand.add(w);
	}
	
	public Wasserstand findById(int id){
		for (Wasserstand stand : wasserstand) {
			if(stand.getId()==id){
				return stand;
			}
		}
		return null;
	}
	
	public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName) {
		ArrayList<Wasserstand> wasser = new ArrayList<>();
		for (Wasserstand wasserstand : wasserstand) {
			if(wasserstand.getGewaesserName().equals(gewaesserName)){
				wasser.add(wasserstand);
			}
			
		}
		return wasser;
	}
	
	public Wasserstand findNewestWasserstandForGewaesser(String gewaesserName) {
		Wasserstand newestStand = new Wasserstand(0,gewaesserName,0, 0, 0);
		int aktuellerZeitpunkt =0;
		for (Wasserstand wasserstand : wasserstand) {
			if(wasserstand.getGewaesserName().equals(gewaesserName)){
				if(aktuellerZeitpunkt < wasserstand.getZeitpunkt()){
					aktuellerZeitpunkt = wasserstand.getZeitpunkt();
					newestStand.setId(wasserstand.getId());
					newestStand.setMesswert(wasserstand.getMesswert());
					newestStand.setMessWertFuerAlarmierung(wasserstand.getMessWertFuerAlarmierung());
					newestStand.setZeitpunkt(wasserstand.getZeitpunkt());
				}
			}
		}
		return newestStand;
	}
	
	public Wasserstand findOldestWasserstandForGewaesser(String gewaesserName) {
		Wasserstand oldestStand = new Wasserstand(0,gewaesserName,0, 0, 0);
		int aktuellerZeitpunkt = 0;
		for (Wasserstand wasserstand : wasserstand) {
			if(wasserstand.getGewaesserName().equals(gewaesserName)){
				if(aktuellerZeitpunkt > wasserstand.getZeitpunkt()){
					aktuellerZeitpunkt = wasserstand.getZeitpunkt();
					oldestStand.setId(wasserstand.getId());
					oldestStand.setMesswert(wasserstand.getMesswert());
					oldestStand.setMessWertFuerAlarmierung(wasserstand.getMessWertFuerAlarmierung());
					oldestStand.setZeitpunkt(wasserstand.getZeitpunkt());
				}
				else if (aktuellerZeitpunkt==0){
					aktuellerZeitpunkt = wasserstand.getZeitpunkt();
					oldestStand.setId(wasserstand.getId());
					oldestStand.setMesswert(wasserstand.getMesswert());
					oldestStand.setMessWertFuerAlarmierung(wasserstand.getMessWertFuerAlarmierung());
					oldestStand.setZeitpunkt(wasserstand.getZeitpunkt());
				}
			}
		}
		return oldestStand;
	}
	
	public ArrayList<Wasserstand> findForAlarmierung() {
		ArrayList<Wasserstand> wasserpegel = new ArrayList<>();
		
		for (Wasserstand wasser : wasserstand) {
			if(wasser.getMessWertFuerAlarmierung()<= wasser.getMesswert()){
				wasserpegel.add(wasser);
				
			}
			
		}
		return wasserpegel;
		
	}
	
	public ArrayList<Wasserstand> findByZeitspanne(int von, int bis, String
			gewaesserName) {
		ArrayList<Wasserstand> found = new ArrayList<>();
		//Code
		for (Wasserstand wasserstand : wasserstand) {
			if(wasserstand.getGewaesserName().equals(gewaesserName)){
				if (wasserstand.getZeitpunkt()>=von && wasserstand.getZeitpunkt()<=bis){
					found.add(wasserstand);
				}
			}
			
		}
		
		return found;
	}
}
