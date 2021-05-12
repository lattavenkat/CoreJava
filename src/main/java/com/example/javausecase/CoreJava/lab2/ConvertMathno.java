package com.example.javausecase.corejava.lab2;
import java.util.Scanner;

import java.util.logging.Logger;
public class ConvertMathno {
    public static final int NUMB1 = 10;
static Logger log = Logger.getLogger(ConvertMathno.class.getName());
	public void mathno(int n) {
		
        int n1=n;
        int n2=n;
        int b=n1%NUMB1;
        int a=n2/NUMB1; 
        String[] singleDigits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
        String[] twoDigits = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
        String[] tenMultiple = new String[]{"","","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
        if(a==1)
        {
            log.info(twoDigits[b+1]);
        }
        else if(b==0)
            log.info(tenMultiple[a]);
        else
            log.info(tenMultiple[a]+" "+singleDigits[b]);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        log.info("Enter the number");
        int n=sc.nextInt();
		ConvertMathno ob = new ConvertMathno();
		ob.mathno(n);
        sc.close();
    }	
}
