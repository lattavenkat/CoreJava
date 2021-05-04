package com.example.javausecase.corejava.generatereport;

public class VegetablesProducts {
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
		System.out.println("Product Details");
			System.out.println("-----------------");
		    System.out.println("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Price = Rs." + this.rate    + "\nProduct Brand = " + this.brand +
			        		"\nGST Amount = " + this.gst + "%" +"\nQuantity= " +  this.qty+ "\nTotalPrice =  Rs."  +  this.qty*this.rate  );
		    this.totalAmt= this.rate*this.qty;			 }

	public void showpotatodetails() {
		System.out.println("Product Details");
			System.out.println("------------------");
			System.out.println("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Price = Rs." + this.rate    + "\nProduct Brand = " + this.brand +
			"\nGST Amount = " + this.gst + "%" +"\nQuantity= " +  this.qty+ "\nTotalPrice =  Rs."  +  this.qty*this.rate  );
		    this.totalAmt= this.rate*this.qty;
			 }
	public void tomatoprice() {
		
		 System.out.println("Product Details");
			System.out.println("[Total Price * Gst Charged/100 ]");
		 System.out.println("-----------------");
		 System.out.println("Product Price =  Rs." + this.totalAmt*this.gst/100 + "\nGst Charged = " + this.gst + "%");
		}
	
	public void potatoPrice() {
		System.out.println("Product Details");
		System.out.println("[Total Price * Gst Charged/100 ]");
	 System.out.println("------------------");
	 System.out.println("Product Price =  Rs." + this.totalAmt*this.gst/100 + "\nGst Charged = " + this.gst + "%");
	}
}
