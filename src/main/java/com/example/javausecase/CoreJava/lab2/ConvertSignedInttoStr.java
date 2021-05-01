package com.example.javausecase.corejava.lab2;

import java.util.Scanner;

public class ConvertSignedInttoStr {
	 public static void main(String[] args) {
		 int num ;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Days");
			num = sc.nextInt();
	        String msg = String.format("There are %s Days Left", num);	        
	        System.out.println(msg);             
	    }
}
