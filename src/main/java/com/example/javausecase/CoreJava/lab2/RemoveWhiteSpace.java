package com.example.javausecase.corejava.lab2;
import java.util.Scanner;

import java.util.logging.Logger;
public class RemoveWhiteSpace {
	static Logger log = Logger.getLogger(RemoveWhiteSpace.class.getName());
	

		public static void main(String[] args) {
	        String sentence ;
	        Scanner sc = new Scanner(System.in);
			log.info("Enter the string");
			sentence = sc.nextLine();
	        log.info("Original sentence: " + sentence);
	        sentence = sentence.replaceAll("\\s", "");
	        log.info("After replacement: " + sentence);
			sc.close();
	    }
	

}
