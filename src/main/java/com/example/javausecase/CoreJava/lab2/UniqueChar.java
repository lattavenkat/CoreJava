package com.example.javausecase.corejava.lab2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;


public class UniqueChar {
	
static Logger log = Logger.getLogger(UniqueChar.class.getName());
	
	static String str;
	 public static boolean isUniquestr(String str) {
	        char[] chars = str.toCharArray();
	        Arrays.sort(chars);
	        for (int i = 1; i < chars.length; ++i) {
	            if (chars[i] == chars[i-1]) {
	                return false;
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {			
		Scanner sc = new Scanner(System.in);
		log.info("Enter the string");
		str = sc.nextLine();
			log.info("Original String : "+str);
			log.info("String has all unique characters: "+isUniquestr(str));
		sc.close();
	}
}
