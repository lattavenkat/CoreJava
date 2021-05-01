package com.example.javausecase.corejava.lab1;
import java.util.Scanner;

public class SwapWithThirdVar {
	public static void main(String[] args) {
		System.out.println("SWAPPING WITH THIRD VARIABLE");
		System.out.println("-------------------------------");
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

		swap(x, y);
		sc.close();
	}

	private static void swap(int x, int y) {
		int z = x;
		x = y;
		y = z;
		System.out.println("After Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);
	}
}
