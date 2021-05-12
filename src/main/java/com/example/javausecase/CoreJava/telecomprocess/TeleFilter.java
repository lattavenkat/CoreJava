package com.example.javausecase.corejava.telecomprocess;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class TeleFilter {
	
static Logger log = Logger.getLogger(TeleFilter.class.getName());
public static final int NUMB1 = 61;
public static final int NUMB2 = 56;
    List<TeleCustomer> list ;
    public void getFirstTenRecords(List<TeleCustomer> cust,int n){
		for(int i= 0; i <  n ;i++)
		{
			log.info(" " +cust.get(i));
		}	
	}
	public void searchByCustNameAndPhoneNumber(List<TeleCustomer> cust, String custName ,String phonenumber){
		cust.stream().filter(c-> c.customerName.equals(custName) && c.phoneNumber.equals(phonenumber))
		.map(c->c)
		.forEach(System.out::println);
	}
	public void searchByCountryAndVas1(List<TeleCustomer> cust){
		cust.stream().filter(c-> c.baseCountry.equals("Tanzania") && c.description.equals("Postpaid") && c.active == true)
        .collect(Collectors.toSet())
        .forEach(System.out::println);
	}
	public void searchByCountryAndVas2(List<TeleCustomer> cust){
		cust.stream().filter(c-> c.baseCountry.equals("South Africa") && c.baseCountry.equals("Rwanda") && c.description.equals("Prepaid") && c.active == true)
		.map(c->c)
		 .forEach(System.out::println);
	}
	public void printByCustomerId(List<TeleCustomer> cust , Integer cid){
		list = cust.stream().filter(c-> c.custId.equals(cid)).collect(Collectors.toList());	
		if(list.isEmpty()){
			log.info("No Record Found");
		}
		else{
			log.info("Customers with matching id found");
			log.info(" " +list);
		}	
	}
	public void sortByBaseNumber(List<TeleCustomer> cust){
		cust.stream().filter(c-> c.baseCountry.equals("Uganda") || c.phoneNumber.startsWith(c.phoneNumber, NUMB1) && c.is4g.equals("yes"))
		.map(c->c)
		.forEach(System.out::println);
	}
	public void sortByBaseNumber2(List<TeleCustomer> cust){
		cust.stream().filter(c-> c.baseCountry.equals("Nigeria") || c.phoneNumber.startsWith(c.phoneNumber, NUMB2))
		.map(c -> c.customerName.toUpperCase())
		.forEach(System.out::println);
	}
}
