package LiveCoding;

import java.util.ArrayList;

public class LogisticsManager {

	
		ArrayList<Moveable> moveables = new ArrayList<>();
		
		public void addMoveables(Moveable m){
			moveables.add(m);
		}
		
		public void moveAll(String destination){
			for (Moveable moveable : moveables) {
				moveable.move(destination);
			}
		}
		



	

}
