package com.example.javausecase.corejava.lab2;

import java.util.HashSet;
import java.util.Iterator;
public class IterateHashset {
	 public static void main(String args[])
	    {	       
	        HashSet<String> set = new HashSet<String>();
			set.add( "Gokul");
	        set.add( "Latha");
	        set.add( "Srinath");        
        System.out.println("HashSet: " + set);
        Iterator<String> value = set.iterator();
        System.out.println("The iterator values are: ");
	        while (value.hasNext()) {
	            System.out.println(value.next());
	        }
	    }
}
