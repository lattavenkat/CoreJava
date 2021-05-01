package com.example.javausecase.corejava.lab1;

import java.util.LinkedList;

public class LengthofLinkedList {
	public static void main(String args[])
    {  
		System.out.println("FINDING LENGTH OF THE LINKED LIST");
	    System.out.println("-------------------------------");
			
        LinkedList<String> list = new LinkedList<String>();  
        
        list.add("java");
        list.add("C");
        list.add("C++");
        list.add("Python");
        list.add("Machine Learning");
        list.add("Artificial Intelligence");
        System.out.println("Values in Linked List: \n" + list);      
        System.out.println("The Length of the linked list is: " + list.size());
    }
}
