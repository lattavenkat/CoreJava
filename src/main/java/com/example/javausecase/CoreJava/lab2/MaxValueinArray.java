package com.example.javausecase.corejava.lab2;

import java.util.Scanner;

public class MaxValueinArray {
	public static void main(String[] args)
	{
	int n;
	int max;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of elements in the array:");
	n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the elements of array:");
	for(int i = 0; i < n; i++)
	{
	a[i] = sc.nextInt();
	}
	max = a[0];
	for(int i = 0; i < n; i++)
	{
	if(max < a[i])
	{
	max = a[i];
	}
	}
	System.out.println("Maximum value in the array is:"+max);
	sc.close();	
}
	
}
