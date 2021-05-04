package com.example.javausecase.corejava.AirTelecomProcess;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {
    public void getFirstTenRecords(ArrayList<Customer> cust,int n)
	{
		for(int i= 0; i <  n ;i++)
		{
			System.out.println(cust.get(i));
		}
		
	}
	public void searchByCustNameAndPhoneNumber(ArrayList<Customer> cust, String custName ,String phonenumber)
	{
		cust.stream().filter(c-> c.customerName.equals(custName) && c.phoneNumber.equals(phonenumber))
		.map(c->c)
		.forEach(System.out::println);
	}
	public void searchByCountryAndVas1(ArrayList<Customer> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("Tanzania") && c.description.equals("Postpaid") && c.active == true)
        .collect(Collectors.toSet())
        .forEach(System.out::println);
	}
	public void searchByCountryAndVas2(ArrayList<Customer> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("South Africa") && c.baseCountry.equals("Rwanda") && c.description.equals("Prepaid") && c.active == true)
		.map(c->c)
		.forEach(System.out::println);
	}
	
	//public void printByCustomerId(ArrayList<Customer> cust, String custName ,String cid)
	 
		
		public void printByCustomerId(ArrayList<Customer> cust , Integer cid)
	{
		List list = cust.stream().filter(c-> c.custId.equals(cid)).collect(Collectors.toList());
		
		if(list.isEmpty())
		{
			System.out.println("No Record Found");
		}
		else
		{
			System.out.println("Customers with matching id found");
			System.out.println(list);
		}
		
	}
	public void sortByBaseNumber(ArrayList<Customer> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("Uganda") || c.phoneNumber.startsWith(c.phoneNumber, 61) && c.is4g.equals("yes"))
		.map(c->c)
		.forEach(System.out::println);
	}
	public void sortByBaseNumber2(ArrayList<Customer> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("Nigeria") || c.phoneNumber.startsWith(c.phoneNumber, 56))
		.map(c -> c.customerName.toUpperCase())
		.forEach(System.out::println);
	}

}
