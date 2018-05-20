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

public class Specie implements ISpecie {

	private String name;
	
	private SpecieLevel specieLevel;
	
	public Specie(String name) {
		
		this.name = name;
		
		this.setSpecieLevel(SpecieLevel.CHAMPION);
	}
	
	private void setSpecieLevel(SpecieLevel champion) {
		this.specieLevel = champion;
		
	}

	public int getArea() {
		
		return 6;
	}

	public String getName() {
		
		return this.name;
		
	}
	
	/**
	 * Associated animals getter.
	 * 
	 * @return List of available animal for this specie.
	 */
	
	public List<IAnimal> getAnimals() {
		
		List<IAnimal> animalsList = new ArrayList<IAnimal>();
		
	 	String csvFile = "Rodeo Stampede Animals - Animal List.csv";
		 
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        long lineNb = 0;
        
        boolean animalFound = false;
        
        try {
        	
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] parssingLine = line.split(cvsSplitBy);


        //	System.out.println("Line " + line + " length " + parssingLine.length);

                if(parssingLine.length > 2) {
                		//11
                	
                if(parssingLine[0].equals(this.name)) {
                	
                	for(int i=1; i<13+1; i++) {

                		if(parssingLine[i].length() != 1) {

                			System.out.println("Ajout animal" + parssingLine[i]);
                			animalsList.add(new Animal(parssingLine[i]));
                			
                		}
                		
                	}
                	
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

		return animalsList;
		
	}

	public SpecieLevel getSpecieLevel() {
		return specieLevel;
	}


	
}
