package com.example.javausecase.corejava.lab2;
import java.util.Scanner;

import java.util.logging.Logger;
public class ReverseIntArray {
	static Logger log = Logger.getLogger(ReverseIntArray.class.getName());
	public static final int NUMB1 = 2;
	public static final int NUMB2 = 5;
	public static void main(String[] args) {
		int numbers[] = new int[NUMB2];
		Scanner  sc = new Scanner ( System.in);
		log.info(" Enter the list of numbers:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]= sc.nextInt();
		}
	      log.info("Array before reverse:");
	      
	      for (int i = 0; i < numbers.length; i++) {
	         log.info(numbers[i] + " ");
	      } 
	      for (int i = 0; i < numbers.length / NUMB1; i++) {
	         int temp = numbers[i];
	         numbers[i] = numbers[numbers.length - 1 - i];
	         numbers[numbers.length - 1 - i] = temp;
	      } 
	      log.info("\nArray after reverse:");
	      for (int i = 0; i < numbers.length; i++) {
	         log.info(numbers[i] + " ");
	      } sc.close();
	   }
	

}
