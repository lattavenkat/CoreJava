package com.fruitshop.GroceryShop;

import java.util.Comparator;

public class SortByCostAndExpirydate implements Comparator<GroceryDetails> {

	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
		if(o1.GroceryType.compareTo(o2.GroceryType)==0)
		{
			return o1.expiryDate.compareTo(o2.expiryDate);
		}
		else
		{
			return o1.expiryDate.compareTo(o2.expiryDate);
		}
	}
		
	}
