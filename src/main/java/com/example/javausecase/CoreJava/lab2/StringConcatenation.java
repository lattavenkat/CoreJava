package com.example.javausecase.corejava.lab2;

import java.util.Scanner;

public class StringConcatenation {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter Month Of Year ");
	        String month = sc.nextLine();
	        System.out.println("Enter  A Year : ");
	        String year = sc.nextLine();
	        System.out.println("Enter  Date of Month: ");
	        int day = sc.nextInt();
	        String Dob = "Date Of Brith : " + day + " " + month + " "+year;
	        System.out.println(Dob);
	        sc.close();
	    }
}
