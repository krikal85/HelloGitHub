package Pruefungsvorbereitung;

public class Rectangle extends Figure {
	private double length;
	private double width;
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	
	
	@Override
	public double getPerimiter() {
		double perimeter = 2*length + 2*width;
		return perimeter;
	}

	@Override
	public double getArea() {
		double area = length*width;
		return area;
	}


	@Override
	public String getCategory() {
		if(getArea()<1000){
			return "Klein";
		}
		else if(getArea()>=1000 && getArea()<4999){
			return "Mittel";
		}
		else{
			return "Groß";
		}
		//return null;
	}

}
