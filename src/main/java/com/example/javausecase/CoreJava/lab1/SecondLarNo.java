package com.example.javausecase.corejava.lab1;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLarNo {
		public void seclarge(int[] arr,int n) {
			Arrays.sort(arr);
			System.out.println("Sorted Array: ");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("Second Largest Number: " +arr[n-2]);
		}

		public static void main(String[] args) {
			System.out.println("FINDING THE SECOND LARGEST NUMBER");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter n value : ");
			int n=sc.nextInt();
			int[] arr=new int[n];
			System.out.println("Array Values: ");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			SecondLarNo sl=new SecondLarNo();
		    sl.seclarge(arr,n);
			sc.close();
		}
}
