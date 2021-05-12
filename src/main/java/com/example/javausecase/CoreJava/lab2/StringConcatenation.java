package com.example.javausecase.corejava.lab2;
import java.util.Scanner;

import java.util.logging.Logger;
public class StringConcatenation {
	static Logger log = Logger.getLogger(StringConcatenation.class.getName());
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        log.info("Enter Month Of Year ");
	        String month = sc.nextLine();
	        log.info("Enter  A Year : ");
	        String year = sc.nextLine();
	        log.info("Enter  Date of Month: ");
	        int day = sc.nextInt();
	        String dob = "Date Of Brith : " + day + " " + month + " "+year;
	        log.info(dob);
	        sc.close();
	    }
}
