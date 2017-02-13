package LiveCoding;

public class Shirt extends Product implements Moveable{
	
	String brand;
	int size;
	String color;
	
	public Shirt(int productCode,String brand, int size, String color) {
		super(productCode);
		this.brand= brand;
		this.size= size;
		this.color=color;
	}

	public String getBrand() {
		return brand;
	}

	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	@Override
	public void move(String destination) {
		System.out.println(color+" "+brand+" "+size+" will be moved "+destination);
		
	}
	

}
