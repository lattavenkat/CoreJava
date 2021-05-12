package com.example.javausecase.corejava.lab1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;
public class RemoveDuplicateArr {
	static Logger log = Logger.getLogger(RemoveDuplicateArr.class.getName());
	public static void main(String[] args) {
		  int counter = 0;
		  log.info("REMOVING DUPLICATES IN A ARRAY");
		  log.info("------------------------------");
		 
		  Scanner sc = new Scanner(System.in);
	      log.info("Enter the size of the array: ");
	      int size = sc.nextInt();
	      int[] arr = new int[size];
	      log.info("Enter the elements of the array: ");
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
	        log.info("Array with Unique Elements : ");
	        for (int i = 0; i <= counter; i++) {
	            log.info(" " +uniqueArr[i]);
	        }
			sc.close();
	    }
}
