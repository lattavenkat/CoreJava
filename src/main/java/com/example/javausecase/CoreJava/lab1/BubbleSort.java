package com.example.javausecase.corejava.lab1;
import java.util.logging.Logger;
import java.util.Scanner;

public class BubbleSort {
	static Logger log = Logger.getLogger(BubbleSort.class.getName());
	public static void sort(int[] a) {
		int n = a.length;
		int i;
		int j;
		int temp;
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (a[j + 1] < a[j]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void printarray(int[] a) {
		for (int i = 0; i < a.length; i++) {

			log.info(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		log.info("BUBBLE SORT");
		log.info("-----------");
		Scanner sc = new Scanner(System.in);
		log.info("Enter number of elements in the array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		log.info("Enter " + n + " elements ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		log.info("elements in array ");
		printarray(a);
		sort(a);
		log.info("\nelements after sorting");
		printarray(a);
		sc.close();
	}
}
