package com.fruitshop.GroceryShop;

import java.util.Comparator;

public class SortByNameAndLocation implements Comparator<GroceryDetails> {

	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
		if(o1.GroceryName.compareTo(o2.GroceryName)==0)
		{
			return o1.location.compareTo(o2.location);
		}
		else
		{
			return o1.GroceryName.compareTo(o2.GroceryName);
		}
	}

		
	}

