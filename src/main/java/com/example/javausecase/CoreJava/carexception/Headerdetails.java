package com.example.javausecase.corejava.carexception;

import java.util.Date;

public class Headerdetails {
    private Date dateTime ;
	private String manufacturerName;	
	private int numberofRecords;	
	private String fileSequence;	
	private int 	total ;
    
    public Headerdetails(Date dateTime, String manufacturerName, int numberofRecords, String fileSequence, int total) {
        this.dateTime = dateTime;
        this.manufacturerName = manufacturerName;
        this.numberofRecords = numberofRecords;
        this.fileSequence = fileSequence;
        this.total = total;
    }
    @Override
    public String toString() {
        return "Headerdetails [dateTime=" + dateTime + ", fileSequence=" + fileSequence + ", manufacturerName="
                + manufacturerName + ", numberofRecords=" + numberofRecords + ", total=" + total + "]";
    }
    public Date getDateTime() {
        return dateTime;
    }
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    public String getManufacturerName() {
        return manufacturerName;
    }
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    public int getNumberofRecords() {
        return numberofRecords;
    }
    public void setNumberofRecords(int numberofRecords) {
        this.numberofRecords = numberofRecords;
    }
    public String getFileSequence() {
        return fileSequence;
    }
    public void setFileSequence(String fileSequence) {
        this.fileSequence = fileSequence;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }


    
}
