package Programmieren2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoCart {

	public static void main(String[] args) {
		List<Cart> carts = new ArrayList<>();
		carts.add(new Cart("Viki", 12, 20, 100.30));
		carts.add(new Cart("Eli", 1, 10, 150.00));
		carts.add(new Cart("Chris", 4, 8, 250.00));
		
		Collections.sort(carts);
		 for (Cart cart : carts) {
			System.out.println(cart);
		}
		
		Collections.sort(carts,new CartUsernameComparator());
		for (Cart cart : carts) {
				System.out.println("Username: "+cart);
			}
		 
		Collections.sort(carts,new CartTotalItemsComparator());
		for (Cart cart : carts) {
				System.out.println("TotalItems: "+cart);
			}
		 
		Collections.sort(carts,new Comparator<Cart>(){

			@Override
			public int compare(Cart o1, Cart o2) {
				//Fehler könnte bei Division durch 0 auftreten --> nich keine Fehlerbehandlung bekannt --> weggelassen
				
				if(o1.getTotalAmount()/o1.getTotalItems()<o2.getTotalAmount()/o2.getTotalItems())
					return -1;
				if(o1.getTotalAmount()/o1.getTotalItems()>o2.getTotalAmount()/o2.getTotalItems())
					return 1;
				return 0;
				
				
			}
			
		});
		
		for (Cart cart : carts) {
				System.out.println("Druchschnitt: "+cart);
			}

	}

}
