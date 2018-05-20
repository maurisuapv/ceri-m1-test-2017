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

public class Environment implements IEnvironment {

	
	private String name;
	
	public List<Animal> animalsList;
	
	public Environment(String name) {
		
		this.name = name;
		
	
		
	}
	
	public int getAreas() {
		return 6;
	}

	/**
	 * Getter for the species available in this
	 * environment.
	 * 
	 * @return List of species available.
	 */
	public List<ISpecie> getSpecies() {
		
		List<ISpecie> speciesList = new ArrayList<ISpecie>();
		
		 String csvFile = "Rodeo Stampede Animals - Animal List.csv";
		 
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ",";
	        
	        long lineNb = 0;
	        
	        boolean inTargetEnvironment = false;
	        
	        try {
	        	
	            br = new BufferedReader(new FileReader(csvFile));
	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] parssingLine = line.split(cvsSplitBy);


               //	System.out.println("Line " + line + " length " + parssingLine.length);

	                if(parssingLine.length > 0) {

		                if(inTargetEnvironment) {
		                	
		                	System.out.println("In target environment");

	                if(!parssingLine[0].toUpperCase().equals(parssingLine[0])) {
	                	
	                	System.out.println("Ajout espece" + parssingLine[0]);
						speciesList.add(new Specie(parssingLine[0]));

	                	
	                } else {
	                	
	                	inTargetEnvironment = false;
	                	
	                }
		                } else if(parssingLine[0].equals(this.name)) {
		                	System.out.println("detecting In target environment");

	                	inTargetEnvironment = true;
	                	
	                } 
	                
		                
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

				return speciesList;
		
					
	}

	public String getName() {
		
		return this.name;
	}

	
}
