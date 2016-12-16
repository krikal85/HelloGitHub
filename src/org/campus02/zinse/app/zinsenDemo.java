package org.campus02.zinse.app;

import org.campus02.zinsen.biz.CalculateZinsen;

public class zinsenDemo {

	public static void main(String[] args) {
		CalculateZinsen zinsen = new CalculateZinsen(20000);
		System.out.println(zinsen.calculate(12,3.5));
	}

}
