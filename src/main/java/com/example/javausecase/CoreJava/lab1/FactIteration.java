package com.example.javausecase.corejava.lab1;

import java.util.Scanner;

public class FactIteration {
	public void factite(int num) {
		int fact = 1;
        for(int i = 1; i <= num; ++i)
        {           
            fact *= i;
        }
        System.out.println("Factorial of " +num+ " is " + fact);
	}
	public static void main(String[] args) {
		
		System.out.println("FACTORIAL OF A NUMBER IN ITERATIVE WAY");
		System.out.println("--------------------------------------");
		System.out.println("Enter the Number: ");
	    Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();		
		FactIteration ob = new FactIteration();
		ob.factite(num);
		sc.close();
    }
}
