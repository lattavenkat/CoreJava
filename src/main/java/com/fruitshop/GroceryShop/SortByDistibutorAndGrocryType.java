package com.fruitshop.GroceryShop;

import java.util.Comparator;

public class SortByDistibutorAndGrocryType  implements Comparator<GroceryDetails> {

	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
		if(o1.Distributor.compareTo(o2.Distributor)==0)
		{
			return o1.GroceryType.compareTo(o2.GroceryType);
		}
		else
		{
			return o1.Distributor.compareTo(o2.Distributor);
		}
	}
 {

 }
}
