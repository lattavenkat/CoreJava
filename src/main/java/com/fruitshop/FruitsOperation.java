package com.fruitshop;

import java.util.ArrayList;

public class FruitsOperation {
    void getDetails(ArrayList list )
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Entered List values are: ");
			System.out.println(list.get(i));
		}
		
	}
	void findByDis(ArrayList<FruitsDetails> list,String distName)
	{
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		for(FruitsDetails a:list)
		{
			if(a.distributor.equals(distName))
			{
				System.out.println("DISTRIBUTOR MATCHED! " +distName);
				System.out.println("============================================================================================================");
				System.out.println(a);
				System.out.println("============================================================================================================");
			}
			else
			{
				System.out.println("No records found for the Distributor Name" +distName);
			}
		}
	}
	void findByName(ArrayList<FruitsDetails> list,String name )
	{
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		for(FruitsDetails b:list)
		{
			if(b.fruitName.equals(name))
			{
				System.out.println("FRUIT NAME MATCH FOUND! "+name);
				System.out.println("============================================================================================================");
				System.out.println(b);
				System.out.println("============================================================================================================");
			}
			else
			{
				System.out.println("No records found for the Fruit name"+name);
			}
		}
	}
	void findByloc(ArrayList<FruitsDetails> list,String location)
	{
		System.out.println("--------------------------------------------------------------------------------------------------------------------");

		for(FruitsDetails c:list)
		{
			if(c.location.equals(location))
			{
				System.out.println("LOCATION MATCH FOUND! " +location);
				System.out.println("============================================================================================================");
				System.out.println(c);
				System.out.println("============================================================================================================");
			}
			else
			{
				System.out.println("No records found for the loation " +location);
			}
		}
	}
}
