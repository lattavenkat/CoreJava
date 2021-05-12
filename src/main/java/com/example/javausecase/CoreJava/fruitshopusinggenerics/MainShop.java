package com.example.javausecase.corejava.fruitshopusinggenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

class SortbyName implements Comparator<FruitInfo> {
    @Override
    public int compare(FruitInfo f1, FruitInfo f2) {
        return f2.fruitName.compareTo(f1.fruitName);
    }
}

public class MainShop {
    static Logger log = Logger.getLogger(MainShop.class.getName());
    public static final int NUMB1 = 100;
    public static final int NUMB2 = 25;
    public static final int NUMB3 = 2;
    public static final int NUMB4 = 3;
    public static void main(String[] args) {
        List<FruitInfo> list = new ArrayList<>();
        list.add(new FruitInfo("apple", "Latha", "Exotic", "red", NUMB1, NUMB2));
        list.add(new FruitInfo("kiwi", "Anbu", "Fresh", "green", NUMB2, NUMB1));
        list.add(new FruitInfo("pineapple", "Karthi", "Exotic", "orange", NUMB2, NUMB1));
        list.add(new FruitInfo("Watermelon", "Karthi", "Organic", "red", NUMB1, NUMB2));

        Scanner sc = new Scanner(System.in);
        log.info("choose : \n 1)VIEW THE PRODUCT DETAILS \n 2) SORT BY NAME \n 3) SEARCH BY PRODUCTS");
        int op = sc.nextInt();
        if (op == 1) {
            log.info("Product Details");
            for (int i = 0; i < list.size(); i++)
                log.fine(" " +list.get(i));

        } 
        else if (op == NUMB3) {

            Collections.sort(list, new SortbyName());
            log.info("\n FRUIT NAME HAS BEEN SORTED RANDOMLY");
            for (int i = 0; i < list.size(); i++)
                 log.fine((list.get(i)+ " "));
        } 
        else if (op == NUMB4) {
            log.info("SEARCH PRODUCTS");
            log.info("1) Search By Fruitname \n 2)Search by Distributor Name");
            int searchnum = sc.nextInt();
            switch (searchnum) {

                case 1:
                    log.info("enter fruitname");
                    Scanner d = new Scanner(System.in);
                    String fruitname = d.nextLine();
                    switch (fruitname) {
                        case "apple":

                            FruitInfo result1 = list.stream().filter(x -> "apple".equals(x.getFruitName())).findAny()
                                    .orElse(null);
                                    log.fine(" " +result1);
                            break;

                        case "kiwi":

                            FruitInfo result2 = list.stream().filter(x -> "kiwi".equals(x.getFruitName())).findAny()
                                    .orElse(null);
                            log.fine(" " +result2);
                            break;

                        case "pineapple":

                            FruitInfo result3 = list.stream().filter(x -> "pineapple".equals(x.getFruitName())).findAny()
                                    .orElse(null);
                            log.fine(" " +result3);
                            break;

                        case "Watermelon":

                            FruitInfo result4 = list.stream().filter(x -> "Watermelon".equals(x.getFruitName())).findAny()
                                    .orElse(null);
                                    log.fine(" " +result4);
                            break;

                        default:

                            log.info("product are not in stock");
                    }
                    break;

                case NUMB3:
                log.info("enter fruitname");
                    Scanner da = new Scanner(System.in);
                    log.info(
                            "Choose Distributor \n 1)LATHA EXOTIC PRODUCTS \n 2)ANBU FRESH FRUIT DISTRIBUTOR \n 3)KARTHI ORGANIC FRUIT DISTRIBUTORS");
                    int distributorname = da.nextInt();
                    switch (distributorname) {
                        case 1:

                            FruitInfo result1 = list.stream().filter(x -> "Latha".equals(x.getFruitDistributor()))
                                    .findAny().orElse(null);
                                    log.info(" " +result1);
                            break;

                        case NUMB3:
                            FruitInfo result2 = list.stream().filter(x -> "Anbu".equals(x.getFruitDistributor()))
                                    .findAny().orElse(null);
                                    log.info(" " +result2);
                            break;

                        case NUMB4:
                            FruitInfo result3 = list.stream().filter(x -> "Karthi".equals(x.getFruitDistributor()))
                                    .findAny().orElse(null);
                                    log.info(" " +result3);
                            break;
                        default:
                            log.info("enter a valid option");
                    }
                    break;
                default:
                log.info("INVALID NUMBER!");

            }
        }
        sc.close();

    }
}
