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

public class INamedObjectTest {

	static INamedObject createMock() {
		
		INamedObject iNamedObject = mock(INamedObject.class);
	
		when(iNamedObject.getName()).thenReturn("Nom");
	 	 
		return iNamedObject;
	
	}

	
	
	protected INamedObject getTestInstance() {
	
		INamedObject iNamedObject = mock(INamedObject.class);
		
		when(iNamedObject.getName()).thenReturn("Nom");
	 	 
		return iNamedObject;
	
	}
	
	@Test
	
	public void testGetName() {
		
		INamedObject iNamedObject = this.getTestInstance();
		
		assertEquals("Nom", iNamedObject.getName());
		
		
	}
	
	
		
}
