package com.example.javausecase.corejava.telecomprocess;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class AirProcess {
	
	public static final int NUMB1 = 101;
	public static final int NUMB2 = 102;
	public static final int NUMB3 = 103;
	public static final int NUMB4 = 104;
	public static final int NUMB5 = 105;
	public static final int NUMB6 = 106;
	public static final int NUMB7 = 107;
	public static final int NUMB8 = 108;
	public static final int NUMB9= 109;
	public static final int NUMB10 = 101;
	public static final int NUMB11 = 111;
	public static final int NOOFREC = 10;
	public static final int AMT1 = 3456;
	public static final int AMT2 = 542;
	public static final int AMT3 = 1063;
	public static final int AMT4 = 765;
	public static final int AMT5 = 453;
	public static final int AMT6 = 190;
	public static final int AMT7 = 5111;
	public static final int AMT8 = 1028;
	public static final int AMT9= 2342;
	public static final int AMT10 = 4345;
	public static final int AMT11 = 108;
static Logger log = Logger.getLogger(AirProcess.class.getName());
    public static void main(String[] args) {
		TeleFilter f= new TeleFilter();
		Scanner sc = new Scanner(System.in);		
		String name;
		log.info("\t\t\t\t\t  Air Voice Process");
		log.info("-----------------------------------------------------------------------------------------------------------------");
		log.info("Enter Employee Name");	    
	    name= sc.next();
	    log.info("------------------------");
	    log.info("Welcome To Air Voice " +  name);	    
	    log.info("-----------------------------------------------------------------------------------------------------------------"); 
	    log.info("\t\t\t\t\t  Customer Billing History");	    
		ArrayList<TeleCustomer> custList = new ArrayList<>();			
		custList.add(new TeleCustomer(NUMB1, "a", "Uganda", "Junipe street",true, "6111111111", "10%", "no", AMT1, "Prepaid" ));
		custList.add(new TeleCustomer(NUMB2, "d", "South Africa", "Jacobs street",true, "2222222222", "20%", "no", AMT2, "Prepaid" ));
		custList.add(new TeleCustomer(NUMB3, "c", "Uganda", "Austin Corner",true, "6133333333", "30%", "yes", AMT3, "Postpaid" ));
		custList.add(new TeleCustomer(NUMB4, "b", "South Africa", "Duck Manor",true, "4444444444", "40%", "no", AMT4, "Prepaid" ));
		custList.add(new TeleCustomer(NUMB5, "e", "Tanzania”", "Castle Lanes",false, "5655555555", "50%", "no", AMT5, "Prepaid" ));
		custList.add(new TeleCustomer(NUMB6, "j", "Tanzania”", "Crawford Beeches",true, "6666666666", "60%", "yes", AMT6, "Postpaid" ));
		custList.add(new TeleCustomer(NUMB7, "k", "Nigeria", "Bryn Nebo",true, "5677777777", "70%", "yes", AMT11, "Prepaid" ));
		custList.add(new TeleCustomer(NUMB8, "h", "Rwanda", "Bryn Nebo",true, "6188888888", "80%", "yes", AMT7, "Prepaid" ));
		custList.add(new TeleCustomer(NUMB9, "i", "Tanzania”", "Morrison Corner",false, "9999999999", "120%", "no", AMT8, "Postpaid" ));
		custList.add(new TeleCustomer(NUMB10, "g", "Rwanda", "Marina Manor",true, "6112121212", "106%", "yes", AMT9, "Prepaid" ));
		custList.add(new TeleCustomer(NUMB11, "f", "Rwanda", "Dove Corner",true, "5613131313", "109%", "no", AMT11, "prepaid" ));
		log.info("Enter How Many Records you Need To print");
		int n = sc.nextInt();
		if(n >= NOOFREC){
			log.info("Printing Minimal Amount of data");
			f.getFirstTenRecords(custList, NOOFREC);
		}
		else{
			log.info("Here is the Requested Records");
			f.getFirstTenRecords(custList, n);
		}
		String custName ;
		String phoneNumber;
		Integer cid;
		log.info("------------------------------------------------------------------------------------------------------------------"); 
		log.info("\t\t\t\t\t Filter Records");
		 log.info("-----------------------------------------------------------------------------------------------------------------"); 
		log.info("Enter The Customer Name");
		custName = sc.next();	
		log.info("Enter The Customer Phone Number");
		phoneNumber = sc.next();
		log.info("-----------------------------------------------------------------------------------------------------------------"); 		
		log.info("Sort By Name And Phone Number");
		f.searchByCustNameAndPhoneNumber(custList, custName, phoneNumber);
		log.info("Entered Data has been Fetched");
		log.info("=================================================================================================================");
		log.info("customer base country is Tanzania, Postpaid connection with no VAS enabled");
		f.searchByCountryAndVas1(custList);
		log.info("===================================================================================================================");
		log.info("Customer is from “South Africa” & “Rwanda” and has Prepaid connection with atleast one VAS enabled");
		f.searchByCountryAndVas2(custList);
		log.info("=================================================================================================================");
		log.info("customer base country is Uganda, 4g Activated, phones that starts with 61");	
		f.sortByBaseNumber(custList);
		log.info("=================================================================================================================");
		log.info("Customers having common id");
		log.info("Enter The Customer id to search: ");
		cid= sc.nextInt();
		f.printByCustomerId(custList,cid);
		log.info("-----------------------------------------------------------------------------------------------------------------"); 
		log.info("Customer base country is Nigeria,  phones that starts with 61, and Name has been converted to uppercase");
		f.sortByBaseNumber2(custList);
		sc.close();
	
	}
}
