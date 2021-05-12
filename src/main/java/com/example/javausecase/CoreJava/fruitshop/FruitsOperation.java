package com.example.javausecase.corejava.fruitshop;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FruitsOperation {

	private static Logger log = Logger.getLogger(FruitsOperation.class.getName());

    void getDetails(List<FruitsDetails> list )
	{
		for(int i=0;i<list.size();i++)
		{
			log.info("Entered List values are: ");
			log.info((" " +list.get(i)));
		}
		
	}
	void findByDis(ArrayList<FruitsDetails> list,String distName)
	{
		for(FruitsDetails a:list)
		{
			if(a.distributor.equals(distName))
			{
				log.info("DISTRIBUTOR MATCHED! " +distName);
				log.fine(" " +a);
				}
			else
			{
				log.info("No records found for the Distributor Name" +distName);
			}
		}
	} 
	void findByName(ArrayList<FruitsDetails> list,String name )
	{
		for(FruitsDetails b:list)
		{
			if(b.fruitName.equals(name))
			{
				log.info("FRUIT NAME MATCH FOUND! "+name);
				log.fine(" " +b);
				}
			else
			{
				log.info("No records found for the Fruit name"+name);
			}
		}
	}	
	void findByloc(ArrayList<FruitsDetails> list,String location)
	{
		
		for(FruitsDetails c:list)
		{
			if(c.location.equals(location))
			{
				log.info("LOCATION MATCH FOUND! " +location);
				log.fine(" " +c);
				}
			else
			{
				log.info("No records found for the loation " +location);
			}
		}
	}
}
