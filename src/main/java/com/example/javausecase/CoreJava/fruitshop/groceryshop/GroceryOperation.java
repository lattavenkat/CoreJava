package com.example.javausecase.corejava.fruitshop.groceryshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class GroceryOperation {
	static Logger log = Logger.getLogger(GroceryOperation.class.getName());
    void getDetails(ArrayList<GroceryDetails> list )
	{
		for(int i=0;i<list.size();i++)
		{
			log.info("Entered List values are: ");
			log.fine("" +list.get(i));
		}
	}
	void sortByDistAndGroceryType(ArrayList<GroceryDetails> list)
	{
		Collections.sort(list,new SortbyDistributorandGroceryType());
		for(int i=0;i<list.size();i++)
		{
			log.info("SORTED");
			log.fine("" +list.get(i));
		}
		
	}
	void sortByCostAndExpiry(ArrayList<GroceryDetails> list)
	{
		Collections.sort(list, new SortbyCostandExpiryDate());
		for(int i=0;i<list.size();i++)
		{
			log.info("SORTED");
			log.fine("" +list.get(i));
		}
	}
	void findByDis(ArrayList<GroceryDetails> list,String distName)
	{
		
		for(GroceryDetails g:list)
		{
			if(g.distributor.equals(distName))
			{
				log.info("DISTRIBUTOR NAME MATCHED! " +distName);
				log.info("=============================================================================================================");
				log.fine("" +g);
				log.info("============================================================================================================");
				
			}
			else
			{
				log.info("No records found for the Distributor Name and grocery type" );
			}
		}
	}
}
