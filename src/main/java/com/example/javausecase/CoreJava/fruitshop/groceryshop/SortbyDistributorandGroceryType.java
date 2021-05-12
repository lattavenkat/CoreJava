package com.example.javausecase.corejava.fruitshop.groceryshop;

import java.util.Comparator;

public class SortbyDistributorandGroceryType implements Comparator<GroceryDetails> {

	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
		if(o1.distributor.compareTo(o2.distributor)==0)
		{
			return o1.groceryType.compareTo(o2.groceryType);
		}
		else
		{
			return o1.distributor.compareTo(o2.distributor);
		}
	}
}
