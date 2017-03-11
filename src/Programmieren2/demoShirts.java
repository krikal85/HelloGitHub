package Programmieren2;

import java.util.Arrays;

public class demoShirts {

	public static void main(String[] args) {
		
		shirts myShirt = new shirts("blue", "medium");
		shirts myShirt2 = new shirts("red", "small");
		shirts[] shirtList = {myShirt,myShirt2};
		
		Arrays.sort(shirtList);
		System.out.println(Arrays.toString(shirtList));
		
		

	}

}
