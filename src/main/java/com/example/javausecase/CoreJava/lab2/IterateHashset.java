package com.example.javausecase.corejava.lab2;

import java.util.logging.Logger;
import java.util.HashSet;
import java.util.Iterator;
public class IterateHashset {
	static Logger log = Logger.getLogger(IterateHashset.class.getName());
	
	 public static void main(String args[])
	    {	       
	        HashSet<String> set = new HashSet<>();
			set.add( "Gokul");
	        set.add( "Latha");
	        set.add( "Srinath");        
        log.info("HashSet: " + set);
        Iterator<String> value = set.iterator();
        log.info("The iterator values are: ");
	        while (value.hasNext()) {
	            log.info(value.next());
	        }
	    }
}
