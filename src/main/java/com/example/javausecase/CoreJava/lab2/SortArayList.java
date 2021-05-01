package com.example.javausecase.corejava.lab2;

import java.util.ArrayList;
import java.util.Collections;

public class SortArayList {
	public static void main(String args[])   
	{   
	
	ArrayList<String> list = new ArrayList<String>();   
	  
	list.add("Data Science");   
	list.add("Testing");   
	list.add("C#");   
	list.add("Basic Language");   
	list.add("UML");   
	list.add("Algorithms ");   
	list.add("Computer Networks");  
	list.add("Python");  
	 
	System.out.println("Before Sorting: "+ list);   
	
	Collections.sort(list, Collections.reverseOrder());   
	
	System.out.println("After Sorting In Descending Order: "+ list);   
	}


	
}
