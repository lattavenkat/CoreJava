package com.example.javausecase.corejava.fruitshopusinggenerics;

public class FruitInfo {
    String fruitName;
    String fruitDistributor;
    String fruitType;
    String fruitColor;
    Integer fruitWeight;
    Integer fruitPrice;
    
    public FruitInfo(String fruitName, String fruitDistributor, String fruitType, String fruitColor,
            Integer fruitWeight, Integer fruitPrice) {
        this.fruitName = fruitName;
        this.fruitDistributor = fruitDistributor;
        this.fruitType = fruitType;
        this.fruitColor = fruitColor;
        this.fruitWeight = fruitWeight;
        this.fruitPrice = fruitPrice;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitDistributor() {
        return fruitDistributor;
    }

    public void setFruitDistributor(String fruitDistributor) {
        this.fruitDistributor = fruitDistributor;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    public Integer getFruitWeight() {
        return fruitWeight;
    }

    public void setFruitWeight(Integer fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    public Integer getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(Integer fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    @Override
    public String toString() {
        return "FruitInfo [fruitColor=" + fruitColor + ", fruitDistributor=" + fruitDistributor + ", fruitName="
                + fruitName + ", fruitPrice=" + fruitPrice + ", fruitType=" + fruitType + ", fruitWeight=" + fruitWeight
                + "]";
    }
    
}
