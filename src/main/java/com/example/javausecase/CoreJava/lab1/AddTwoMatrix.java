package com.example.javausecase.corejava.lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class AddTwoMatrix {
	
static Logger log = Logger.getLogger(AddTwoMatrix.class.getName());
			public static void main(String args[])
	  {
				
		int row;
		int col;
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		log.info("ADDITION OF TWO MATRIX\n");
		log.info("----------------------");
		log.info("Enter the number of rows: ");
		row = sc.nextInt();
		 
		log.info("Enter the number columns: ");
		col = sc.nextInt();
		 
		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int res[][] = new int[row][col];
		 
		log.info("Enter the elements of matrix1");		 
		for ( i= 0 ; i < row ; i++){		 		 
			for ( j= 0 ; j < col ;j++){
		
				mat1[i][j] = sc.nextInt();
				log.info(" ");
			}
		}		
		log.info("Enter the elements of matrix2");		 
		for ( i= 0 ; i < row ; i++){		 
			for ( j= 0 ; j < col ;j++){
		
				mat2[i][j] = sc.nextInt();
				log.info(" ");
			}
		}
		log.info("Matrix Sum : \n");
		for ( i= 0 ; i < row ; i++ ){
			for ( j= 0 ; j < col ;j++) {
				res[i][j] = mat1[i][j] + mat2[i][j] ; 	
				log.fine(" " +res[i][j]+ "\t");				 				
			}
			log.info(" ");
		}
		sc.close();
	  }
}
