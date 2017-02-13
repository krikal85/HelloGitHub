package Pruefungsvorbereitung;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
	ArrayList<Figure> figures = new ArrayList<>();
	
	public void add (Figure f){
		figures.add(f);
	}
	
	public double getMaxPerimeter(){
		double wholeperimeter=0;
		for (Figure figure : figures) {
			if (wholeperimeter < figure.getPerimiter()){
				wholeperimeter = figure.getPerimiter();
			}
			
		}
		return wholeperimeter;
	}
	
	public double getAverageAreaSize(){
		double area=0;
		int count = 0;
		for (Figure figure : figures) {
			//area= figure.getArea();
			area = area + figure.getArea();
			count++;
		}
		System.out.println("Count: "+count+"Area: "+area);
		area = area/count;
		
		return area;
	}
	
	public HashMap<String,Double> getAreaBySizeCategories(){
		HashMap<String,Double> map = new HashMap<>();
		double count =0;
		for (Figure figure : figures) {
			if(map.containsKey(figure.getCategory())){
				count = map.get(figure.getCategory());//+ count + figure.getArea();
				count = count + figure.getArea();
				map.put(figure.getCategory(), count);
			}
			else{
				map.put(figure.getCategory(), figure.getArea());
			}
		}
		return map;
	}
}
