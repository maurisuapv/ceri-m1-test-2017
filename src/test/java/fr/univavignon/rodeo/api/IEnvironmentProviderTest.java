package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class IEnvironmentProviderTest {

	protected IEnvironmentProvider getTestInstance() {
		
		IEnvironmentProvider environmentProvider = mock(IEnvironmentProvider.class);
	
		List<String> listeEnvironnments = new ArrayList<String>();
		
		listeEnvironnments.add("Environment1");

		listeEnvironnments.add("Environment2");

		listeEnvironnments.add("Environment3");

	 when(environmentProvider.getAvailableEnvironments()).thenReturn(listeEnvironnments);
	 
	 when(environmentProvider.getEnvironment("Environment1")).thenReturn(IEnvironmentTest.createMock());
	 

	 
	 return environmentProvider;
	
	}
	
	@Test
	
	public void testGetAvailableEnvironments() {
		
		IEnvironmentProvider environmentProvider = this.getTestInstance();

		List<String> listeEnvironnments = new ArrayList<String>();
		
		listeEnvironnments.add("Environment1");

		listeEnvironnments.add("Environment2");

		listeEnvironnments.add("Environment3");

		assertEquals(listeEnvironnments, environmentProvider.getAvailableEnvironments());
		
		
	}

	public void testGetEnvironment() {
		
		IEnvironmentProvider environmentProvider = this.getTestInstance();
		
		assertEquals(IEnvironmentTest.createMock(), environmentProvider.getEnvironment("Environment1"));
		
		
	}



}
