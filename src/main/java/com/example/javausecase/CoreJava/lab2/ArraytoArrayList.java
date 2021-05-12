package com.example.javausecase.corejava.lab2;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.logging.Logger;
public class ArraytoArrayList {
	public static final int NUMB1 = 5;
static Logger log = Logger.getLogger(ArraytoArrayList.class.getName());
public void arrlist() {
	String list[] = new String[NUMB1];
	Scanner  sc = new Scanner ( System.in);
	log.info(" Enter minimum of 5 Names:");
	for (int i = 0; i < list.length; i++) {
		list[i]= sc.nextLine();
	}
    List<String> al = Arrays.asList(list);
    log.info("=========================");
    log.info("Arraylist");
    log.info("=========================");
    log.info(" " +al);
	sc.close();
}
	public static void main (String[] args)
    {
		log.info("CONVERSION OF ARRAY TO ARRAY LIST ");
		log.info("-------------------");
		ArraytoArrayList ob = new ArraytoArrayList();
		ob.arrlist();
    }

}
