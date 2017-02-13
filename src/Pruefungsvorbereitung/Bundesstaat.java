package Pruefungsvorbereitung;

import java.util.ArrayList;

public class Bundesstaat extends Land{

		private ArrayList<Land> laender = new ArrayList<>();
		
		public Bundesstaat(){
			
		}
		public void addLand(Land l){
			laender.add(l);
		}
		@Override
		public double getBruttoSozialProdukt() {
			double bsp= 0;
			for (Land land : laender) {
				bsp += land.getBruttoSozialProdukt();
				
			}
			return bsp;
		}
		
}
