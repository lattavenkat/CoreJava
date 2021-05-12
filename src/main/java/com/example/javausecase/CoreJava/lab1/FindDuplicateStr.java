package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class FindDuplicateStr {
	static Logger log = Logger.getLogger(FindDuplicateStr.class.getName());
	public void duplicatestr(String str) {
		int i,j;
		char[] chararr = str.toCharArray();
	      
	      log.info("Duplicate Characters in " +str+ ":");
	      for ( i = 0; i < str.length(); i++) {
	         for ( j = i + 1; j < str.length(); j++) {
	            if (chararr[i] == chararr[j]) {
	               log.info(" " +chararr[j] + " ");
	               break;
	            }
	         }
	      }
	}
	 public static void main(String argu[]) {
	    
	      
	      log.info("FINDING DUPLICATE CHARACTER IN A STRING");
	      log.info("---------------------------------------");
			
	      Scanner sc = new Scanner(System.in);
	      log.info("Enter the string");
	      String str = sc.nextLine();
	      FindDuplicateStr ob = new FindDuplicateStr();
	      ob.duplicatestr(str);
		  sc.close();
	   }	
}
