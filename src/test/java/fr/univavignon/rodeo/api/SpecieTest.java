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

public class SpecieTest {

	@Test

	public void testGetAnimals() {
	
		
		
		System.out.println("Nb animals "  +new Specie("Buffalo").getAnimals().size());
		
		assertEquals(new Specie("Buffalo").getAnimals().size(), 8);

		
		
	}
	
	@Test

	public void testGetName() {
	
		
		assertEquals(new Specie("Buffalo").getName(), "Buffalo");

		
		
	}
		

}
