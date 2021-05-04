package com.example.javausecase.corejava.generatereport;



public class Products {
	static BeveragesProducts bp;
	static VegetablesProducts vp;
	static FoodgrainsProducts fg;

	public void beveragecocoorder() {
		bp = new BeveragesProducts(8, 700, 130, 12, 0, "COCOLA");
		bp.showcocoladetails();
	}

	public void beveragepepsiorder() {
		bp = new BeveragesProducts(1236, 200, 145, 12, 0, "Beer");
		bp.showPepsidetails();
	}

	public void vegetablesOrganicProducts() {
		vp = new VegetablesProducts(4506, 450, 150, 12, 0, "Organic");
		vp.showtomatodetails();
	}

	public void vegetablesExoticProducts() {
		vp = new VegetablesProducts(1065, 550, 180, 12, 0, "Exotic");
		vp.showpotatodetails();
	}

	public void foodGrainRiceProducts() {
		fg = new FoodgrainsProducts(1302, 900, 250, 12, 0, "BASMATI");
		fg.showattadetails();
	}

	public void foodGrainFlourProducts() {
		fg = new FoodgrainsProducts(1201, 800, 350, 12, 0, "CHAAKI ATTA");
		fg.showricedetails();
	}

	public void cocorate() {
		bp.cocoprice();
	}

	public void pepsirate() {
		bp.pepsiPrice();
	}

	public void ricerate() {
		fg.ricePrice();
		
	}

	public void attarate() {
		fg.attaPrice();
		
	}

	public void tomatorate() {
		vp.tomatoprice();
	}

	public void potatorate() {
		vp.potatoPrice();
	}

}
