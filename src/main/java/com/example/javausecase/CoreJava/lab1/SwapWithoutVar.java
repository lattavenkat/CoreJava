package com.example.javausecase.corejava.lab1;

import java.util.Scanner;

public class SwapWithoutVar {
	public void swap(int num1,int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping : ");
		System.out.println("Number 1: " +num1+ "\nNumber 2 : "+num2);		
	}
	public static void main(String[] args) {
		System.out.println("SWAPPING WITH OUT THIRD VARIABLE");
		System.out.println("-------------------------------");
		System.out.println("Enter number 1: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2=sc.nextInt();
		if((num1>0 || num1<0) && (num2<0 || num2>0)){
			SwapWithoutVar sp=new SwapWithoutVar();
			sp.swap(num1,num2);
		}
		else {
			System.out.println("Invalid Input");			
		}		
	}	
}
