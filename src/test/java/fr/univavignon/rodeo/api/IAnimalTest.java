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

public class IAnimalTest {

	
	protected IAnimal getTestInstance() {
	
	IAnimal animal = mock(IAnimal.class);
	
	 when(animal.getName()).thenReturn("Toto");
	 
	 when(animal.getXP()).thenReturn(42);
	 
	 when(animal.isEndangered()).thenReturn(true);
	 
	 when(animal.isSecret()).thenReturn(true);
	 
	 when(animal.isBoss()).thenReturn(false);
	 
		return animal;
	}
	
	@Test
	
	public void testGetName() {
		
	IAnimal animal = this.getTestInstance();
		
		assertEquals("Toto", animal.getName());
		
	}
	
	public void testGetXP() {
		
		IAnimal animal = this.getTestInstance();
		
		assertEquals(42, animal.getXP());
		
	}
	

	public void testIsEndangered() {

		IAnimal animal = this.getTestInstance();

		assertEquals(true, animal.isEndangered());

	}
	
	public void testIsSecret() {

		IAnimal animal = this.getTestInstance();

		assertEquals(true, animal.isSecret());

	}

	public void testIsBoss() {
	
		IAnimal animal = this.getTestInstance();

		assertEquals(false, animal.isBoss());

	}
	
}
