package com.example.javausecase.corejava.generatereport;

import java.util.logging.Logger;

public class Catogories {
	static Logger log = Logger.getLogger(BeveragesProducts.class.getName());
	
	public void beverages() {
		log.info("\t\t\t\t\t Welcome to Emart");
		log.info("\t\t\t\tWe Sell Approved and Legal Beverages Only");
		log.info("\t\t\t\t\t    1.SoftDrinks\n\t\t\t\t\t    2.Alchohol");
	}	
	public void foodgrains() {
		log.info("\t\t\t\t\t Welcome to Emart");
		log.info("\t\t\t\tWe Sell All Kinds of Foodgrains ");
		log.info("\t\t\t\t\t    1.Flour\n\t\t\t\t\t    2.Rice");
	}
	public void vegetables() {
		log.info("\t\t\t\t\t Welcome to Emart");
		log.info("\t\t\t\t\tWe Sell Fresh Vegetables ");
		log.info("\t\t\t\t\t    1.Exotic\n\t\t\t\t\t    2.Organic");
}
}
