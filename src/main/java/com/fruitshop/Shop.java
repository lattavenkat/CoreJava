package com.fruitshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {

		List<FruitsDetails> fd = new ArrayList<FruitsDetails>();	
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of fruit detail that you wanna insert : ");
	int n=sc.nextInt();
	for (int i=0;i<n;i++) {
		
		System.out.println("Enter the fruit name");		
		String fruitName= sc.next();
		System.out.println("Enter the fruit Type");
		String fruitType= sc.next();
		System.out.println("Enter weight of the fruit");
		double fruitWeight=sc.nextDouble();
		System.out.println("Enter the Distributor name");
		String distributor= sc.next();
		System.out.println("Enter the fruit category");
		String fruitcategory= sc.next();
		System.out.println("Enter the location");
		String location= sc.next();
		System.out.println("Enter the expiryDate");
		String expiryDate= sc.next();
		System.out.println("Enter the quantity");
		int quantity= sc.nextInt();
		System.out.println("Enter the cost");
		double cost= sc.nextDouble();
		
		fd.add(new FruitsDetails(fruitName, fruitType, distributor, fruitWeight, fruitcategory, location, expiryDate, quantity, cost,quantity*cost));
		
	}
	
	FruitsOperation fo=new FruitsOperation();
	fo.getDetails((ArrayList<FruitsDetails>)fd);
	fo.findByDis((ArrayList<FruitsDetails>)fd,"latha");
	fo.findByName((ArrayList<FruitsDetails>)fd,"apple");
	fo.findByloc((ArrayList<FruitsDetails>)fd,"market");
	sc.close();
	}
}
