package com.example.javausecase.corejava.fruitshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class MyShop {
    static  Logger log = Logger.getLogger(MyShop.class.getName());
    public static void main(String[] args) {

    List<FruitsDetails> fd = new ArrayList<>();	
    
Scanner sc = new Scanner(System.in);
log.info("Enter the number of fruit de1tail that you wanna insert : ");
int n=sc.nextInt();
for (int i=0;i<n;i++) {
    
    log.info("Enter the fruit name");		
    String fruitName= sc.next();
    log.info("Enter the fruit Type");
    String fruitType= sc.next();
    log.info("Enter weight of the fruit");
    double fruitWeight=sc.nextDouble();
    log.info("Enter the Distributor name");
    String distributor= sc.next();
    log.info("Enter the fruit category");
    String fruitcategory= sc.next();
    log.info("Enter the location");
    String location= sc.next();
    log.info("Enter the expiryDate");
    String expiryDate= sc.next();
    log.info("Enter the quantity");
    int quantity= sc.nextInt();
    log.info("Enter the cost");
    double cost= sc.nextDouble();
    
    fd.add(new FruitsDetails(fruitName, fruitType, distributor, fruitWeight, fruitcategory, location, expiryDate, quantity, cost,quantity*cost));
    
}

FruitsOperation fo=new FruitsOperation();
fo.getDetails((ArrayList<FruitsDetails>)fd);
fo.findByDis((ArrayList<FruitsDetails>)fd,"latha");
fo.findByName((ArrayList<FruitsDetails>)fd,"apple");
fo.findByloc((ArrayList<FruitsDetails>)fd,"market");
sc.close();
}
}
