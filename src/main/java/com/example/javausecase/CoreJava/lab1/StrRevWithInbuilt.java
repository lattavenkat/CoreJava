package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class StrRevWithInbuilt {
	static Logger log = Logger.getLogger(StrRevWithInbuilt.class.getName());
	public void strrev() {
		String str;
		String rev ="";
		log.info("Enter the String");
		Scanner sc = new  Scanner(System.in);
		str= sc.nextLine();
		log.info("Original String: " +str);
		int len= str.length();
		for( int i= len-1;i>=0;i--) {
			rev= rev + str.charAt(i);	
		}
		log.info("Reversed String is: " +rev);
		sc.close();
	}
	public static void main(String args[])  
	{  
		log.info("STRING REVERSAL WITH IN-BUILT FUNCTION");
		log.info("---------------------------------------");
		StrRevWithInbuilt ob = new StrRevWithInbuilt();
		ob.strrev();
	}}
