package com.example.javausecase.corejava.lab2;
import java.util.Scanner;

public class ReverseIntArray {
	public static void main(String[] args) {
		int numbers[] = new int[5];
		Scanner  sc = new Scanner ( System.in);
		System.out.println(" Enter the list of numbers:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]= sc.nextInt();
		}
	      System.out.println("Array before reverse:");
	      
	      for (int i = 0; i < numbers.length; i++) {
	         System.out.print(numbers[i] + " ");
	      } 
	      for (int i = 0; i < numbers.length / 2; i++) {
	         int temp = numbers[i];
	         numbers[i] = numbers[numbers.length - 1 - i];
	         numbers[numbers.length - 1 - i] = temp;
	      } 
	      System.out.println("\nArray after reverse:");
	      for (int i = 0; i < numbers.length; i++) {
	         System.out.print(numbers[i] + " ");
	      } sc.close();
	   }
	

}
