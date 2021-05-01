package com.example.javausecase.corejava.lab2;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraytoArrayList {
public void arrlist() {
	String list[] = new String[5];
	Scanner  sc = new Scanner ( System.in);
	System.out.println(" Enter minimum of 5 Names:");
	for (int i = 0; i < list.length; i++) {
		list[i]= sc.nextLine();
	}
    List<String> al = Arrays.asList(list);
    System.out.println("=========================");
    System.out.println("Arraylist");
    System.out.println("=========================");
    System.out.println(al);
	sc.close();
}
	public static void main (String[] args)
    {
		System.out.println("CONVERSION OF ARRAY TO ARRAY LIST ");
		System.out.println("-------------------");
		ArraytoArrayList ob = new ArraytoArrayList();
		ob.arrlist();
    }

}
