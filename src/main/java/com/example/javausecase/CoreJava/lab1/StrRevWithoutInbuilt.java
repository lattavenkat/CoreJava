package com.example.javausecase.corejava.lab1;

import java.util.Scanner;

public class StrRevWithoutInbuilt {
	public void strrev() {
		System.out.println("STRING REVERSAL WITHOUT IN-BUILT FUNCTION");
		System.out.println("---------------------------------------");
Scanner sc=new Scanner(System.in);         
System.out.print("Enter a String: ");  
String str=sc.nextLine();  
System.out.print("Reversed string is: ");  
int i=str.length();                   
while(i>0)  
{  
System.out.print(str.charAt(i-1));                 
i--;                                
}  
	}
	public static void main(String args[])  
{  
		StrRevWithoutInbuilt ob = new StrRevWithoutInbuilt();
		ob.strrev();
}
}
