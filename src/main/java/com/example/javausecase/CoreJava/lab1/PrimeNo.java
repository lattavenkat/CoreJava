package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class PrimeNo {
	static Logger log = Logger.getLogger(PrimeNo.class.getName());
	public static final int NUMB1 = 2;
	public void primemeth(int n)
	{
		boolean prime=false;
		if(n<0) {
			log.info("Negative Numbers not allowed");
		}
		else if(n==0 || n==1) {
			log.fine(n + " is not a Prime Number");
		}
		else
		{
			for(int i=NUMB1;i<=n/NUMB1;i++) {
				if(n%i==0) {
					log.info(n+ " is not a Prime Number");
					prime=true;
					break;
					
				}
			}
			if(prime == false)
			{
				log.info(n+ " is a prime number");
			}
		}
	}
	public static void main(String[] args) {
		log.info("CHECK WHETHER A NUMBER IS A PRIME OR NOT");
	     log.info("----------------------------------------");
		log.info("Enter number : ");
		Scanner sc=new Scanner(System.in);		
		int n=sc.nextInt();
		PrimeNo pm=new PrimeNo();
		pm.primemeth(n);
		sc.close();
	}

}
