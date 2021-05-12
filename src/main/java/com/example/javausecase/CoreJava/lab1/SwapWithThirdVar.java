package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class SwapWithThirdVar {
	static Logger log = Logger.getLogger(SwapWithThirdVar.class.getName());
	public static void main(String[] args) {
		log.info("SWAPPING WITH THIRD VARIABLE");
		log.info("-------------------------------");
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		log.info("Enter the Values of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		log.info("Before Swapping");
		log.info("Value of x is :" + x);
		log.info("Value of y is :" + y);

		swap(x, y);
		sc.close();
	}

	private static void swap(int x, int y) {
		int z = x;
		x = y;
		y = z;
		log.info("After Swapping");
		log.info("Value of x is :" + x);
		log.info("Value of y is :" + y);
	}
}
