package com.example.javausecase.corejava.generatereport;

import java.util.logging.Logger;

public class Products {
	static BeveragesProducts b;
	static VegetablesProducts v;
	static FoodgrainsProducts fg;
	static Logger log = Logger.getLogger(Products.class.getName());
	public static final int NUMB1 = 100;
	public static final int NUMB2 = 1234;
	public static final int NUMB3 = 4;
	public static final int NUMB4 = 2;
	public static final int NUMB5 = 200;
	public void beveragecocoorder() {
		b = new BeveragesProducts(NUMB4, NUMB1, NUMB3, NUMB5, NUMB1, "COCOLA");
		b.showcocoladetails();
	}

	public void beveragepepsiorder() {
		b = new BeveragesProducts(NUMB1, NUMB3, NUMB1, NUMB5, NUMB4, "Beer");
		b.showPepsidetails();
	}

	public void vegetablesOrganicProducts() {
		v = new VegetablesProducts(NUMB2, NUMB3, NUMB5, NUMB4, NUMB1, "Organic");
		v.showtomatodetails();
	}

	public void vegetablesExoticProducts() {
		v = new VegetablesProducts(NUMB3, NUMB5, NUMB1, NUMB4, NUMB5, "Exotic");
		v.showpotatodetails();
	}

	public void foodGrainRiceProducts() {
		fg = new FoodgrainsProducts(NUMB5, NUMB5, NUMB2, NUMB4, NUMB3, "BASMATI");
		fg.showattadetails();
	}

	public void foodGrainFlourProducts() {
		fg = new FoodgrainsProducts(NUMB3, NUMB4, NUMB5, NUMB2, NUMB5, "CHAAKI ATTA");
		fg.showricedetails();
	}

	public void cocorate() {
		b.cocoprice();
	}

	public void pepsirate() {
		b.pepsiPrice();
	}

	public void ricerate() {
		fg.ricePrice();
		
	}

	public void attarate() {
		fg.attaPrice();
		
	}

	public void tomatorate() {
		v.tomatoprice();
	}

	public void potatorate() {
		v.potatoPrice();
	}

}
