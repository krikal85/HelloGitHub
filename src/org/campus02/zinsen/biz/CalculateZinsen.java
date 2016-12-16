package org.campus02.zinsen.biz;

public class CalculateZinsen {

	private double kapital;
//	private int tage;
	//private double zinssatz;
	
	public CalculateZinsen (double kapital){
		this.kapital = kapital;
	}
	
	public double calculate(int tage, double zinssatz){
		 
		double zinsen = ((this.kapital*tage*zinssatz)/36000);
		return zinsen;
		
	}
}
