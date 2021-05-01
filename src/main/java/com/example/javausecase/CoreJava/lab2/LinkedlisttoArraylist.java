package com.example.javausecase.corejava.lab2;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlisttoArraylist {
	public static void main(String[] args){
		ArrayList<String> arrList = new ArrayList<String>();
		System.out.println("Array List:");
		arrList.add("Srinath");
		arrList.add("gokul");
		arrList.add("latta");
		System.out.println(arrList);
		
		LinkedList<String> linkList = new LinkedList<String>(arrList);
		System.out.println("Linked List:");
		System.out.println(linkList);
	}
	
}
