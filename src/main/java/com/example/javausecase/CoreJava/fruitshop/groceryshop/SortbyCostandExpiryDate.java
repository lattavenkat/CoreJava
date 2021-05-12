package com.example.javausecase.corejava.fruitshop.groceryshop;

import java.util.Comparator;

public class SortbyCostandExpiryDate implements Comparator<GroceryDetails> {

	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
		if(o1.groceryType.compareTo(o2.groceryType)==0)
		{
			return o1.expiryDate.compareTo(o1.expiryDate);
		}
		else
		{
			return o2.expiryDate.compareTo(o2.expiryDate);
		}
	}
}
