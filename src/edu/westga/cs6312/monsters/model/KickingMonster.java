package edu.westga.cs6312.monsters.model;

/**
 * Child class of Participant that defines a Kicking Monster in the game.
 * @author Allen Pierson
 * @version 02132019
 */
public class KickingMonster extends Participant {
	
	/**
	 * 0-parameter constructor that instantiates a KickingMonster object.
	 */
	public KickingMonster() {
		super(100);
	}

	@Override
	public String toString() {
		return "a Kicking Monster with " + super.toString();
	}

	@Override
	public int fight() {
		return 30;
	}

}
