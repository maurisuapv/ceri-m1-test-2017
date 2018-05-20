package fr.univavignon.rodeo.api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class EnvironmentProvider implements IEnvironmentProvider {

	/**
	 * Retrieves and returns the list of available
	 * environments name.
	 * 
	 * @return A list of environment name.
	 */
	public List<String> getAvailableEnvironments() {
	
		List<String> listeEnvironnemets = new ArrayList<String>();

		 String csvFile = "Rodeo Stampede Animals - Animal List.csv";
		 
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ",";

	        long lineNb = 0;
	        
	        try {

	            br = new BufferedReader(new FileReader(csvFile));
	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] parssingLine = line.split(cvsSplitBy);

                	//System.out.println("Line " + line + " length " + parssingLine.length);


	                if(lineNb == 0 && parssingLine[0].toUpperCase().equals(parssingLine[0]))  {
	                	
	                	System.out.println("If 1 ajoute " + parssingLine[0]);
						listeEnvironnemets.add(parssingLine[0]);

	                	
	                	
	                } else if(parssingLine.length == 1 && parssingLine[0].toUpperCase().equals(parssingLine[0])) {
	                	System.out.println("If 2 ajoute " + parssingLine[0]);

						listeEnvironnemets.add(parssingLine[0]);

	                }
	                
	                lineNb++;
	            }

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	        	
	        System.out.println("Line nb " + lineNb);
	        
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }

		return listeEnvironnemets;
		
	}

	/**
	 * Retrieves and returns the environment
	 * denoted by the given <tt>name</tt>.
	 * 
	 * @param name Name of the environment to retrieve.
	 * @return Required environment if available, <tt>null</tt> otherwise.
	 * @throws IllegalArgumentException If the given <tt>name</tt> is null.
	 */
	public Environment getEnvironment(String name) throws IllegalArgumentException {
		
		
		return new Environment(name);
		
		
		
	}

	
	
	
}
