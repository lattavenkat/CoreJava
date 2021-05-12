package com.example.javausecase.corejava.lab1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;
public class StringAnagram {
	static Logger log = Logger.getLogger(StringAnagram.class.getName());
	public static void main(String[] args) {
		 
	    Scanner sc = new Scanner(System.in);
	    log.info("STRING ANAGRAM");
		log.info("---------------");	   
	    log.info("Enter first String: ");
	    String str1 = sc.nextLine();
	    log.info("Enter second String: ");
	    String str2 = sc.nextLine();
	   	if(str1.length() == str2.length())
	   	{
			      char[] charArray1 = str1.toCharArray();
			      char[] charArray2 = str2.toCharArray();
			      Arrays.sort(charArray1);
			      Arrays.sort(charArray2);
			      boolean result = Arrays.equals(charArray1, charArray2);
		
		  if(result){
	        log.info(str1 + " and " + str2 + " are anagram.");
	                }	    
	   	  else {
		      log.info(str1 + " and " + str2 + " are not anagram.");
		       }
	   	} 
		   sc.close();     
	  }
}
