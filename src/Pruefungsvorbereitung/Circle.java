package Pruefungsvorbereitung;

public class Circle extends Figure{
	private double radius;
	public Circle(double radius) {
		this.radius= radius;
	}
	@Override
	public double getPerimiter() {
		double perimeter = radius*Math.PI*2;
		return perimeter;
	}

	@Override
	public double getArea() {
		double area = radius*radius*Math.PI;
		return area;
	}
	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
