package com.example.javausecase.corejava.lab1;
import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedList {
	 public static void main(String[] args) {
		 	System.out.println("SORT LINKED LIST");
			System.out.println("----------------");
	        LinkedList<Integer> linklist = new LinkedList<Integer>();
	        linklist.add(23);
	        linklist.add(45);
	        linklist.add(12);
	        linklist.add(37);
	        linklist.add(49);
	        System.out.println("List before sort " +linklist);
	        Collections.sort( linklist );        
	        System.out.println("Sorted list values " +linklist);
	    }
}
