package com.example.javausecase.corejava.lab1;

import java.util.Scanner;

public class StringPalindrome {
	public void palindrome(String original) {
		String rev = "";  
		for ( int i = original.length() - 1; i >= 0; i-- )  
	      {
	    	  rev = rev + original.charAt(i);  
	      }
	      if (original.equals(rev))  {
	         System.out.println(original+ " is a palindrome.");  
			}
	      else  
	      {
	         System.out.println(original+ " isn't a palindrome."); 
	      }
	}
	public static void main(String[] args) {
		System.out.println("STRING PALINDROME");
		System.out.println("---------------");
		 
	      Scanner sc = new Scanner(System.in);   
	      System.out.println("Enter a string to check if it is a palindrome");  
	      String original = sc.nextLine();   	         
	      StringPalindrome ob = new StringPalindrome();
	      ob.palindrome(original);
		  sc.close();
	   }  
	}


