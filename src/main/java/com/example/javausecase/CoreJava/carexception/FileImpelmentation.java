package com.example.javausecase.corejava.carexception;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileImpelmentation extends Myreader {
	static Logger log = Logger.getLogger(FileImpelmentation.class.getName());
    static String txt="";
	static void createNewFile()
	{
		try {
		      File myObj = new File("file.txt");
		      if (myObj.createNewFile()) {
		       log.info("File created: " + myObj.getName());
		        new UtilitDetailis().addData();
		      } else {
		       log.info("File already exists.");
		        readFileIntoList();
		      }
		    } catch (IOException e) {
		     log.info("An error occurred.");
		      e.printStackTrace();
		    }

	}
	public static List<String> readFileIntoList() 
	{ 
		BufferedReader bufReader;
		ArrayList<String> listOfLines = new ArrayList<>(); 
		try {
			File file = new File("file.txt");
			Reader read = new FileReader(file);
			 txt = file.getName();
			if(validateTheFile(txt) !=false)
			{
				bufReader = new BufferedReader(read);				
				String line = bufReader.readLine(); 	
				while (line != null)
				{ 		
					listOfLines.add(line); 
					line = bufReader.readLine();	
				}		
				bufReader.close();
			}
			else
			{
				listOfLines.add(null);
			}			
		}
		catch (IOException e) {
		     log.info("An error occurred.");
		      e.printStackTrace();
		    }
		return listOfLines;	
	}
	public static void convertTxtToCsv() throws IOException
	{
		String[] val =txt.split(".");
	    final Path path = Paths.get("path", "to", "folder");
	    final Path txt1 = path.resolve(txt);
	    final Path csv = path.resolve(val[0]+".csv");
	    try (
	    final Stream<String> lines = Files.lines(txt1);
	    final PrintWriter pw = new PrintWriter(Files.newBufferedWriter(csv, StandardOpenOption.CREATE_NEW))) 
	    {
	        	lines.map((line)-> line.split("\\|")).
	                map((line)-> Stream.of(line).collect(Collectors.joining(","))).
	                forEach(pw::println);
	    }
	}
	public void writeFile(List<Headerdetails> h ,List<Contentdetails> c) throws IOException
	{
		FileWriter writer = new FileWriter("file.txt"); 
		int i=0;
		for(Headerdetails hd: h) {
		
			writer.write("****"+hd.getDateTime()+"****"+hd.getFileSequence()+"*******"
			+hd.getManufacturerName()+"****"
			+hd.getNumberofRecords()+"****"
			+hd.getTotal()+"****"+System.lineSeparator());
		}
		for(Contentdetails cn:c)
		{
			writer.write(i+1 +"****"
					+cn.getModelNumber() +"****"
					+cn.getsKU()+"****"
					+cn.getModelNumber()+"****"
					+cn.getColor()+"****"
					+cn.getCostStep()+"****"+System.lineSeparator());
		}
		writer.close();
	}
	public void display() throws IOException
	{
		ArrayList<String> list = new ArrayList<>();
		int count=0;
		list.addAll(readFileIntoList());
		if(list.isEmpty())
		{
			log.info("No Records Found");
		}
		else
		{
			for(String l:list)
			{ 
				log.info(l);
				count++;
			}
			log.fine(""+count);
			convertTxtToCsv();
		}
		
		
	}
	
	
}

