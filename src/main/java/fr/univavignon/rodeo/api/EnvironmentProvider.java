package fr.univavignon.rodeo.api;

import java.util.List;

public class EnvironmentProvider {

	/**
	 * Retrieves and returns the list of available
	 * environments name.
	 * 
	 * @return A list of environment name.
	 */
	List<String> getAvailableEnvironments() {
		
		
		
		
	}

	/**
	 * Retrieves and returns the environment
	 * denoted by the given <tt>name</tt>.
	 * 
	 * @param name Name of the environment to retrieve.
	 * @return Required environment if available, <tt>null</tt> otherwise.
	 * @throws IllegalArgumentException If the given <tt>name</tt> is null.
	 */
	IEnvironment getEnvironment(String name) throws IllegalArgumentException;

	
	
}
