package com.example.javausecase.corejava.lab2;
import java.util.ArrayList;
import java.util.LinkedList;

import java.util.logging.Logger;
public class LinkedlisttoArraylist {
	static Logger log = Logger.getLogger(LinkedlisttoArraylist.class.getName());
	
	public static void main(String[] args){
		ArrayList<String> arrList = new ArrayList<>();
		log.info("Array List:");
		arrList.add("Srinath");
		arrList.add("gokul");
		arrList.add("latta");
		log.info(" " +arrList);
		
		LinkedList<String> linkList = new LinkedList<>(arrList);
		log.info("Linked List:");
		log.info(" " +linkList);
	}
	
}
