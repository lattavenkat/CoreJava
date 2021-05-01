package com.generatereport;

public class FoodgrainsProducts {
	int pid , Qty, rate ,Gst, TotalAmt;
	String brand;
	
	public FoodgrainsProducts(int pid, int qty, int rate, int gst, int totalAmt, String brand) {
		super();
		this.pid = pid;
		this.Qty = qty;
		this.rate = rate;
		this.Gst = gst;
		this.TotalAmt = totalAmt;
		this.brand = brand;
	}
	public void showattadetails() {
		System.out.println("Product Details");
			System.out.println("-----------------");
		    System.out.println("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Price = " + this.rate + "\nProduct Brand = " + this.brand +
		    		"\nProduct_GST = " + this.Gst + "%" +"\nQty = " +  this.Qty+ "\nTotalPrice = "  +  this.Qty*this.rate + " Rs"  );
		    this.TotalAmt= this.rate*this.Qty;
	}

	public void showricedetails() {
		System.out.println("Product Details");
			System.out.println("-----------------");
		    System.out.println("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Price = " + this.rate + "\nProduct Brand = " + this.brand +
		    		"\nProduct_GST = " + this.Gst + "%" +"\nQty = " +  this.Qty+ "\nTotalPrice = "  +  this.Qty*this.rate + " Rs"  );
		    this.TotalAmt= this.rate*this.Qty;

	}
	public void riceprice() {
		 System.out.println("Product Details");
			System.out.println("[Total Price * Gst Charged/100 ]");
		 System.out.println("-----------------");
		 System.out.println("Product Price: = " + this.TotalAmt*this.Gst/100
		 		+ " Rs"  + "\nGst Charged = " + this.Gst + "%");
			 }
	public void attaprice() {
		System.out.println("Product Details");
		System.out.println("[Total Price * Gst Charged/100 ]");
	 System.out.println("-----------------");
	 System.out.println("Product Price: = " + this.TotalAmt*this.Gst/100
	 		+ " Rs"  + "\nGst Charged = " + this.Gst + "%");
				
	}
	
}
