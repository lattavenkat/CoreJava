package com.example.javausecase.corejava.lab2;
import java.util.Scanner;

import java.util.logging.Logger;
public class ConvertSignedInttoStr {
	
static Logger log = Logger.getLogger(ConvertSignedInttoStr.class.getName());
	 public static void main(String[] args) {
		 int num ;
		 Scanner sc = new Scanner(System.in);
		 log.info("Enter the Days");
			num = sc.nextInt();
	        String msg = String.format("There are %s Days Left", num);	        
	        log.info(msg);             
			sc.close();
		}
}
