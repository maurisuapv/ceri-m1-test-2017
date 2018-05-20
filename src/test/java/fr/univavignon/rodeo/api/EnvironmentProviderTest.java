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

public class EnvironmentProviderTest {

	@Test

	public void testGetAvailableEnvironments() {
	
		List<String> environmentsList = new ArrayList<String>();
		
		environmentsList.add("SAVANNAH");
		environmentsList.add("JUNGLE");
		
		environmentsList.add("MOUNTAIN");
		environmentsList.add("OUTBACK");

		environmentsList.add("TUNDRA");
		environmentsList.add("JURASSIC");

		environmentsList.add("OLYMPUS");
		environmentsList.add("EPIC ANIMALS");

		
		assertEquals(environmentsList, new EnvironmentProvider().getAvailableEnvironments());

		
		
	}
	
	
	
	@Test

	public void testGetEnvironment() {
	
			
		assertEquals(new EnvironmentProvider().getEnvironment("JUNGLE").getName(), new Environment("JUNGLE").getName());

		
		
	}
	

}
