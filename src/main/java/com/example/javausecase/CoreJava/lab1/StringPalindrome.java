package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class StringPalindrome {
	static Logger log = Logger.getLogger(StringPalindrome.class.getName());
	public void palindrome(String original) {
		String rev = " ";  
		for ( int i = original.length() - 1; i >= 0; i-- )  
	      {
	    	  rev = rev + original.charAt(i);  
	      }
		  
	      if (original.equals(rev))  {
	         log.info( " is a palindrome." +original);  
			}
	      else  
	      {
	         log.info(original+ " isn't a palindrome."); 
	      }
	}
	public static void main(String[] args) {
		log.info("STRING PALINDROME");
		log.info("---------------");
		 
	      Scanner sc = new Scanner(System.in);   
	      log.info("Enter a string to check if it is a palindrome");  
	      String original = sc.nextLine();   	         
	      StringPalindrome ob = new StringPalindrome();
	      ob.palindrome(original);
		  sc.close();
	   }  
	}


