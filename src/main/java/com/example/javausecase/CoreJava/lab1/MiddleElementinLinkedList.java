package com.example.javausecase.corejava.lab1;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
public class MiddleElementinLinkedList {
	static Logger log = Logger.getLogger(MiddleElementinLinkedList.class.getName());
	public static final int NUMB1 = 2;
	public static final int NUMB2 = 1000;
	private static String findMiddle (List<String> list) {
		int size = list.size();
		int middle = (size / NUMB1);
		return list.get(middle);
	}
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		for (int i = 0; i < NUMB2; i++) {
			list.add(String.valueOf(i));
		}
		log.info("Middle Element of Linked List is: " + findMiddle(list));
	} 
	
}
