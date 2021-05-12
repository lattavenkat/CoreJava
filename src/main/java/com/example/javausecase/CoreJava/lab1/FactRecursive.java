package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class FactRecursive {
	static Logger log = Logger.getLogger(FactRecursive.class.getName());
	public static long factorial(int num) {
	      if(num >= 1) {
	    	  return num * factorial(num - 1);
	    	  
	      }
	      else {
	    	  return 1;
	      }	     
	   }
	   public static void main(String args[]) {
		  log.info("FACTORIAL OF NUMBER USING RECURSIVE WAY");
		  log.info("---------------------------------------");
	      Scanner sc = new Scanner(System.in);
	      log.info("Enter the number");
	      int num = sc.nextInt();
	      log.info("Factorial of" +num+ " is "+ factorial(num));
		  sc.close();
		}
	   }
