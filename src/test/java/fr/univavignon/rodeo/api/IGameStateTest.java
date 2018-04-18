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

public class IGameStateTest {

	static IGameState createMock() {
		
		IGameState gameState = mock(IGameState.class);
	
		 when(gameState.getName()).thenReturn("Nom");
		 	 
		 when(gameState.getProgression()).thenReturn(0);
	
		 when(gameState.getSpecieLevel(ISpecieTest.createMock())).thenReturn(SpecieLevel.CHAMPION);
	
		 gameState.catchAnimal(new IAnimalTest().getTestInstance());
		 
		 gameState.exploreArea();
		 
		 return gameState;
	
	}

	
	
	protected IGameState getTestInstance() {
	
		IGameState gameState = mock(IGameState.class);
		
	 when(gameState.getName()).thenReturn("Nom");
	 
	 when(gameState.getProgression()).thenReturn(0);
	 
	 when(gameState.getSpecieLevel(ISpecieTest.createMock()));
	 
	 	
	 
	 return gameState;
	
	}
	
	@Test
	
	public void testGetName() {
		
		IGameState gameState = this.getTestInstance();
		
		assertEquals("Nom", gameState.getName());
		
	}

	public void testGetProgression() {
		
		IGameState gameState = this.getTestInstance();
		
		assertEquals(0, gameState.getProgression());
		
		
	}

	public void testGetSpecieLevel() {
		
	IGameState gameState = this.getTestInstance();
		
		assertEquals(SpecieLevel.CHAMPION, gameState.getSpecieLevel(ISpecieTest.createMock()));
		
	}
	
	
		
}
