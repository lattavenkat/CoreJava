package com.example.javausecase.corejava.generatereport;

import java.util.Scanner;
import java.util.logging.Logger;

public class Emart {
	public static final int NUMB1 = 2;
	public static final int NUMB2 = 3;
	static Logger log = Logger.getLogger(Emart.class.getName());
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int catogoryChoice;
		int productChoice1 = 0;
		int productChoice2 = 0;
		int productChoice3 = 0;
		log.info("-----------------------------------------------------------------------------------------------------------------");		
		log.info("\t\t\t\t\t  JK TRADERS");
		log.info("\t\t\t\t  Best Price With Best Quality");
		log.info("-----------------------------------------------------------------------------------------------------------------");
		log.info("Enter Your Name");
		String username =sc.next();			
		log.info("\t\t\t\t\t      WELCOME " +username);
		log.info("\t\t\t\t\t Here is the List of Catogory Available:");	
		log.info("\t\t\t\t\t    1. Drinks \n \t\t\t\t\t    2. Vegetables \n \t\t\t\t\t    3. Foodgrains");
		log.info("-----------------------------------------------------------------------------------------------------------------");
		log.info("\t\t\t\t\t  Enter your option");
		catogoryChoice = sc.nextInt();
		Catogories types = new Catogories();
		Products p1 = new Products();
		if (catogoryChoice == 1) {
			types.beverages();
			log.info("\t\t\t\t\t Choose your Product:");
			productChoice1 = sc.nextInt();
			if (productChoice1 == 1) {
				p1.beveragecocoorder();
			}
			if (productChoice1 == NUMB1) {
				p1.beveragepepsiorder();
			}}
		if (catogoryChoice == NUMB1) {
			types.vegetables();
			log.info("\t\t\t\t\tChoose your Product:");
			productChoice2 = sc.nextInt();	
			if (productChoice2 == 1) {
				p1.vegetablesExoticProducts();
			}
			if (productChoice2 == NUMB1) {
				p1.vegetablesOrganicProducts();
			}}
		if (catogoryChoice == NUMB2) {
			types.foodgrains();
			log.info("\t\t\t\t\tChoose your Product:");
			productChoice3 = sc.nextInt();
			
			if (productChoice3 == 1) {
				p1.foodGrainFlourProducts();
			}
			if (productChoice3 == NUMB1) {
				p1.foodGrainRiceProducts();
			}
		}
		else{
			log.info("You have entered undeinfod option");
		}

		if (catogoryChoice == 1 && productChoice1 == 1) {
			FinalPayment pay = new FinalPayment();
			pay.cocolapay();
		} 
		else if (catogoryChoice == 1 && productChoice1== NUMB1) {
			FinalPayment pay = new FinalPayment();
			pay.pepsipay();
		} 
		else if (catogoryChoice == NUMB1 && productChoice2 == 1) {
			FinalPayment pay = new FinalPayment();
			pay.tomatopay();

		} 
		else if (catogoryChoice == NUMB1 && productChoice2 == NUMB1) {
			FinalPayment pay = new FinalPayment();
			pay.potatopay();
		} 
		else if (catogoryChoice == NUMB2 && productChoice3 == 1) {
			FinalPayment pay = new FinalPayment();
			pay.ricepay();

		} 
		else if (catogoryChoice == NUMB2 && productChoice3 == NUMB1) {
			FinalPayment pay = new FinalPayment();
			pay.attapay();
		}
sc.close();
	}

}
