package com.example.javausecase.corejava.lab1;

import java.util.Scanner;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		System.out.println("REMOVE ALL WHITE SPACE FROM STRING USING REPLACE FUNCTION");
		System.out.println("---------------------------------------------------------");
		String line = "";
		Scanner sc =  new Scanner(System.in);
		System.out.println("Frame your sentence:");
		line= sc.nextLine();
		System.out.println("Your sentence after removing white space:");
		System.out.println(line.replaceAll(" ",""));
		sc.close();
	}
	
}
