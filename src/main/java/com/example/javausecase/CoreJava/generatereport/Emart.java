package com.example.javausecase.corejava.generatereport;

import java.util.Scanner;

public class Emart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
	
		System.out.println("-----------------------------------------------------------------------------------------------------------------");		
		System.out.println("\t\t\t\t\t  JK TRADERS");
		System.out.println("\t\t\t\t  Best Price With Best Quality");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter Your Name");
		String username =sc.next();
		
		System.out.println("\t\t\t\t\t      WELCOME " +username);
		System.out.println("\t\t\t\t\t Here is the List of Catogory Available:");
		int catogoryChoice;
		int productChoice1 = 0;
		int productChoice2 = 0;
		int productChoice3 = 0;
		System.out.println("\t\t\t\t\t    1. Drinks \n \t\t\t\t\t    2. Vegetables \n \t\t\t\t\t    3. Foodgrains");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");

		System.out.println("\t\t\t\t\t  Enter your option");
		catogoryChoice = sc.nextInt();
		Catogories types = new Catogories();
		Products p1 = new Products();
		if (catogoryChoice == 1) {
			types.beverages();
			System.out.println("\t\t\t\t\t Choose your Product:");
			productChoice1 = sc.nextInt();
			
			if (productChoice1 == 1) {
				p1.beveragecocoorder();
			}
			if (productChoice1 == 2) {
				p1.beveragepepsiorder();
			}
		}
		if (catogoryChoice == 2) {
			types.vegetables();
			System.out.println("\t\t\t\t\tChoose your Product:");
			productChoice2 = sc.nextInt();
			
			if (productChoice2 == 1) {
				p1.vegetablesExoticProducts();
			}
			if (productChoice2 == 2) {
				p1.vegetablesOrganicProducts();
			}
		}
		if (catogoryChoice == 3) {
			types.foodgrains();
			System.out.println("\t\t\t\t\tChoose your Product:");
			productChoice3 = sc.nextInt();
			
			if (productChoice3 == 1) {
				p1.foodGrainFlourProducts();
			}
			if (productChoice3 == 2) {
				p1.foodGrainRiceProducts();
			}
		}
		else{
			System.out.println("You have entered undefined option");
		}

		if (catogoryChoice == 1 && productChoice1 == 1) {
			FinalPayment pay = new FinalPayment();
			pay.cocolapay();
		} 
		else if (catogoryChoice == 1 && productChoice1== 2) {
			FinalPayment pay = new FinalPayment();
			pay.pepsipay();
		} 
		else if (catogoryChoice == 2 && productChoice2 == 1) {
			FinalPayment pay = new FinalPayment();
			pay.tomatopay();

		} 
		else if (catogoryChoice == 2 && productChoice2 == 2) {
			FinalPayment pay = new FinalPayment();
			pay.potatopay();
		} 
		else if (catogoryChoice == 3 && productChoice3 == 1) {
			FinalPayment pay = new FinalPayment();
			pay.ricepay();

		} 
		else if (catogoryChoice == 3 && productChoice3 == 2) {
			FinalPayment pay = new FinalPayment();
			pay.attapay();
		}
sc.close();
	}

}
