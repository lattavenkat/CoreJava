package com.example.javausecase.corejava.lab2;
	
import java.util.logging.Logger;

public class DatatypeRange {

static Logger log = Logger.getLogger(DatatypeRange.class.getName());
	public static void main(String[] args) {
	      log.info("Max Values");
	        log.info("Integer Max: " + Integer.MAX_VALUE);
	        log.info("Float Max: " + Float.MAX_VALUE );
	        log.info("Double Max: " + Double.MAX_VALUE );
	        log.info("Byte Max: " + Byte.MAX_VALUE );
	        log.info("Short Max: " + Short.MAX_VALUE );
	        log.info("Long Max: " + Long.MAX_VALUE );
	        
	        
	        log.info("============================================");
	        log.info("Min Values");
	        log.info("Integer Min: " + Integer.MIN_VALUE);
	        log.info("Float Min: " + Float.MIN_VALUE);
	        log.info("Double Min: " + Double.MIN_VALUE);
	        log.info("Byte Min " + Byte.MIN_VALUE);
	        log.info("Short Min: " + Short.MIN_VALUE);
	        log.info("Long Min " + Long.MIN_VALUE);
	    }
}
