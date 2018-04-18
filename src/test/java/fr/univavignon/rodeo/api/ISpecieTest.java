package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ISpecieTest {

	static ISpecie createMock() {
		
		 ISpecie specie = mock(ISpecie.class);
		 
		 when(specie.getName()).thenReturn("Extended");
		 
		 when(specie.getArea()).thenReturn(51);
		 
		 List<IAnimal> iAnimalsList = new ArrayList<IAnimal>();

		 
		 iAnimalsList.add(new IAnimalTest().getTestInstance());
		 
		 iAnimalsList.add(new IAnimalTest().getTestInstance());

		 iAnimalsList.add(new IAnimalTest().getTestInstance());
		 
		 when(specie.getAnimals()).thenReturn(iAnimalsList);
		 
			return specie;
		}
		

	protected ISpecie getTestInstance() {
		
	 ISpecie specie = mock(ISpecie.class);
	 
	 when(specie.getName()).thenReturn("Extended");
	 
	 when(specie.getArea()).thenReturn(51);
	 
	 List<IAnimal> iAnimalsList = new ArrayList<IAnimal>();

	 
	 iAnimalsList.add(new IAnimalTest().getTestInstance());
	 
	 iAnimalsList.add(new IAnimalTest().getTestInstance());

	 iAnimalsList.add(new IAnimalTest().getTestInstance());
	 
	 when(specie.getAnimals()).thenReturn(iAnimalsList);
	 
		return specie;
	}
	
	@Test
	
	public void testGetName() {
		
		ISpecie specie = this.getTestInstance();
		
		assertEquals("Extended", specie.getName());
		
	}
	
	public void testGetArea() {
		
		ISpecie specie = this.getTestInstance();
		
		assertEquals(51, specie.getArea());
		
	}
	

	public void testGetAnimals() {

		ISpecie specie = this.getTestInstance();

		 List<IAnimal> iAnimalsList = new ArrayList<IAnimal>();

		 
		 iAnimalsList.add(new IAnimalTest().getTestInstance());
		 
		 iAnimalsList.add(new IAnimalTest().getTestInstance());

		 iAnimalsList.add(new IAnimalTest().getTestInstance());

		assertEquals(iAnimalsList, specie.getAnimals());

	}
	
	
	
}
