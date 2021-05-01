package lab1;

import java.util.Scanner;

public class DigitReverse {
	public void digrev(int n) {
		 int reversed=0;
		while(n != 0) 
		{    	    
	          int digit = n % 10;
	          reversed = reversed * 10 + digit;
	          n = n/ 10;
	    }
	      System.out.println("Reverse of specified number is: " +reversed);
		}
	public static void main(String args[])
	   {	     
	      System.out.println("REVERSING A DIGIT");
	      System.out.println("------------------");
	      System.out.println("Enter your number: ");	    
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      DigitReverse ob = new DigitReverse();
	      ob.digrev(num);
	   }
}
