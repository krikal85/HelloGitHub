package Programmieren2;

import java.util.Comparator;

public class CartTotalItemsComparator implements Comparator<Cart> {

	@Override
	public int compare(Cart o1, Cart o2) {
		if(o1.getTotalItems()<o2.getTotalItems())
			return 1;
		if(o1.getTotalItems()>o2.getTotalItems())
			return - 1;
		return 0;
	}
	
	
}
