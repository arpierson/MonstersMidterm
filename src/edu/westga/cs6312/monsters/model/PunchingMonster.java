package edu.westga.cs6312.monsters.model;

/**
 * Child class of Participant that defines a Punching Monster in the game.
 * @author Allen Pierson
 * @version 02132019
 */
public class PunchingMonster extends Participant {
	
	/**
	 * 0-parameter constructor that instantiates a PunchingMonster object.
	 */
	public PunchingMonster() {
		super(75);
	}
	
	@Override
	public String toString() {
		return "Punching Monster with " + super.toString();
	}

	@Override
	public int fight() {
		int damage = (int) (Math.random() * 50);
		return damage;
	}

}
