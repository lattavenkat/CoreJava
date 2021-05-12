package com.example.javausecase.corejava.lab2;
import java.util.HashMap;

import java.util.logging.Logger;
public class RemovingKeyValueHashmap {
	public static final int NUMB1 = 10;
	public static final int NUMB2 = 15;
	public static final int NUMB3 = 20;
	public static final int NUMB4 = 25;
	public static final int NUMB5 = 30;
	static Logger log = Logger.getLogger(RemovingKeyValueHashmap.class.getName());
	
	public static void main(String[] args) {
 	    HashMap<Integer, String> hashMap = new HashMap<>();
		 hashMap.put(NUMB1, "Ram");
		 hashMap.put(NUMB2, "Shanmu");
		 hashMap.put(NUMB3, "Ravi");
		 hashMap.put(NUMB4, "Latta");
		 hashMap.put(NUMB5, "Rahul");
	    log.info("Initial Mappings are: " + hashMap);     
	    String returnedValue = hashMap.remove(NUMB3);
	    log.info("Returned value is: "+ returnedValue);
	    log.info("New map is: "+ hashMap);
	}
}
