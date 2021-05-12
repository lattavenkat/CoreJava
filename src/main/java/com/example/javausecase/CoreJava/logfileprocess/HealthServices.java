package com.example.javausecase.corejava.logfileprocess;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.opencsv.CSVWriter;

public final class  HealthServices {
    public static final int NUMB1 = 10;
    public static final double NUMB2 = 10.0;
    public static final double NUMB3=5.0;
    public static final int NUMB4 = 45;
    public static final int NUMB5 =2;
    public static final int NUMB6 =3;
    public static final int NUMB7 =4;
    public static final int NUMB8 =5;

static Logger log = Logger.getLogger(HealthServices.class.getName());
    private HealthServices() {
    }

    public static void writeCsv(List<HealthCare> cllist, List<PatientsRecord> nrlist) {
        try (CSVWriter writer = new CSVWriter(new FileWriter("healthreportfile.csv"))) {
            for (int i = 0; i < cllist.size(); i++) {
                HealthCare c = cllist.get(i);
                String[] str = { c.getDateTime(), c.getRegion(), c.getClinicType(), String.valueOf(c.getRecordCount()), c.getFilesequence() };
                writer.writeNext(str);
                writer.flush();
            }
            for (int j = 0; j < nrlist.size(); j++) {
                PatientsRecord r = nrlist.get(j);
                String[] str2 = { r.getId(), r.getPatientRefNo(), String.valueOf(r.getAge()), String.valueOf(r.levelValues[NUMB8]),
                        String.valueOf(r.levelValues[1]), String.valueOf(r.levelValues[0]), String.valueOf(r.levelValues[NUMB6]),
                        String.valueOf(r.levelValues[NUMB5]), String.valueOf(r.levelValues[NUMB7]) };
                writer.writeNext(str2);
                writer.flush();
            }
        } catch (Exception e) {
            log.info(" " +e);
        }
    }

    public static void checkList(List<PatientsRecord> relist, List<HealthCare> cllist, int rno, int count) {
        List<PatientsRecord> nrlist = new ArrayList<>();
        List<PatientsRecord> drlist = new ArrayList<>();

        if (rno == count) {
            for (int k = 0; k < relist.size(); k++) {
                PatientsRecord r1 = relist.get(k);
                if (r1.levelValues[NUMB8] > 0 && r1.getAge() > 0 && r1.levelValues[1] > 0 && r1.levelValues[0] > 0 && r1.levelValues[NUMB6] > 0
                        && r1.levelValues[NUMB5] > 0 && r1.getPatientRefNo() != null && r1.levelValues[NUMB7] > 0 && checkAgeVale(r1.levelValues[NUMB6],r1.getAge())==NUMB1 && checkLcdPcs(r1.levelValues[1],r1.levelValues[NUMB5])==1) {
                            log.info(r1.getPatientRefNo() + ": Checked");
                            nrlist.add(r1);
                    }else {
                    log.info(r1.getPatientRefNo() + ": Record Incomplete!");
                    drlist.add(r1);
                }
        }
    }
    else{
        log.info("Records do not match the total count!");
    log.info("Correct List");
        }
    for(int m = 0;m<nrlist.size();m++){
        PatientsRecord nr = nrlist.get(m);
        log.info(" " +nr);
    }
    log.info("Incorrect List");
    for(int n = 0;n<drlist.size();n++)
    {
        PatientsRecord dr = drlist.get(n);
        log.info(" " +dr);
    }log.info("Want to convert checked record to CSV: (y/n)");
    Scanner se = new Scanner(System.in);
    String ch = se.next();if(ch.equalsIgnoreCase("y"))
    {
        writeCsv(cllist, nrlist);
    }else
    {
        log.info("Thank You");
    }se.close();
    }

    public static int checkAgeVale(double a, double b) {
        if(a>NUMB4 && b<NUMB4 ){
            return NUMB1;
        }else{
        return 0;
        }
    }

    public static int checkLcdPcs(double x, double y) {
        if(x<NUMB2 && y<NUMB2 ){
            return 1;
        }else{
        return 0;
        }
    }

    
}
