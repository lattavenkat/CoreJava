package com.example.javausecase.corejava.lab1;

import java.util.Scanner;

public class AmstrongNo {
	public void amstrong(int n) {
		int a=0;
        int temp;
        int c=0;
		temp=n;
        while (n> 0)
        {
            a=n%10;
            n=n/10;
            c+=a*a*a;
        }
        if(temp==c) {
        	System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }        
	}
	public static void main(String[] args) {
		
		System.out.println("AMSTRONG NUMBER");
		System.out.println("---------------");
        Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		AmstrongNo ob= new AmstrongNo();  
		ob.amstrong(n);
        sc.close();
    }
}
