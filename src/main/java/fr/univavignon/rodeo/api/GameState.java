package fr.univavignon.rodeo.api;

import java.util.List;

/**
 * This interface represents a game state.
 * Aims to be instantiated by an {@link IGameStateProvider}.
 * 
 * @author fv
 */
public class GameState implements IGameState {

	public String name;
	
	public Environment currentEnvironment;
	
	public List<Environment> roadedEnvironement;
		
	public GameState(String name) {
		
		this.name = name;
	}
	
	
	/**
	 * Unlock a new area / environment. Ensures that all animals
	 * of the current area are unlocked and that there is a new
	 * area to explore, throwing an IllegalStateException otherwise.
	 * 
	 * @throws IllegalStateException If the area cannot be explored.
	 */
	public void exploreArea() throws IllegalStateException {
		
		if(this.currentEnvironment.animalsList.size() == 0) {
			
			if(this.roadedEnvironement.size() == new EnvironmentProvider().getAvailableEnvironments().size()) {
				
				throw new IllegalStateException();
				
			} else {
				
				this.roadedEnvironement.add(this.currentEnvironment);
				
				this.currentEnvironment = new EnvironmentProvider().getEnvironment(
						new EnvironmentProvider().getAvailableEnvironments().get(
								this.roadedEnvironement.size()));
						
				
			}
			
		}
		
	}

	/**
	 * Sets the given <tt>animal</tt> as caught.
	 * 
	 * @param animal Animal to caught.
	 * @throws IllegalArgumentException If the given <tt>animal</tt> is <tt>null</tt>.
	 * @throws IllegalStateException If the given <tt>animal</tt> can not be found in current areas.
	 */
	public void catchAnimal(IAnimal animal) throws IllegalArgumentException, IllegalStateException {

		boolean trouve = false;
		
		if(animal != null) {
		
			for(Animal animal2 : this.currentEnvironment.animalsList) {
			
				if(animal2.getName().equals(animal.getName())) {
					
					animal2.setCaughted(true);
					trouve = true;
				}
				
			}
			
			if(!trouve) throw new IllegalArgumentException();
			
		this.currentEnvironment.animalsList.remove(animal);	
		} else throw new IllegalStateException();
		
	}

	/**
	 * Retrieves the level of the given specie.
	 * 
	 * @param specie Specie to get level for.
	 * @return Current specie level.
	 * @throws IllegalArgumentException If the given <tt>specie</tt> is <tt>null</tt>
	 */
	public SpecieLevel getSpecieLevel(ISpecie specie) throws IllegalArgumentException {
		
		if(specie != null) {
			
			return specie.getSpecieLevel();
			
		} else throw new IllegalArgumentException();
		
	}

	/**
	 * Computes and returns the game progression percentage.
	 * 
	 * @return The total game progression in percent.
	 */
	public int getProgression() {
		
		return ((int)
				(this.roadedEnvironement.size() 
						/ new EnvironmentProvider().getAvailableEnvironments().size()
						)*100);
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
