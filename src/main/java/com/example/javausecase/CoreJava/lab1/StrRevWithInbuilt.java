package com.example.javausecase.corejava.lab1;

import java.util.Scanner;

public class StrRevWithInbuilt {
	public void strrev() {
		String str;
		String rev ="";
		System.out.println("Enter the String");
		Scanner sc = new  Scanner(System.in);
		str= sc.nextLine();
		System.out.println("Original String: " +str);
		int len= str.length();
		for( int i= len-1;i>=0;i--) {
			rev= rev + str.charAt(i);	
		}
		System.out.println("Reversed String is: " +rev);
		sc.close();
	}
	public static void main(String args[])  
	{  
		System.out.println("STRING REVERSAL WITH IN-BUILT FUNCTION");
		System.out.println("---------------------------------------");
		StrRevWithInbuilt ob = new StrRevWithInbuilt();
		ob.strrev();
	}}
