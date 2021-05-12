package com.example.javausecase.corejava.lab1;

import java.util.Scanner;
import java.util.logging.Logger;
public class AmstrongNo {
    static Logger log = Logger.getLogger(AmstrongNo.class.getName());
    public static final int NUMB1 = 10;
	public void amstrong(int n) {
		int a=0;
        int temp;
        int c=0;
		temp=n;
        while (n> 0)
        {
            a=n%NUMB1;
            n=n/NUMB1;
            c+=a*a*a;
        }
        if(temp==c) {
        	log.info("Armstrong Number");
        }
        else {
            log.info("Not a Armstrong Number");
        }        
	}
	public static void main(String[] args) {
		
		log.info("AMSTRONG NUMBER");
		log.info("---------------");
        Scanner sc =  new Scanner(System.in);
		log.info("Enter a Number: ");
		int n = sc.nextInt();
		AmstrongNo ob= new AmstrongNo();  
		ob.amstrong(n);
        sc.close();
    }
}
