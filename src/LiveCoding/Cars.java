package LiveCoding;

public class Cars extends Product implements Moveable{

	String type;
	String color;
	int weight;
	
	public Cars(int productCode,String type,String color, int weight) {
		super(productCode);
		this.type = type;
		this.color= color;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public void move(String destination) {
		System.out.println(color+" "+type+" "+color+" will be moved "+destination);
		
	}
	
	
	
}
