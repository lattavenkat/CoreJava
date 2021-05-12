package com.example.javausecase.corejava.lab1;

import java.util.Scanner;
import java.util.logging.Logger;
public class QuickSort {
	static Logger log = Logger.getLogger(QuickSort.class.getName());
	public static int partition(int a[], int l, int h) {
		int i = l + 1;
		int j = h;
		int c = l;
		int temp;
		while (i <= j) {
			while (i <= h && a[i] < a[c])
				i++;
			while (a[j] > a[c] && j > l)
				j--;
			if (i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			} else {
				break;
			}

		}

		temp = a[c];
		a[c] = a[j];
		a[j] = temp;
		return j;
	}

	public static void sort(int a[], int l, int h) {
		if (l < h) {
			int m = partition(a, l, h);
			sort(a, l, m - 1);
			sort(a, m + 1, h);

		}

	}

	public static void printarray(int a[]) {
		for (int i = 0; i < a.length; i++) {

			log.info(a[i] + " ");
		}

	}

	public static void main(String[] args) {

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
		sort(a, 0, n - 1);
		log.info("\nelements after sorting");
		printarray(a);
		sc.close();
	}

}
