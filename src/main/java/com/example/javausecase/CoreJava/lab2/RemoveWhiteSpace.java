package com.example.javausecase.corejava.lab2;
import java.util.Scanner;

public class RemoveWhiteSpace {

		public static void main(String[] args) {
	        String sentence ;
	        Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string");
			sentence = sc.nextLine();
	        System.out.println("Original sentence: " + sentence);
	        sentence = sentence.replaceAll("\\s", "");
	        System.out.println("After replacement: " + sentence);
			sc.close();
	    }
	

}
