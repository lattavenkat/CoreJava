package com.example.javausecase.corejava.lab2;
import java.util.logging.Logger;
public class ArrayIntersection {
   
   public static final int NUMB1 = 2;
   public static final int NUMB2 = 3;
   public static final int NUMB3 = 4;
   public static final int NUMB4 = 8;
   public static final int NUMB5 = 6;
   public static final int NUMB6 = 9;
   public static final int NUMB7 = 8;
   public static final int NUMB8 = 1;
   public static final int NUMB9 = 5;
static Logger log = Logger.getLogger(ArrayIntersection.class.getName());
public void intersection() {
	log.info("ARRAY INTERSECTION");
	log.info("-------------------");
	int arr1[] = {NUMB1, NUMB3, NUMB5, NUMB7, NUMB6};
    int arr2[] = {NUMB8, NUMB2, NUMB3, NUMB9, NUMB5, NUMB7, NUMB6};
    int m = arr1.length;
    int n = arr2.length;
    int i = 0, j = 0;
    log.info("Array 1: ");
    for(int k = 0; k < m; k++) {
       log.info(arr1[k] + " "); 
    }
    
    log.info("\nArray 2: ");
    for(int k = 0; k < n; k++) {
       log.info(arr2[k] + " ");
    }
    log.info("\n");
    log.info("Intersection of two arrays is: ");
    while (i < m && j < n) {
       if (arr1[i] < arr2[j])
          i++;
       else if (arr2[j] < arr1[i])
          j++;
       else {
          log.info(arr2[j++]+" ");
          i++; 
       }
    }
}
	public static void main(String[] args) {
		
		ArrayIntersection ob = new ArrayIntersection();
		ob.intersection();
		      
		   }
	}


