package com.example.javausecase.corejava.lab2;
import java.util.Scanner;

import java.util.logging.Logger;
public class CaseConversion {
    
static Logger log = Logger.getLogger(CaseConversion.class.getName());
public void casecon() {
	String str1;
    Scanner sc = new Scanner(System.in);
	log.info("Enter the string");
	str1 = sc.nextLine();			
    StringBuffer newStr=new StringBuffer(str1);               
    for(int i = 0; i < str1.length(); i++) {    
        if(Character.isLowerCase(str1.charAt(i))) {                   
            newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
        }                  
        else if(Character.isUpperCase(str1.charAt(i))) {    
               
            newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
        }    
    }    
    log.info("String after case conversion : " + newStr);    
    sc.close();
}
public static void main(String[] args) {    
	log.info("CONVERSION OF UPPERCASE TO LOWERCASE AND VICE-VERSA");
	log.info("-------------------");
	CaseConversion ob = new CaseConversion();
	ob.casecon();
}    	
}
