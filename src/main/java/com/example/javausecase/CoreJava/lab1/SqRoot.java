package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class SqRoot {
	static Logger log = Logger.getLogger(SqRoot.class.getName());
	public static final int NUMB1 = 2;
public static void main(String args[]) {
	    int temp;
		int sqrt;
	    log.info("SQUARE ROOT OF A NUMBER");
		log.info("-----------------------");
	    log.info("Enter any number:");
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		sqrt = n / NUMB1;
	    temp = 0;
	    while(sqrt != temp){
	    	temp = sqrt;
	    	sqrt = ( n/temp + temp) / NUMB1;
	    }
	    log.info("Square root of "+ n+ " is: " +sqrt);
		sc.close();
	} 
}
