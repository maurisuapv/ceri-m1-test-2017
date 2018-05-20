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

public class AnimalTest {

	@Test

	public void testAnimal() {
	
		 Animal animal1 = new Animal("Diabuffalo");
		 
		 Animal animal2 = new Animal("Skelephant");

		 Animal animal3 = new Animal("Nian Monster");

		
		assertEquals(animal1.getName(), "Diabuffalo");

		assertEquals(animal2.getName(), "Skelephant");
		
		assertEquals(animal3.getName(), "Nian Monster");

		assertEquals(animal1.getXP(), 6);

		assertEquals(animal2.getXP(), 6);
		
		assertEquals(animal3.getXP(), 6);

		assertTrue(animal1.isSecret());
		
		assertTrue(animal2.isBoss());
		
		assertTrue(animal3.isEndangered());

	}
	

}
