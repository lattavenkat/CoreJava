package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class DigitReverse {
	static Logger log = Logger.getLogger(DigitReverse.class.getName());
	public static final int NUMB1 = 10;
	public void digrev(int n) {
		 int reversed=0;
		while(n != 0) 
		{    	    
	          int digit = n % NUMB1;
	          reversed = reversed * NUMB1 + digit;
	          n = n/ NUMB1;
	    }
	     log.info("Reverse of specified number is: " +reversed);
		}
	public static void main(String args[])
	   {	     
	     log.info("REVERSING A DIGIT");
	     log.info("------------------");
	     log.info("Enter your number: ");	    
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      DigitReverse ob = new DigitReverse();
	      ob.digrev(num);
		  sc.close();
	   }
}
