package com.example.javausecase.corejava.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateArr {
	public static void main(String[] args) {
		  int counter = 0;
		  System.out.println("REMOVING DUPLICATES IN A ARRAY");
		  System.out.println("------------------------------");
		 
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array: ");
	      int size = sc.nextInt();
	      int[] arr = new int[size];
	      System.out.println("Enter the elements of the array: ");
	      for(int i=0; i<size; i++) {
	         arr[i] = sc.nextInt();
	      }

	        int[] uniqueArr = new int[arr.length];
	        Arrays.sort(arr);
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] != arr[i + 1]) {
	                uniqueArr[counter] = arr[i];
	                counter++;
	            }
	        }
	        uniqueArr[counter] = arr[arr.length - 1];
	        System.out.println("Array with Unique Elements : ");
	        for (int i = 0; i <= counter; i++) {
	            System.out.println(uniqueArr[i]);
	        }
	    }
}
