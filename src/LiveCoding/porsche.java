package LiveCoding;

public class porsche {

	public static void main(String[] args) {
		
		Car porsche911 = new Car();
		porsche911.setColour("red");
		porsche911.colour = "black";
		//porsche911.colour = "red";
	
		porsche911.countDoors = 3;
		porsche911.productionYear = 1990;
		porsche911.engine = new engine();
		porsche911.engine.number ="AT16233";
		
		System.out.println(porsche911.colour);
	//	System.out.println(porsche911.colour);

	}

}
