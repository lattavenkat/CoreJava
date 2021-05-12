package com.example.javausecase.corejava.fruitshop;

import java.util.logging.Logger;

public class FruitsDetails {
    String fruitName;
	String fruitType;
	String distributor;
	
	String fruitCategory;
	String location;
	String expiryDate;
	String[] list;
	double fruitWeight;
	int quantity;
	double cost;
	double totalcost;

	public static final int NUMB = 100;
	public static final Logger log = Logger.getLogger(FruitsDetails.class.getName());
	

public FruitsDetails (String fruitName, String fruitType, String distributor, double fruitWeight, String fruitCategory,
		String location, String expiryDate, int quantity, double cost, double totalcost) {
	super();
				
	this.fruitName = fruitName;
	this.fruitType = fruitType;
	this.distributor = distributor;
	this.fruitWeight = fruitWeight;
	this.fruitCategory = fruitCategory;
	this.location = location;
	this.expiryDate = expiryDate;
	this.quantity = quantity;
	this.cost = cost;
	this.totalcost = totalcost;
}

public double costDetails(String fruitName)
{
switch(fruitName)
{
case "apple" : 
			this.cost=NUMB;
			totalcost= quantity*cost;
			break;
case "kiwi"  :  
			cost=(double)NUMB+NUMB;
			totalcost= quantity*cost;
			break;
case "orange":  
			cost=(double) NUMB+NUMB+NUMB;
			totalcost= quantity*cost;
			break;
case "muskmelon": 
			cost=(double) NUMB+NUMB+NUMB+NUMB;
			totalcost= quantity*cost;
			break;
case "grapes": 
			cost=(double) NUMB+NUMB+NUMB+NUMB+NUMB;
			totalcost= quantity*cost;
			break;
default:
		log.info("Specified fruit not available");
}
		return totalcost;
}

@Override
public String toString() {
	return "Fruitdetails [fruitName=" + fruitName + ", fruitType=" + fruitType + ", Distributor=" + distributor
			+ ", fruitWeight=" + fruitWeight + ", fruitCategory=" + fruitCategory + ", location=" + location
			+ ", expiryDate=" + expiryDate + ", quantity=" + quantity + ", Cost=" + cost + ", TotalCost=" + totalcost+ "]";
}
}
