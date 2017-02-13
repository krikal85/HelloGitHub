package UE3;

import java.util.ArrayList;

public class EventKalender {
	ArrayList<Event> events = new ArrayList<>();
	
	public void addEvent(Event e){
		events.add(e);
	}
	
	public Event getByTitle(String title){
		
		for (Event event : events) {
			if(event.getTitle().equals(title)){
				return event;
				
				
			}
			else
				System.out.println("keine Veranstaltung gefunden");
				return null;
				
		}
		
		return null;
	}
	
	public ArrayList<Event> getByOrt(String ort) {
		ArrayList<Event> eventOrte =new ArrayList<>();
		for (Event event : events) {
			if(event.getOrt().equals(ort)){
				eventOrte.add(event);
			
			}
			
		}
		return eventOrte;
		
	}
	
	public ArrayList<Event> getByEintrittsPreis(double min, double max) {
		ArrayList<Event> eventPreise = new ArrayList<>();
		for (Event event : events) {
			if(event.getEintrittsPreis()>= min && event.getEintrittsPreis()<= max)
				eventPreise.add(event);
		}
		return eventPreise;
		
	}
	
	public Event getMostExpensiveByOrt(String ort) {
		
		double hoechsterPreis = 0;
		
		Event expansive = new Event("", "", 0);
		
		for (Event event : events) {
			
			if(event.getOrt().equals(ort)){
				
				if(hoechsterPreis < event.getEintrittsPreis()){
					hoechsterPreis = event.getEintrittsPreis();
					expansive.setTile(event.getTitle());
					expansive.setOrt(event.getOrt());
					expansive.setEintrittsPreis(event.getEintrittsPreis());
				}
				
				
			}
			
		}
		return expansive;
		
	}
	
	public double getAvgPreisByOrt(String ort) {
		double average = 0;
		int count = 0;
		for (Event event : events) {
			if(event.getOrt().equals(ort)){
				average = average+ event.getEintrittsPreis();
				count++;
			}
		}
		average = average/count;
		return average;
	}
}
