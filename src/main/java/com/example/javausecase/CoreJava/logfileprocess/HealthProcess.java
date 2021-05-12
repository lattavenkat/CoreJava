package com.example.javausecase.corejava.logfileprocess;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.logging.Logger;


public class HealthProcess {
    public static final int NUMB1 = 0;
    public static final int NUMB2 = 1;
    public static final int NUMB3 = 2;
    public static final int NUMB4 = 3;
    public static final int NUMB5 = 4;
    public static final int NUMB6 = 5;
    public static final int NUMB7 = 6;
    public static final int NUMB8 = 10;
    public static final int NUMB9 = 16;
    public static final int NUMB10 = 23;
    public static final int NUMB11 = 30;
    public static final int NUMB12 =38;
    public static final int NUMB13 = 48;
    public static final int NUMB14 = 15;
    public static final int NUMB15 = 59;
static Logger log = Logger.getLogger(HealthProcess.class.getName());
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("myfile.txt");
        List<String> lineslist = new ArrayList<>();
        List<String> headslist = new ArrayList<>();
        ArrayList<HealthCare> clist = new ArrayList<>();
        ArrayList<PatientsRecord> rlist = new ArrayList<>();
        String line;
        String head;
        String[] fields;
        String[] headerfield;
        String dateTime;
        String region;
        String clinicType;
        int recordCount;
        String filesequence;
        String id;
        String ref;
        int age;
        try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {

            head = br.readLine();
            headslist.add(head);
            for (int j = 0; j < headslist.size(); j++) {
                headerfield = headslist.get(j).split("%");
                dateTime = headerfield[0];
                region = headerfield[1];
                clinicType = headerfield[NUMB4];
                recordCount = Integer.parseInt(headerfield[NUMB7]);
                filesequence = headerfield[NUMB14];
                clist.add(new HealthCare( dateTime,region,  clinicType,  recordCount,  filesequence));
            }
            while ((line = br.readLine()) != null) {
                lineslist.add(line);
            }

            for (int j = 0; j < lineslist.size(); j++) {
                fields = lineslist.get(j).split("%");
                double[] values = new double[NUMB7];
                id = fields[0];
                ref = fields[NUMB5];
                values[0] = Double.parseDouble(fields[NUMB8]);
                values[1] = Double.parseDouble(fields[NUMB9]);
                values[NUMB3] = Double.parseDouble(fields[NUMB10]);
                values[NUMB4] = Double.parseDouble(fields[NUMB11]);
                values[NUMB5] = Double.parseDouble(fields[NUMB12]);
                values[NUMB6] = Double.parseDouble(fields[NUMB14]);
                age = Integer.parseInt(fields[NUMB15]);

                rlist.add(new PatientsRecord(id, ref, values, age));
            }
        } catch (Exception e) {
            log.info(" " +e);
        }

        log.info("Clinic:");
        for (int m = 0; m < clist.size(); m++) {
            HealthCare c = clist.get(m);
            log.info(" " +c);
        }

        log.info("Checking clinic Seq.Number Records: ");
        getClinicRecords(rlist, clist.get(0).getFilesequence());

        checkRecords(rlist, clist);
        System.out.close();

    }

    public static void getClinicRecords(List<PatientsRecord> reclist, String sno) {
        reclist.stream().filter(r -> r.getId().startsWith(sno)).collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void checkRecords(List<PatientsRecord> relist, List<HealthCare> cllist) {
        Scanner se = new Scanner(System.in);
        int rno = 0;
        int count = 0;
        log.info("Enter the Clinic Seq Number:");
        String seq3 = se.next();
        for (int i = 0; i < cllist.size(); i++) {
            HealthCare c = cllist.get(i);
            if (c.getFilesequence().equalsIgnoreCase(seq3)) {
                rno += c.getRecordCount();
            }
        }

        for (int j = 0; j < relist.size(); j++) {
            PatientsRecord r = relist.get(j);
            if (r.getId().startsWith(seq3.toLowerCase()) || r.getId().startsWith(seq3.toUpperCase())) {
                count += 1;
            }
        }
        HealthServices.checkList(relist, cllist, rno, count);
        se.close();
    }
}
