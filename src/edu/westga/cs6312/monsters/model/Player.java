package edu.westga.cs6312.monsters.model;

/**
 * Child class of Participant that defines a Player in the game.
 * @author Allen Pierson
 * @version 02132019
 */
public class Player extends Participant {
	
	/**
	 * 0-parameter constructor that instantiates a Player object.
	 */
	public Player() {
		super(100);
	}

	@Override
	public String toString() {
		return "You have " + super.toString();
	}

	@Override
	public int fight() {
		return 50;
	}

}
