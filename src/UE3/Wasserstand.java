package UE3;

public class Wasserstand {
	private int id;
	private String gewaesserName;
	private double messwert; 
	private double messWertFuerAlarmierung;
	private int zeitpunkt;
	
	public Wasserstand(int id, String gewaesserName, double messwert, double messWertFuerAlarmierung, int zeitpunkt){
		this.id = id;
		this.gewaesserName =gewaesserName;
		this.messwert = messwert;
		this. messWertFuerAlarmierung = messWertFuerAlarmierung;
		this.zeitpunkt= zeitpunkt;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGewaesserName() {
		return gewaesserName;
	}

	public void setGewaesserName(String gewaesserName) {
		this.gewaesserName = gewaesserName;
	}

	public double getMesswert() {
		return messwert;
	}

	public void setMesswert(double messwert) {
		this.messwert = messwert;
	}

	public double getMessWertFuerAlarmierung() {
		return messWertFuerAlarmierung;
	}

	public void setMessWertFuerAlarmierung(double messWertFuerAlarmierung) {
		this.messWertFuerAlarmierung = messWertFuerAlarmierung;
	}

	public int getZeitpunkt() {
		return zeitpunkt;
	}

	public void setZeitpunkt(int zeitpunkt) {
		this.zeitpunkt = zeitpunkt;
	}
	
	@Override
	public String toString(){
		return "[ID: "+id+" Name: "+gewaesserName+" Messwert: "+messwert+" Wert für Alarm: "+messWertFuerAlarmierung+" Zeitpunkt: "+zeitpunkt+"]"; 
	}
	
}
