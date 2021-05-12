package com.example.javausecase.corejava.lab2;
import java.util.Scanner;

import java.util.logging.Logger;
public class MaxValueinArray {
	static Logger log = Logger.getLogger(MaxValueinArray.class.getName());
	
	public static void main(String[] args)
	{
	int n;
	int max;
	Scanner sc = new Scanner(System.in);
	log.info("Enter the number of elements in the array:");
	n = sc.nextInt();
	int a[] = new int[n];
	log.info("Enter the elements of array:");
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
	log.info("Maximum value in the array is:"+max);
	sc.close();	
}
	
}
