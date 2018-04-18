package fr.univavignon.rodeo.api;

	import static org.junit.Assert.assertEquals;

	import static org.junit.Assert.assertFalse;

	import static org.junit.Assert.assertTrue;

	import org.junit.After;

	import org.junit.Before;

	import org.junit.BeforeClass;

	import org.junit.Ignore;

	import org.junit.Test;

	import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class IEnvironmentTest {

	static IEnvironment createMock() {
		
		IEnvironment environment = mock(IEnvironment.class);
	
	 when(environment.getAreas()).thenReturn(51);
	 
	 when(environment.getName()).thenReturn("Environment1");
	 
	 
	 List<ISpecie> iSpeciesList = new ArrayList<ISpecie>();

	 
	 iSpeciesList.add(new ISpecieTest().getTestInstance());
	 
	 iSpeciesList.add(new ISpecieTest().getTestInstance());

	 iSpeciesList.add(new ISpecieTest().getTestInstance());

	 when(environment.getSpecies()).thenReturn(iSpeciesList);
	
	 
	 return environment;
	
	}

	
	
	protected IEnvironment getTestInstance() {
	
		IEnvironment environment = mock(IEnvironment.class);
	
	 when(environment.getAreas()).thenReturn(51);
	 
	 when(environment.getName()).thenReturn("Environment1");
	 
	 
	 List<ISpecie> iSpeciesList = new ArrayList<ISpecie>();

	 
	 iSpeciesList.add(new ISpecieTest().getTestInstance());
	 
	 iSpeciesList.add(new ISpecieTest().getTestInstance());

	 iSpeciesList.add(new ISpecieTest().getTestInstance());

	 when(environment.getSpecies()).thenReturn(iSpeciesList);
	
	 
	 return environment;
	
	}
	
	@Test
	
	public void testGetName() {
		
		IEnvironment environment = this.getTestInstance();
		
		assertEquals("Environment1", environment.getName());
		
		
	}

	public void testGetAreas() {
		
		IEnvironment environment = this.getTestInstance();
		
		assertEquals(51, environment.getAreas());
		
		
	}

	public void testGetSpecies() {
		
		 IEnvironment environment = this.getTestInstance();
		
		 List<ISpecie> iSpeciesList = new ArrayList<ISpecie>();
		 
		 iSpeciesList.add(new ISpecieTest().getTestInstance());
		 
		 iSpeciesList.add(new ISpecieTest().getTestInstance());

		 iSpeciesList.add(new ISpecieTest().getTestInstance());

		 assertEquals(iSpeciesList, environment.getSpecies());
		
	}
	
	
		
}
