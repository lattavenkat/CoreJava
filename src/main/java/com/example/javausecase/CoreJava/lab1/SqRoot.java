package com.example.javausecase.corejava.lab1;

import java.util.Scanner;

public class SqRoot {
public static void main(String args[]) {
	    int temp, sqrt;
	    System.out.println("SQUARE ROOT OF A NUMBER");
		System.out.println("-----------------------");
	    System.out.println("Enter any number:");
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		sqrt = n / 2;
	    temp = 0;
	    while(sqrt != temp){
	    	temp = sqrt;
	    	sqrt = ( n/temp + temp) / 2;
	    }
	    System.out.println("Square root of "+ n+ " is: " +sqrt);
	} 

	

}
