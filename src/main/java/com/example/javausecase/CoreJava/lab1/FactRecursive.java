package com.example.javausecase.corejava.lab1;

import java.util.Scanner;

public class FactRecursive {
	public static long factorial(int num) {
	      if(num >= 1) {
	    	  return num * factorial(num - 1);
	    	  
	      }
	      else {
	    	  return 1;
	      }	     
	   }
	   public static void main(String args[]) {
		  System.out.println("FACTORIAL OF NUMBER USING RECURSIVE WAY");
		  System.out.println("---------------------------------------");
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number");
	      int num = sc.nextInt();
	      System.out.println("Factorial of" +num+ "is "+ factorial(num));
}
	   }
