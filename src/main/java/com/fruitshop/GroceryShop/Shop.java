package com.fruitshop.GroceryShop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
 	public static void main(String[] args) {

		List<GroceryDetails> fd = new ArrayList<GroceryDetails>();	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of grocery detail that you wanna insert : ");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			
			System.out.println("Enter the Grocery name");
			String groceryName= sc.next();
			System.out.println("Enter the Grocery Type");
			String groceryType= sc.next();
			System.out.println("Enter the Grocery weight");
			double groceryWeight= sc.nextDouble();
			System.out.println("Enter the Distributor name");
			String distributor= sc.next();
			System.out.println("Enter the Grocery category");
			String grocerycategory= sc.next();
			System.out.println("Enter the location");
			String location= sc.next();
			System.out.println("Enter the Expiry Date");
			String expiryDate= sc.next();
			System.out.println("Enter the quantity of the grocery");
			int quantity= sc.nextInt();
			System.out.println("Enter the cost");
			double cost= sc.nextDouble();
			fd.add(new GroceryDetails(groceryName, groceryType, distributor, groceryWeight, grocerycategory, location, expiryDate, quantity, cost,quantity*cost));
		}
		Groceryoperations go=new Groceryoperations();
		go.getDetails((ArrayList<GroceryDetails>)fd);
		go.findByDis((ArrayList<GroceryDetails>)fd,"Latta");
		go.sortByDistAndGroceryType((ArrayList<GroceryDetails>)fd);
		go.sortByCostAndExpiry((ArrayList<GroceryDetails>)fd);
		sc.close();
		
	}
}


