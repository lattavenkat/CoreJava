package com.example.javausecase.corejava.lab2;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseAraryList {
	public static void main(String[] args) 
    {
              
        ArrayList<String> arrlist = new ArrayList<String>(); 
        arrlist.add("JAVA");         
        arrlist.add("ANDROID");        
        arrlist.add("ANGULAR");
        arrlist.add("C++");
        arrlist.add("JAVASCRIPT");         
        arrlist.add("HTML");
        System.out.println("Before Reverse ArrayList:");         
        System.out.println(arrlist);
        Collections.reverse(arrlist);
        System.out.println("After Reverse ArrayList:");         
        System.out.println(arrlist);
    }
	
}
