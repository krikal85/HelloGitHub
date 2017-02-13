package Pruefungsvorbereitung;

public class DemoFigure {
	public static void main(String[] args) {
		
	
	Rectangle rechteck = new Rectangle(2,3);
	Rectangle rechteck2 = new Rectangle(3,4);
	Rectangle rechteck3 = new Rectangle(60, 30);
	
	FigureManager manager = new FigureManager();
	manager.add(rechteck);
	manager.add(rechteck2);
	manager.add(rechteck3);
	
	System.out.println(manager.getMaxPerimeter());
	System.out.println(manager.getAverageAreaSize());
	System.out.println(manager.getAreaBySizeCategories());
	}
}
