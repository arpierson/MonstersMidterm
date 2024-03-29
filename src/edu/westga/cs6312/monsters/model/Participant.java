package edu.westga.cs6312.monsters.model;

/**
 * Abstract class that defines a game participant.
 * @author Allen Pierson
 * @version 02132019
 */
public abstract class Participant {
	private int healthCredits;
	
	/**
	 * A 1-parameter constructor that instantiates the instance variable.
	 * @param healthCredits	number of health credits a participant has
	 * Precondition:	healthCredits >= 1
	 * Postcondition:	A Participant with a number of health credits >= 1
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
	
	/**
	 * Setter method for the Participant's health credits
	 * @param newAmount new value for Participant's health credits
	 */
	public void setHealthCredits(int newAmount) {
		if (newAmount < 0) {
			this.healthCredits = 0;
		} else {
			this.healthCredits = newAmount;
		}
	}

	@Override
	public String toString() {
		return this.healthCredits + " health credits";
	}
	
	/**
	 * Abstract method that defines fighting in the game.
	 * @return	the number of health credits to be deducted from the participant being fought.
	 */
	public abstract int fight();
}
