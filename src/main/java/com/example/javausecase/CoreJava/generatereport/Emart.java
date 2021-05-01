package com.example.javausecase.corejava.generatereport;

import java.util.Scanner;


public class Emart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username = "";
		int password;

		System.out.println("\t\t\t\t\t Product Super Market");
		System.out.println("\t\t\t\t\t  Chennai TamilNadu");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("Username");
		username = sc.next();
		System.out.println("Password");
		password=sc.nextInt();
		System.out.println("\t\t\t\t\tChoose your Catogory:");
		int i, J = 0, k = 0, h = 0;
		System.out.println("\t\t\t\t\t    1.Drinks \n \t\t\t\t\t    2.Vegetables \n \t\t\t\t\t    3.Foodgrains");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");

		System.out.println("\t\t\t\t\t  Enter your option");
		i = sc.nextInt();
		System.out.println("==================================================================================================================");
		Catogories types = new Catogories();
		if (i == 1) {
			types.Beverages();
			System.out.println("\t\t\t\t\tChoose your Product:");
			J = sc.nextInt();
			Products Aproduct = new Products();
			if (J == 1) {
				Aproduct.Beveragecocoorder();
			}
			if (J == 2) {
				Aproduct.Beveragepepsiorder();
			}
		}
		if (i == 2) {
			types.Vegetables();
			System.out.println("\t\t\t\t\tChoose your Product:");
			k = sc.nextInt();
			Products Aproduct = new Products();
			if (k == 1) {
				Aproduct.VegetablesExoticProducts();
			}
			if (k == 2) {
				Aproduct.VegetablesOrganicProducts();
			}
		}
		if (i == 3) {
			types.Foodgrains();
			System.out.println("\t\t\t\t\tChoose your Product:");
			h = sc.nextInt();
			Products Aproduct = new Products();
			if (h == 1) {
				Aproduct.FoodGrainFlourProducts();
			}
			if (h == 2) {
				Aproduct.FoodGrainsRiceProducts();
			}
		}
		System.out.println("\n------------------------------------------\n");
		System.out.println("Willing to Place the order (Yes/No):");

		String a = sc.next();
		if (i == 1 && J == 1) {
			FinalPayment pay = new FinalPayment();
			pay.cocolapay();
		} else if (i == 1 && J == 2) {
			FinalPayment pay = new FinalPayment();
			pay.pepsipay();
		} else if (i == 2 && k == 1) {
			FinalPayment pay = new FinalPayment();
			pay.tomatopay();

		} else if (i == 2 && k == 2) {
			FinalPayment pay = new FinalPayment();
			pay.potatopay();
		} else if (i == 3 && h == 1) {
			FinalPayment pay = new FinalPayment();
			pay.ricepay();

		} else if (i == 3 && h == 2) {
			FinalPayment pay = new FinalPayment();
			pay.attapay();
		}
sc.close();
	}

}
