package lab2;

import java.util.ArrayList;

public class ArraylisttoStringArray {
public void arr() {
	ArrayList<String> names= new ArrayList<String>();
	names.add("Ankur");
	names.add("Ajeet");
	names.add("Harsh");
	names.add("John");
	System.out.println("Before Conversion-ARRAY LIST");	
    System.out.println(names);
    System.out.println("===========================");
	String frnames[]=names.toArray(new String[names.size()]);
	System.out.println("After Conversion-STRING ARRAY");
	for(String k: frnames)
	{
		System.out.println(k);
	}
}
public static void main(String[] args) {
	System.out.println("CONVERSIN OF ARRAYLIST TO STRING ARRAY");
	System.out.println("--------------------------------------");
	ArraylisttoStringArray ob = new ArraylisttoStringArray();
	ob.arr();
}
}

