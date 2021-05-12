package com.example.javausecase.corejava.logfileprocess;

import java.util.Arrays;

public class PatientsRecord {
    private String id;
    private String patientRefNo;
    protected double[] levelValues;
    private int age;
    public PatientsRecord(String id, String patientRefNo, double[] levelValues, int age) {
        this.id = id;
        this.patientRefNo = patientRefNo;
        this.levelValues = levelValues;
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPatientRefNo() {
        return patientRefNo;
    }
    public void setPatientRefNo(String patientRefNo) {
        this.patientRefNo = patientRefNo;
    }
    public double[] getLevelValues() {
        return levelValues;
    }
    public void setLevelValues(double[] levelValues) {
        this.levelValues = levelValues;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "PatientsRecord [age=" + age + ", id=" + id + ", levelValues=" + Arrays.toString(levelValues)
                + ", patientRefNo=" + patientRefNo + "]";
    }

    
}
