package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class SwapWithoutVar {
	static Logger log = Logger.getLogger(SwapWithoutVar.class.getName());
	public void swap(int num1,int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		log.info("After Swapping : ");
		log.info("Number 1: " +num1+ "\nNumber 2 : "+num2);		
	}
	public static void main(String[] args) {
		log.info("SWAPPING WITH OUT THIRD VARIABLE");
		log.info("-------------------------------");
		log.info("Enter number 1: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		log.info("Enter number 2: ");
		int num2=sc.nextInt();
		if((num1>0 || num1<0) && (num2<0 || num2>0)){
			SwapWithoutVar sp=new SwapWithoutVar();
			sp.swap(num1,num2);
		}
		else {
			log.info("Invalid Input");			
		}sc.close();		
	}	
}
