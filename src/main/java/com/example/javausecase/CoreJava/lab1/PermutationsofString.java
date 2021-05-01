package com.example.javausecase.corejava.lab1;
import java.util.Scanner;

public class PermutationsofString {
	private static void permutationWithRepeation(String str) {
		  
		  System.out.println("The Permutated Strings are:");
		  showPermutation(str, "");
		 }

	private static void showPermutation(String str, String str1) {

		  if (str1.length() == str.length()) {
		   System.out.println(str1);
		   return;
		  }
		  for (int i = 0; i < str.length(); i++) {

		   showPermutation(str, str1 + str.charAt(i));
		  }
		 }
public static void main(String[] args) {
	System.out.println("PERMUTATION OF STRING");
	System.out.println("---------------------");
    Scanner sc =  new Scanner(System.in);
	System.out.println("Enter a String: ");
	String n = sc.next();
	permutationWithRepeation(n);
	sc.close();
}
}






























//
//package lab1;
//
//public class PermutationsofString {
//	private static void permutationWithRepeation(String str1) {
//		  System.out.println("The given string is: PQR");
//		  System.out.println("The permuted strings are:");
//		  showPermutation(str1, "");
//		 }
//
//	private static void showPermutation(String str1, String NewStringToPrint) {
//
//		  if (NewStringToPrint.length() == str1.length()) {
//		   System.out.println(NewStringToPrint);
//		   return;
//		  }
//		  for (int i = 0; i < str1.length(); i++) {
//
//		   showPermutation(str1, NewStringToPrint + str1.charAt(i));
//		  }
//		 }
//public static void main(String[] args) {
//			  permutationWithRepeation("PQR");
//			 }
//}