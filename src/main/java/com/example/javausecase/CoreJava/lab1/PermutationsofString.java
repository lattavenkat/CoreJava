package com.example.javausecase.corejava.lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class PermutationsofString {
	static Logger log = Logger.getLogger(PermutationsofString.class.getName());

	private static void permutationWithRepeation(String str) {

		log.info("The Permutated Strings are:");
		showPermutation(str, "");
	}

	private static void showPermutation(String str, String str1) {

		if (str1.length() == str.length()) {
			log.info(str1);
			return;
		}
		for (int i = 0; i < str.length(); i++) {

			showPermutation(str, str1 + str.charAt(i));
		}
	}

	public static void main(String[] args) {
		log.info("PERMUTATION OF STRING");
		log.info("---------------------");
		Scanner sc = new Scanner(System.in);
		log.info("Enter a String: ");
		String n = sc.next();
		permutationWithRepeation(n);
		sc.close();
	}
}
