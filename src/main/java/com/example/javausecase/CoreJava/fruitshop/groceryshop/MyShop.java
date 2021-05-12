package com.example.javausecase.corejava.fruitshop.groceryshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class MyShop {
	static Logger l = Logger.getLogger(MyShop.class.getName());
	public static void main(String[] args) {
		
		List<GroceryDetails> fd = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		l.info("Enter the number of grocery detail that you wanna insert : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			l.info("Enter the Grocery name");
			String groceryName = sc.next();
			l.info("Enter the Grocery Type");
			String groceryType = sc.next();
			l.info("Enter the Grocery weight");
			double groceryWeight = sc.nextDouble();
			l.info("Enter the Distributor name");
			String distributor = sc.next();
			l.info("Enter the Grocery category");
			String grocerycategory = sc.next();
			l.info("Enter the location");
			String location = sc.next();
			l.info("Enter the Expiry Date");
			String expiryDate = sc.next();
			l.info("Enter the quantity of the grocery");
			int quantity = sc.nextInt();
			l.info("Enter the cost");
			double cost = sc.nextDouble();
			fd.add(new GroceryDetails(groceryName, groceryType, distributor, groceryWeight, grocerycategory, location,
					expiryDate, quantity, cost, quantity * cost));
		}
		GroceryOperation go = new GroceryOperation();
		go.getDetails((ArrayList<GroceryDetails>) fd);
		go.findByDis((ArrayList<GroceryDetails>) fd, "Latta");
		go.sortByDistAndGroceryType((ArrayList<GroceryDetails>) fd);
		go.sortByCostAndExpiry((ArrayList<GroceryDetails>) fd);
		sc.close();

	}
}
