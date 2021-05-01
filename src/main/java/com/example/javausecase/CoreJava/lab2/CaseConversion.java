package com.example.javausecase.corejava.lab2;

import java.util.Scanner;

public class CaseConversion {
public void casecon() {
	String str1;
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
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
    System.out.println("String after case conversion : " + newStr);    
}
public static void main(String[] args) {    
	System.out.println("CONVERSION OF UPPERCASE TO LOWERCASE AND VICE-VERSA");
	System.out.println("-------------------");
	CaseConversion ob = new CaseConversion();
	ob.casecon();
}    	
}
