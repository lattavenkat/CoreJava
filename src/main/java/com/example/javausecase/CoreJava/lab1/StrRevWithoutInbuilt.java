package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class StrRevWithoutInbuilt {
	static Logger log = Logger.getLogger(StrRevWithoutInbuilt.class.getName());
	public void strrev() {
		log.info("STRING REVERSAL WITHOUT IN-BUILT FUNCTION");
		log.info("---------------------------------------");
Scanner sc=new Scanner(System.in);         
log.info("Enter a String: ");  
String str=sc.nextLine();  
log.info("Reversed string is: ");  
int i=str.length();                   
while(i>0)  
{  
log.info(" " +str.charAt(i-1));                 
i--;                                
}  
sc.close();
	}
	public static void main(String args[])  
{  
		StrRevWithoutInbuilt ob = new StrRevWithoutInbuilt();
		ob.strrev();
		
}
}
