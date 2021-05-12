package com.example.javausecase.corejava.fruitshop.groceryshop;

import java.util.Comparator;

public class SortbyNameandLocation implements Comparator<GroceryDetails> {

	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
		if(o1.groceryName.compareTo(o2.groceryName)==0)
		{
			return o1.location.compareTo(o1.location);
		}
		else
		{
			return o2.groceryName.compareTo(o2.groceryName);
		}
	}
}
