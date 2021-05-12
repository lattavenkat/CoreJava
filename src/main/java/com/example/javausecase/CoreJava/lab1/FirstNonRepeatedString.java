package com.example.javausecase.corejava.lab1;
import java.util.Scanner;
import java.util.logging.Logger;
public class FirstNonRepeatedString {
	static Logger log = Logger.getLogger(FirstNonRepeatedString.class.getName());
	public void nonrepeatstr(String str ) {
		for (int i = 0; i < str.length(); i++) {
			  boolean found = true;
			  for (int j = 0; j < str.length(); j++) {
				  if ((i != j) && str.charAt(i) == str.charAt(j)) {
					  found= false;
		   				break;
				  }
			  }
		  if (found) {
			   log.info("The first non repeated character in "  +str+ " is: " + str.charAt(i));
			   break;
		   }
		  }
	}
	public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  log.info("FINDING FIRST NON-REPEATED CHARACTER OF A STRING");
	      log.info("-------------------------------------------------");
			
	      log.info("Enter the String :");
	      String str = sc.nextLine();
	      FirstNonRepeatedString ob = new FirstNonRepeatedString();
	      ob.nonrepeatstr(str);	
		  sc.close();	
}	
}
