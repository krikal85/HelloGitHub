package LiveCoding;

public class DemoMove {

	public static void main(String[] args) {
		Cars car = new Cars(124567,"VW","blue",20000);
		Shirt tshrit = new Shirt(456778,"Adidas",38,"red");
		LogisticsManager manager = new LogisticsManager();
		
		manager.addMoveables(car);
		manager.addMoveables(tshrit);
		
		manager.moveAll("Graz");
		

	}

}
