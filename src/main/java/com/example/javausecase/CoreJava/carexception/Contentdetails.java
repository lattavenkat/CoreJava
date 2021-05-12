package com.example.javausecase.corejava.carexception;

import java.util.Date;

public class Contentdetails {
    protected String category ;	
    protected String sKU ;
    protected Date dateofManufacturer;
    protected String iSFragile ;	
    protected String modelNumber;
    protected String color;
    protected Float costStep;

    
    public Contentdetails(String category, String sKU, Date dateofManufacturer, String iSFragile, String modelNumber,
            String color, Float costStep) {
        this.category = category;
        this.sKU = sKU;
        this.dateofManufacturer = dateofManufacturer;
        this.iSFragile = iSFragile;
        this.modelNumber = modelNumber;
        this.color = color;
        this.costStep = costStep;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public String getsKU() {
        return sKU;
    }


    public void setsKU(String sKU) {
        this.sKU = sKU;
    }


    public Date getDateofManufacturer() {
        return dateofManufacturer;
    }


    public void setDateofManufacturer(Date dateofManufacturer) {
        this.dateofManufacturer = dateofManufacturer;
    }


    public String getiSFragile() {
        return iSFragile;
    }


    public void setiSFragile(String iSFragile) {
        this.iSFragile = iSFragile;
    }


    public String getModelNumber() {
        return modelNumber;
    }


    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public Float getCostStep() {
        return costStep;
    }


    public void setCostStep(Float costStep) {
        this.costStep = costStep;
    }


    @Override
    public String toString() {
        return "Contentdetails [category=" + category + ", color=" + color + ", costStep=" + costStep
                + ", dateofManufacturer=" + dateofManufacturer + ", iSFragile=" + iSFragile + ", modelNumber="
                + modelNumber + ", sKU=" + sKU + "]";
    }
    

    
}
