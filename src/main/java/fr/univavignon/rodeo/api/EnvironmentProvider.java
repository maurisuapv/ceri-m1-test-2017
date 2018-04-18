package fr.univavignon.rodeo.api;

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
		
		
		Reader in = null;
		try {
			in = new FileReader("Rodeo Stampede Animals - Animal List.csv");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Iterable<CSVRecord> records = null;
		try {
			records = CSVFormat.EXCEL.parse(in);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (CSVRecord record : records) {
			
			
			
			
			for(int i=0; i<record.size(); i++) {
		
				if(!record.get(i+1).isEmpty() && record.get(i+2).isEmpty()) {
					
					listeEnvironnemets.add(record.get(i));
					
					
				} else if(record.get(i+1).isEmpty()) {
					
					listeEnvironnemets.add(record.get(i));
					
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
