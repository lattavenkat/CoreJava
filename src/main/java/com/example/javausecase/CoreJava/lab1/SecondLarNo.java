package com.example.javausecase.corejava.lab1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;
public class SecondLarNo {
	public static final int NUMB1 = 2;
	static Logger log = Logger.getLogger(SecondLarNo.class.getName());
		public void seclarge(int[] arr,int n) {
			Arrays.sort(arr);
			log.info("Sorted Array: ");
			for(int i=0;i<arr.length;i++)
			{
				log.info(" " +arr[i]);
			}
			log.info("Second Largest Number: " +arr[n-NUMB1]);
		}

		public static void main(String[] args) {
			log.info("FINDING THE SECOND LARGEST NUMBER");
			Scanner sc=new Scanner(System.in);
			log.info("Enter n value : ");
			int n=sc.nextInt();
			int[] arr=new int[n];
			log.info("Array Values: ");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			SecondLarNo sl=new SecondLarNo();
		    sl.seclarge(arr,n);
			sc.close();
		}
}
