package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class RemoveWhiteSpace {
	static Logger log = Logger.getLogger(RemoveWhiteSpace.class.getName());
	public static void main(String[] args) {
		log.info("REMOVE ALL WHITE SPACE FROM STRING USING REPLACE FUNCTION");
		log.info("---------------------------------------------------------");
		String line = "";
		Scanner sc =  new Scanner(System.in);
		log.info("Frame your sentence:");
		line= sc.nextLine();
		log.info("Your sentence after removing white space:");
		log.info(line.replaceAll(" ",""));
		sc.close();
	}
	
}
