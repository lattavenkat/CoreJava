package com.example.javausecase.corejava.carexception;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UtilitDetailis  extends FileImpelmentation{
    public static final int S1 = 1234;
    public static final int S2 = 123;
    public static final double  S3 = 123.0;
    public void addData() throws IOException
	{
		Date dt = new Date();

		List<Headerdetails> h = new ArrayList<>();
		List<Contentdetails> c = new ArrayList<>();
       
		h.add(new Headerdetails(dt, "FrontShieldGlass", S1, "2022020YCarSheild001212121", S2));
		
		c.add(new Contentdetails("ShieldGlass", "123454", dt, "12022020CarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("BACKShieldGlass", "12345458", dt, "1022020YCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("HeadLightGlass", "1234545890987654445", dt, "12022027YCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("Vinsheild Glass", "1234545890987654345", dt, "12022025YCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("FrontShieldGlass", "123454589098765345", dt, "120220206CarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("FrontGlass", "1234545890987658845", dt, "12022024YCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("Frontheadlight", "1234545890987659545", dt, "12022022YCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("RareheadLight", "1234545890987658545", dt, "12022028YCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("Bonent", "1234545890987657545", dt, "12022026YCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("BackWheel", "123454589098764545", dt, "12022020LCarSheild001212121", "y", "red",(float)S3));
		c.add(new Contentdetails("Frontwheel", "1234545890987624545", dt, "1202202KYCarSheild001212121", "y", "red",(float)S3));
		c.add(new Contentdetails("Steering Wheel", "1234545890987614545", dt, "1202202JYCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("Side Mirror", "1234545890987644545", dt, "1202202JYCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("Front Mirror", "1234545890987564545", dt, "1202202HYCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("Right Indicator", "12345458909872234545", dt, "120220O0YCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("Left Indicator", "1234545890987632545", dt, "1202202FYCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("BackRareLight", "1234545890987658545", dt, "1202202FYCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("Black Mirror", "1234545890987655245", dt, "12022022YCarSheild001212121", "y", "red",(float) S3));
		c.add(new Contentdetails("Engine", "1234545890987654545", dt, "1202202DYCarSheild001212121", "y", "red",(float) S3));
	
		writeFile(h , c);
	
	}
    
}
