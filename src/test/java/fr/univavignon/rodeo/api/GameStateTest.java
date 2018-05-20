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

public class GameStateTest {

	@Test

	public void testGetAndSave() {
		

		GameState gameState = new GameState("Test");
		
		new GameStateProvider().save(gameState);
		
		assertEquals(new GameStateProvider().get("Test").getName(),gameState.getName());
	}
	

}
