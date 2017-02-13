package LiveCoding;
public class Frog extends animal {

	public Frog(String color, int countEyes) {
		super(color, countEyes);
		// TODO Auto-generated constructor stub
	}
	@Override
	
	public void walk(){
		System.out.println("Springt");
	}
	public void makeNoise(){
		System.out.println("Quak");
	}
}
