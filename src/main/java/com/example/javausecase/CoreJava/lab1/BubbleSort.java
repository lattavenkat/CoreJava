package com.example.javausecase.corejava.lab1;

import java.util.Scanner;

public class BubbleSort {
	public static void sort(int a[])
	{ 
	int n=a.length,i,j,p,temp;
	for (i = 0;i < n-1; i++) 
	{ 	 
	for (j=0; j<n-i-1; j++)
	{ 
	if(a[j+1]<a[j])
	{
		temp=a[j+1];
		a[j+1]=a[j];
		a[j]=temp;
	}	 
	}  
	} 
	}
	public static void printarray(int a[]){
	for(int i=0; i < a.length; i++){
	 
	System.out.print(a[i]+" ");
	}	 
	}
	public static void main(String[] args) 
	{
	int n, res,i;
	System.out.println("BUBBLE SORT");
	System.out.println("-----------");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of elements in the array:");
	n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("Enter "+n+" elements ");
	for( i=0; i < n; i++)
	{
	a[i] = sc.nextInt();
	}	 
	System.out.println( "elements in array ");
	printarray(a);
	sort(a);
	System.out.println( "\nelements after sorting");
	printarray(a);	 
	}
}
