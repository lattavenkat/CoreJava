package com.example.javausecase.corejava.lab2;
import java.util.Scanner;

import java.util.logging.Logger;
public class CountVowels {
    
static Logger log = Logger.getLogger(CountVowels.class.getName());
	public void vowelcount() {
		String str;
        Scanner sc = new Scanner(System.in);
		log.info("Enter the string");
		str = sc.nextLine();
            str = str.toLowerCase();   
      int count = 0;
      for (int i = 0; i < str.length(); i++)
        {           
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u')
            {               
                count++;
            }
        }
      log.info("Total no of vowels in string are: " + count);
      sc.close();
    }
	public static void main(String[] args)    
    {	
		CountVowels ob = new CountVowels();
		ob.vowelcount();
    }
}
