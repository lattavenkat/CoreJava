package com.example.javausecase.corejava.lab1;
import java.util.LinkedList;
import java.util.List;

public class MiddleElementinLinkedList {
	private static String FindMiddle (List<String> list) {
		int size = list.size();
		int middle = (size / 2);
		return list.get(middle).toString();
	}
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < 1000; i++) {
			list.add(String.valueOf(i));
		}
		System.out.println("Middle Element of Linked List is: " + FindMiddle(list));
	} 
	
}
