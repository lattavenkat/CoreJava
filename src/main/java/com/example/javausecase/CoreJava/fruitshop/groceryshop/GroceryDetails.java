package com.example.javausecase.corejava.fruitshop.groceryshop;

import java.util.logging.Logger;

public class GroceryDetails {
    protected String groceryName;
	protected String groceryType;
	protected String distributor;
	protected double groceryWeight;
	protected String groceryCategory;
	protected String location;
	protected String expiryDate;
	protected int quantity;
	protected double cost;
	protected double totalcost;
	static  Logger log = Logger.getLogger(GroceryDetails.class.getName());
				
	public static final int NUMB = 100;

	public GroceryDetails(String groceryName, String groceryType, String distributor, double groceryWeight,
			String groceryCategory, String location, String expiryDate, int quantity, double cost, double totalcost) {
				super();
				
		this.groceryName = groceryName;
		this.groceryType = groceryType;
		this.distributor = distributor;
		this.groceryWeight = groceryWeight;
		this.groceryCategory = groceryCategory;
		this.location = location;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
		this.cost = cost;
		this.totalcost = totalcost;
	}

	public double costDetails(String groceryName) {
		switch (groceryName) {
			case "rice":
			this.cost=NUMB;
				totalcost = quantity * cost;
				break;
			case "dhal":
				cost=(double)NUMB+NUMB;
				totalcost = quantity * cost;
				break;
			case "oil":
			cost=(double)NUMB+NUMB+NUMB;
				totalcost = quantity * cost;
				break;
			case "snacks":
			cost=(double)NUMB+NUMB+NUMB+NUMB;
				totalcost = quantity * cost;
				break;
			case "beverage":
			cost=(double)NUMB+NUMB+NUMB+NUMB+NUMB;
				totalcost = quantity * cost;
				break;
			default:
				log.info("Grocery not available");
		}
		return totalcost;
	}
	@Override
	public String toString() {
		return "Grocerydetails [GroceryName=" + groceryName + ", GroceryType=" + groceryType + ", Distributor="
				+ distributor + ", GroceryWeight=" + groceryWeight + ", GroceryCategory=" + groceryCategory
				+ ", location=" + location + ", expiryDate=" + expiryDate + ", quantity=" + quantity + ", cost=" + cost
				+ ", totalcost=" + totalcost + "]";
	}
}
