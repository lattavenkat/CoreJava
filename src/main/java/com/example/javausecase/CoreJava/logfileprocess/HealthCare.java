package com.example.javausecase.corejava.logfileprocess;

public class HealthCare {
    private String dateTime;
    private String region;
    private String clinicType;
    private int recordCount;
    private String filesequence;
    
    public HealthCare(String dateTime, String region, String clinicType, int recordCount, String filesequence) {
        this.dateTime = dateTime;
        this.region = region;
        this.clinicType = clinicType;
        this.recordCount = recordCount;
        this.filesequence = filesequence;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getClinicType() {
        return clinicType;
    }

    public void setClinicType(String clinicType) {
        this.clinicType = clinicType;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public String getFilesequence() {
        return filesequence;
    }

    public void setFilesequence(String filesequence) {
        this.filesequence = filesequence;
    }

    @Override
    public String toString() {
        return "HealthCare [clinicType=" + clinicType + ", dateTime=" + dateTime + ", filesequence=" + filesequence
                + ", recordCount=" + recordCount + ", region=" + region + "]";
    }
}
