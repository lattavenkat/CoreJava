package com.example.javausecase.corejava.generatereport;

import java.util.logging.Logger;

public class BeveragesProducts {
	int pid ;
	int qty;
	int rate ;
	int gst;
	int totalAmt;
	String brand;
	static Logger log = Logger.getLogger(BeveragesProducts.class.getName());
	public static final int NUMB1 = 100;
	
	public BeveragesProducts(int pid, int qty, int rate, int gst, int totalAmt, String brand) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.rate = rate;
		this.gst = gst;
		this.totalAmt = totalAmt;
		this.brand = brand;
	}
	public void showcocoladetails() {
			log.info("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Price = Rs." + this.rate    + "\nProduct Brand = " + this.brand +
			        		"\nGST Amount = " + this.gst + "%" +"\nQuantity= " +  this.qty+ "\nTotalPrice =  Rs."  +  this.qty*this.rate  );
		    this.totalAmt= this.rate*this.qty;
	}
	public void showPepsidetails() {
		log.info("-------------------------------------------");
		log.info("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Price = Rs." + this.rate   + "\nProduct Brand = " + this.brand +
		"\nGST Amount = " + this.gst + "%" +"\nQuantity= " +  this.qty+ "\nTotalPrice =  Rs."  +  this.qty*this.rate  );
		    this.totalAmt= this.rate*this.qty;
	}			    
	public void cocoprice() {
		log.info("YOUR BILL");
		log.info("[Total Price * Gst Charged/100 ]");
		log.info("---------------------------------");
		log.info("Product Price =  Rs." + this.totalAmt*this.gst/NUMB1 + "\nGst Charged = " + this.gst + "%");
	}
	public void pepsiPrice() {	
		log.info("YOUR BILL");
		log.info("[Total Price * Gst Charged/100 ]");
		log.info("--------------------------------");
		log.info("Product Price =  Rs." + this.totalAmt*this.gst/NUMB1 + "\nGst Charged = " + this.gst + "%");
	}
}
