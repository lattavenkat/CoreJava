package com.example.javausecase.corejava.lab1;
import java.util.LinkedList;
import java.util.logging.Logger;
public class LengthofLinkedList {

    static Logger log = Logger.getLogger(LengthofLinkedList.class.getName());
	public static void main(String args[])
    {  
		log.info("FINDING LENGTH OF THE LINKED LIST");
	    log.info("-------------------------------");
			
        LinkedList<String> list = new LinkedList<>();  
        
        list.add("java");
        list.add("C");
        list.add("C++");
        list.add("Python");
        list.add("Machine Learning");
        list.add("Artificial Intelligence");
        log.info("Values in Linked List: \n" + list);      
        log.info("The Length of the linked list is: " + list.size());
    }
}
