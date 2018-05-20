package fr.univavignon.rodeo.api;

import fr.univavignon.rodeo.api.*;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Ignore;

import org.junit.Test;

public class EnvironmentTest {

	@Test

	public void testGetSpecies() {
	
	List<ISpecie> speciesList = new ArrayList<ISpecie>();
		
		speciesList.add(new Specie("Boar"));
		speciesList.add(new Specie("Gorilla"));
		
		speciesList.add(new Specie("Alligator"));
		speciesList.add(new Specie("Hippo"));

		speciesList.add(new Specie("Tiger"));
		speciesList.add(new Specie("Toucan"));

		speciesList.add(new Specie("Rhino"));
		
		List<ISpecie> speciesList2 = new ArrayList<ISpecie>();

		speciesList2 = new Environment("JUNGLE").getSpecies();
		
		assertTrue(speciesList.size() == speciesList2.size());

		int i =0;
		
		
		for(ISpecie specie : speciesList) {
			
			assertTrue(specie.getName().equals(speciesList2.get(i).getName()));

			i++;
		}
		
	}
	
	

	

	
	@Test

	public void testGetAreas() {
	
			
		assertEquals(new Environment("JUNGLE").getAreas(), 6);
		
		
	}

	
	@Test

	public void testGetName() {
	
			
		assertEquals(new Environment("JUNGLE").getName(), "JUNGLE");
		
		
	}


}
