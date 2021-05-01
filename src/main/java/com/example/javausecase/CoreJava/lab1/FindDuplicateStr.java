package com.example.javausecase.corejava.lab1;
import java.util.Scanner;

public class FindDuplicateStr {
	public void duplicatestr(String str) {
		int i,j;
		char[] chararr = str.toCharArray();
	      
	      System.out.print("Duplicate Characters in " +str+ ":");
	      for ( i = 0; i < str.length(); i++) {
	         for ( j = i + 1; j < str.length(); j++) {
	            if (chararr[i] == chararr[j]) {
	               System.out.print(" " +chararr[j] + " ");
	               break;
	            }
	         }
	      }
	}
	 public static void main(String argu[]) {
	    
	      
	      System.out.println("FINDING DUPLICATE CHARACTER IN A STRING");
	      System.out.println("---------------------------------------");
			
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the string");
	      String str = sc.nextLine();
	      FindDuplicateStr ob = new FindDuplicateStr();
	      ob.duplicatestr(str);
		  sc.close();
	   }	
}
