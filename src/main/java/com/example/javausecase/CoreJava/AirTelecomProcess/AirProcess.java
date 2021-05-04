package com.example.javausecase.corejava.AirTelecomProcess;

import java.util.ArrayList;
import java.util.Scanner;


public class AirProcess {
    public static void main(String[] args) {
		Filtering f= new Filtering();
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("\t\t\t\t\t  Air Voice Process");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter Employee Name");
	    
	    name= sc.next();
	    System.out.println("------------------------");
	    System.out.println("Welcome To Air Voice " +  name);
	    
	    System.out.println("-----------------------------------------------------------------------------------------------------------------"); 
	    System.out.println("\t\t\t\t\t  Customer Billing History");
	    
		ArrayList<Customer> custList = new ArrayList<Customer>();	
		
		custList.add(new Customer(101, "a", "Uganda", "Junipe street",true, "6111111111", "10%", "no", 3577, "Prepaid" ));
		custList.add(new Customer(102, "d", "South Africa", "Jacobs street",true, "2222222222", "20%", "no", 2000, "Prepaid" ));
		custList.add(new Customer(103, "c", "Uganda", "Austin Corner",true, "6133333333", "30%", "yes", 1500, "Postpaid" ));
		custList.add(new Customer(104, "b", "South Africa", "Duck Manor",true, "4444444444", "40%", "no", 700, "Prepaid" ));
		custList.add(new Customer(105, "e", "Tanzania”", "Castle Lanes",false, "5655555555", "50%", "no", 300, "Prepaid" ));
		custList.add(new Customer(106, "j", "Tanzania”", "Crawford Beeches",true, "6666666666", "60%", "yes", 350, "Postpaid" ));
		custList.add(new Customer(107, "k", "Nigeria", "Bryn Nebo",true, "5677777777", "70%", "yes", 5000, "Prepaid" ));
		custList.add(new Customer(108, "h", "Rwanda", "Bryn Nebo",true, "6188888888", "80%", "yes", 15000, "Prepaid" ));
		custList.add(new Customer(109, "i", "Tanzania”", "Morrison Corner",false, "9999999999", "120%", "no", 190, "Postpaid" ));
		custList.add(new Customer(101, "g", "Rwanda", "Marina Manor",true, "6112121212", "106%", "yes", 2300, "Prepaid" ));
		custList.add(new Customer(111, "f", "Rwanda", "Dove Corner",true, "5613131313", "109%", "no", 560, "prepaid" ));

		
		
		
		System.out.println("Enter How Many Records you Need To print");
		int n = sc.nextInt();
		if(n >= 10)
		{
			System.out.println("Printing Minimal Amount of data");
			f.getFirstTenRecords(custList, 10);
		}
		else
        {
			System.out.println("Here is the Requested Records");
			f.getFirstTenRecords(custList, n);
		}
		String custName ;
		String phoneNumber;
		Integer cid;
		System.out.println("------------------------------------------------------------------------------------------------------------------"); 
		System.out.println("\t\t\t\t\t Filter Records");
		 System.out.println("-----------------------------------------------------------------------------------------------------------------"); 
		System.out.println("Enter The Customer Name");
		custName = sc.next();
		
		System.out.println("Enter The Customer Phone Number");
		phoneNumber = sc.next();
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------"); 		
		System.out.println("Sort By Name And Phone Number");
		f.searchByCustNameAndPhoneNumber(custList, custName, phoneNumber);
		System.out.println("Entered Data has been Fetched");
		System.out.println("=================================================================================================================");
		System.out.println("customer base country is Tanzania, Postpaid connection with no VAS enabled");
		f.searchByCountryAndVas1(custList);
		System.out.println("===================================================================================================================");

		System.out.println("Customer is from “South Africa” & “Rwanda” and has Prepaid connection with atleast one VAS enabled");
		f.searchByCountryAndVas2(custList);
		System.out.println("=================================================================================================================");

		System.out.println("customer base country is Uganda, 4g Activated, phones that starts with 61");	
		f.sortByBaseNumber(custList);
		System.out.println("=================================================================================================================");

		System.out.println("Customers having common id");
		System.out.println("Enter The Customer id to search: ");
		cid= sc.nextInt();
		f.printByCustomerId(custList,cid);
		//f.printByCustomerId(custList, custid);
		System.out.println("-----------------------------------------------------------------------------------------------------------------"); 
		System.out.println("Customer base country is Nigeria,  phones that starts with 61, and Name has been converted to uppercase");
		f.sortByBaseNumber2(custList);
		sc.close();
	
	}
}
