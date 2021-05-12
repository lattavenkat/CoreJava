package com.example.javausecase.corejava.lab2;
import java.util.Scanner;

import java.util.logging.Logger;
public class NoofWordsinString {
	static Logger log = Logger.getLogger(NoofWordsinString.class.getName());
	static int count(String sen) {
		int i ;
		if (sen == null || sen.isEmpty())
			return 0;

		int count = 0;
		for (i= 0; i < sen.length(); i++) {
			if (sen.charAt(i)!= ' ') {
				count++;

				while(sen.charAt(i) != ' ' && i < sen.length() - 1) {
					i++;
				}
			}
		}
		return count;	 
 }    
	 public static void main(String[] args) {    

		 Scanner a = new Scanner(System.in);
	        String sentence = a.nextLine();
	       log.info("Number of words in string is: " + count(sentence));
	        a.close();
	    }
	   
}
