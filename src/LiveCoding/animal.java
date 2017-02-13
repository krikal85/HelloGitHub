package LiveCoding;

public abstract class animal {
	
	private String color;
	private int countEyes;
	
	public animal(String color, int countEyes){
		this.color = color;
		this.countEyes= countEyes;
		
	}
	
	
	public abstract void walk();
	public abstract void makeNoise();


	public String getcolor() {
		return color;
	}
	
}
