package fr.univavignon.rodeo.api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Animal implements IAnimal {

	private String name;
	
	private boolean secret;

	private boolean boss;

	private boolean endangered;

	private boolean isCaughted;
	
	public Animal(String name) {
		
		this.name = name;
		
	 	String csvFile = "Rodeo Stampede Animals - Animal List.csv";
		 
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        long lineNb = 0;
        
        boolean animalFound = false;
        
        try {
        	
            br = new BufferedReader(new FileReader(csvFile));
            if(!animalFound) {
            	
            
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] parssingLine = line.split(cvsSplitBy);


        //	System.out.println("Line " + line + " length " + parssingLine.length);

                if(parssingLine.length > 0) {
                		//11
                	
                	
                	if(parssingLine.length > 2) {
                	for(int i=0; i<13+1; i++) {
                		
                		System.out.println("Longueur + " + parssingLine[i].length()  + " Col " + i + " " + parssingLine[i]);
                		
                		if(parssingLine[i].equals(this.name)) {
                			
                			animalFound = true;
                			
                		}
                		
                	}
                	
                	}
                	
                	if(animalFound) {
                		System.out.println("Line " + line + " length " + parssingLine.length);
                		System.out.println("Length 11 " + parssingLine[11].length());

                		if(parssingLine[11].equals(this.name)) {
                			
                			this.secret = true;
                			
                		} else {
                			this.secret = false;
                		}
                		
                		if(parssingLine[12].equals(this.name)) {
                			
                			this.boss = true;
                			
                		} else {
                			this.boss = false;
                		}
                		
                		if(parssingLine[13].equals(this.name)) {
                			
                			this.endangered = true;
                			
                		} else {
                			this.endangered = false;
                		}
                		
                		animalFound = false;
                	}
                			                
                }
                
                lineNb++;

            }
            
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
		
		
	}
	
	public int getXP() {
		
		return 6;
	}

	/**
	 * Indicates if this animal is a secret one.
	 * 
	 * @return <tt>true</tt> if this animal is a secret one, <tt>false</tt> otherwise.
	 */
	public boolean isSecret() {
		
		return this.secret;

	}

	/**
	 * Indicates if this animal is an endangered one..
	 * 
	 * @return <tt>true</tt> if this animal is an endangered one, <tt>false</tt> otherwise.
	 */
	public boolean isEndangered() {
		
		return this.endangered;
		
	}

	/**
	 * Indicates if this animal is a boss.
	 * 
	 * @return <tt>true</tt> if this animal is a boss, <tt>false</tt> otherwise.
	 */
	public boolean isBoss() {
 
		return this.boss;

	}

	@Override
	public String getName() {
		 return this.name;
	}

	public boolean isCaughted() {
		return isCaughted;
	}

	public void setCaughted(boolean isCaughted) {
		this.isCaughted = isCaughted;
	}
	
}
