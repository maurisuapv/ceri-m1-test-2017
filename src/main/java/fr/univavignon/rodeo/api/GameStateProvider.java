package fr.univavignon.rodeo.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GameStateProvider implements IGameStateProvider {

	public GameStateProvider() {
		
	}

	public void save(IGameState gameState) {

		List<IGameState> gamesList = new ArrayList<IGameState>();

		File save = new File("savedGames.txt");
		
		
		
		try {

			if(save.exists()) {
				
			FileInputStream fi = new FileInputStream(save);
			ObjectInputStream oi = new ObjectInputStream(fi);

			gamesList = (List<IGameState>) oi.readObject();

			System.out.println(gamesList.toString());

			oi.close();
			fi.close();
			
			}
			
			gamesList.add(gameState);
			
			FileOutputStream f = new FileOutputStream(new File("savedGames.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			o.writeObject(gamesList);

			o.close();
			f.close();

			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}

	
	public IGameState get(String name) throws IllegalArgumentException {
	

		if(name != null) {
			
		
		
		List<IGameState> gamesList = new ArrayList<IGameState>();

		File save = new File("savedGames.txt");

		try {

			if(save.exists()) {
				
			FileInputStream fi = new FileInputStream(save);
			ObjectInputStream oi = new ObjectInputStream(fi);

			gamesList = (List<IGameState>) oi.readObject();

			System.out.println(gamesList.toString());

			oi.close();
			fi.close();
			
			}
						
			FileOutputStream f = new FileOutputStream(new File("savedGames.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			o.writeObject(gamesList);

			o.close();
			f.close();

			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(IGameState iGameState : gamesList) {
			
			if(iGameState.getName().equals(name)) {
				return iGameState;
			}
			
		}
		
			return new GameState(name);
		
		} else throw new IllegalArgumentException();
		
	}
			
		
	
}
