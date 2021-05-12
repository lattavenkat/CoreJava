package com.example.javausecase.corejava.lab1;
import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Logger;
public class SortLinkedList {
	static Logger log = Logger.getLogger(SortLinkedList.class.getName());
	public static final int NUMB1 = 23;
	public static final int NUMB2 = 45;
	public static final int NUMB3 = 12;
	public static final int NUMB4 = 37;
	public static final int NUMB5 = 49;
	 public static void main(String[] args) {
		 	log.info("SORT LINKED LIST");
			log.info("----------------");
	        LinkedList<Integer> linklist = new LinkedList<>();
	        linklist.add(NUMB1);
	        linklist.add(NUMB2);
	        linklist.add(NUMB3);
	        linklist.add(NUMB4);
	        linklist.add(NUMB5);
	        log.info("List before sort " +linklist);
	        Collections.sort( linklist );        
	        log.info("Sorted list values " +linklist);
	    }
}
