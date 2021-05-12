package com.example.javausecase.corejava.generatereport;

import java.util.logging.Logger;

public class VegetablesProducts {
	static Logger log = Logger.getLogger(BeveragesProducts.class.getName());
	public static final int NUMB1 = 100;
	int pid ;
	int qty;
	int rate ;
	int gst;
	int totalAmt;
	String brand;
	public VegetablesProducts(int pid, int qty, int rate, int gst, int totalAmt, String brand) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.rate = rate;
		this.gst = gst;
		this.totalAmt = totalAmt;
		this.brand = brand;

		
	}
	
	public void showtomatodetails() {
		
		log.info("Product Details");
			log.info("-----------------");
		    log.info("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Price = Rs." + this.rate    + "\nProduct Brand = " + this.brand +
			        		"\nGST Amount = " + this.gst + "%" +"\nQuantity= " +  this.qty+ "\nTotalPrice =  Rs."  +  this.qty*this.rate  );
		    this.totalAmt= this.rate*this.qty;			 }

	public void showpotatodetails() {
		log.info("Product Details");
			log.info("------------------");
			log.info("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Price = Rs." + this.rate    + "\nProduct Brand = " + this.brand +
			"\nGST Amount = " + this.gst + "%" +"\nQuantity= " +  this.qty+ "\nTotalPrice =  Rs."  +  this.qty*this.rate  );
		    this.totalAmt= this.rate*this.qty;
			 }
	public void tomatoprice() {
		
		 log.info("Product Details");
		
		 log.info("-----------------");
		 log.info("Product Price =  Rs." + this.totalAmt*this.gst/NUMB1 + "\nGst Charged = " + this.gst + "%");
		}
	
	public void potatoPrice() {
		log.info("Product Details");
		
	 log.info("------------------");
	 log.info("Product Price =  Rs." + this.totalAmt*this.gst/NUMB1 + "\nGst Charged = " + this.gst + "%");
	}
}
