package edu.westga.cs6312.monsters.model;

/**
 * A class that defines a Room object in the game.
 * @author Allen Pierson
 * @version 02132019
 */
public class Room {
	private Participant monster;
	private int roomNumber;
	
	/**
	 * 1-parameter constructor that instantiates the instance variables.
	 * @param roomNumber The identifying number for the Room.
	 */
	public Room(int roomNumber) {
		if (this.roomNumber < 0 || this.roomNumber > 9) {
			throw new IllegalArgumentException("Invalid room number.");
		}
		this.roomNumber = roomNumber;
		this.setupRoom();
	}
	
	/**
	 * Returns a String description of the current Room number.
	 * @return a String description of the current Room number.
	 */
	public String getLocation() {
		return "Room at (" + this.roomNumber + ")";
	}
	
	/**
	 * Returns  the current monster.
	 * @return	Returns the current monster.
	 */
	public Participant getMonster() {
		return this.monster;
	}
	
	@Override
	public String toString() {
		String roomString;
		if (this.monster != null) {
			roomString = this.getLocation() + " with " + this.monster.toString();
		} else {
			roomString = this.getLocation() + " with no Monster inside";
		}
		return roomString;
	}

	private void setupRoom() {
		int getsMonster = ((int) (Math.random() * 2));
		if (getsMonster == 1) {
			this.monster = this.createMonster();
		} else {
			this.monster = null;
		}
	}
	
	private Participant createMonster() {
		int whichMonster = ((int) (Math.random() * 2));
		Participant theMonster = null;
		
		if (whichMonster == 1) {
			theMonster = new KickingMonster();
		} else {
			theMonster = new PunchingMonster();
		}
		
		return theMonster;
	}
}
