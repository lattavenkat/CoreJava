package com.fruitshop.GroceryShop;
import java.util.ArrayList;
import java.util.Collections;

public class Groceryoperations {
	
    void getDetails(ArrayList list )
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Entered List values are: ");
			System.out.println(list.get(i));
		}
	}
	void sortByDistAndGroceryType(ArrayList<GroceryDetails> list)
	{
		Collections.sort(list,new SortByDistibutorAndGrocryType());
		for(int i=0;i<list.size();i++)
		{
			System.out.println("SORTED");
			System.out.println(list.get(i));
		}
		
	}
	void sortByCostAndExpiry(ArrayList<GroceryDetails> list)
	{
		Collections.sort(list, new SortByCostAndExpirydate());
		for(int i=0;i<list.size();i++)
		{
			System.out.println("SORTED");
			System.out.println(list.get(i));
		}
	}
	void findByDis(ArrayList<GroceryDetails> list,String distName)
	{
		
		for(GroceryDetails g:list)
		{
			if(g.Distributor.equals(distName))
			{
				System.out.println("DISTRIBUTOR NAME MATCHED! " +distName);
				System.out.println("=============================================================================================================");
				System.out.println(g);
				System.out.println("============================================================================================================");
				
			}
			else
			{
				System.out.println("No records found for the Distributor Name and grocery type" );
			}
		}
	}
    
}
