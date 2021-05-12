package com.example.javausecase.corejava.lab2;
import java.util.ArrayList;

import java.util.logging.Logger;
public class ArraylisttoStringArray {
	
static Logger log = Logger.getLogger(ArraylisttoStringArray.class.getName());
public void arr() {
	ArrayList<String> names= new ArrayList<>();
	names.add("Ankur");
	names.add("Ajeet");
	names.add("Harsh");
	names.add("John");
	log.info("Before Conversion-ARRAY LIST");	
    log.info(" " +names);
    log.info("===========================");
	String frnames[]=names.toArray(new String[names.size()]);
	log.info("After Conversion-STRING ARRAY");
	for(String k: frnames)
	{
		log.info(k);
	}
}
public static void main(String[] args) {
	log.info("CONVERSIN OF ARRAYLIST TO STRING ARRAY");
	log.info("--------------------------------------");
	ArraylisttoStringArray ob = new ArraylisttoStringArray();
	ob.arr();
}
}

