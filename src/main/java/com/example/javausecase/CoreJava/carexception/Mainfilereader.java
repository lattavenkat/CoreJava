package com.example.javausecase.corejava.carexception;

import java.io.IOException;
import java.util.logging.Logger;

public class Mainfilereader {
    static Logger log = Logger.getLogger(Mainfilereader.class.getName());
    public static void main(String[] args) throws IOException {

		log.info("Create the File");
		new FileImpelmentation();
        FileImpelmentation.createNewFile();
		
		
		log.info("It Will Display All Records");
	    new FileImpelmentation().display();
		}
}
