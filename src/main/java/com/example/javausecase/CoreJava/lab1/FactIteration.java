package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class FactIteration {
	static Logger log = Logger.getLogger(FactIteration.class.getName());
	public void factite(int num) {
		int fact = 1;
        for(int i = 1; i <= num; ++i)
        {           
            fact *= i;
        }
        log.info("Factorial of " +num+ " is " + fact);
	}
	public static void main(String[] args) {
		
		log.info("FACTORIAL OF A NUMBER IN ITERATIVE WAY");
		log.info("--------------------------------------");
		log.info("Enter the Number: ");
	    Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();		
		FactIteration ob = new FactIteration();
		ob.factite(num);
		sc.close();
    }
}
