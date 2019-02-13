package edu.westga.cs6312.monsters.model;

/**
 * Abstract class that defines a game participant.
 * @author Allen Pierson
 *@version 02132019
 */
public abstract class Participant {
	private int healthCredits;
	
	/**
	 * A 1-parameter constructor that instantiates the instance variable.
	 * @param healthCredits	number of health credits a participant has
	 */
	public Participant(int healthCredits) {
		if (healthCredits < 1) {
			throw new IllegalArgumentException("Invalid number of health credits.");
		}
		this.healthCredits = healthCredits;
	}
	
	/**
	 * Getter method for the Participant's current number of health credits
	 * @return	number of current health credits
	 */
	public int getHealthCredits() {
		return this.healthCredits;
	}

	@Override
	public String toString() {
		return this.healthCredits + " remaining.";
	}
	
	/**
	 * Abstract method that defines fighting in the game.
	 * @return	the number of health credits to be deducted from the participant being fought.
	 */
	public abstract int fight();
}
