package com.example.javausecase.corejava.lab2;
import java.util.HashMap;

public class RemovingKeyValueHashmap {
	public static void main(String[] args) {
 	    HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		 hashMap.put(10, "Ram");
		 hashMap.put(15, "Sham");
		 hashMap.put(20, "Ravi");
		 hashMap.put(25, "Latta");
		 hashMap.put(30, "Rahul");
	    System.out.println("Initial Mappings are: " + hashMap);     
	    String returnedValue = (String)hashMap.remove(20);
	    System.out.println("Returned value is: "+ returnedValue);
	    System.out.println("New map is: "+ hashMap);
	}
}
