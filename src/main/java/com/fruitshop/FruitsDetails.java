package com.fruitshop;

public class FruitsDetails {
    String fruitName;
	String fruitType;
	String distributor;
	double fruitWeight;
	String fruitCategory;
	String location;
	String expiryDate;
	int quantity;
	double cost;
	double totalcost;
	

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
			cost=100;
			totalcost= quantity*cost;
			break;
case "kiwi"  :  
			cost=200;
			totalcost= quantity*cost;
			break;
case "orange":  
			cost=300;
			totalcost= quantity*cost;
			break;
case "muskmelon": 
			cost=400;
			totalcost= quantity*cost;
			break;
case "grapes": 
			cost=500;
			totalcost= quantity*cost;
			break;
default:
		System.out.println("Specified fruit not available");
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
