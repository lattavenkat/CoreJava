package com.example.javausecase.corejava.lab1;

import java.util.Scanner;

public class PrimeNo {
	public void primemeth(int n)
	{
		boolean prime=false;
		if(n<0) {
			System.out.println("Negative Numbers not allowed");
		}
		else if(n==0 || n==1) {
			System.out.println(n + " is not a Prime Number");
		}
		else
		{
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					System.out.println(n + " is not a Prime Number");
					prime=true;
					break;
					
				}
			}
			if(prime==false)
			{
				System.out.println(n+ "is a prime number");
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("CHECK WHETHER A NUMBER IS A PRIME OR NOT");
	     System.out.println("----------------------------------------");
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);		
		int n=sc.nextInt();
		PrimeNo pm=new PrimeNo();
		pm.primemeth(n);
	}

}
