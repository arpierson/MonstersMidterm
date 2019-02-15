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
	 * Returns a String description of the current monster.
	 * @return	Returns a String description of the current Room number.
	 */
	public String getMonster() {
		return this.monster.toString();
	}
	
	@Override
	public String toString() {
		String roomString;
		if (this.monster != null) {
			roomString = "The player is currently in " + this.getLocation() + " with " + this.monster.toString();
		} else {
			roomString = "The player is currently in " + this.getLocation() + " with no Monster inside.";
		}
		return roomString;
	}

	private void setupRoom() {
		int getsMonster = (int) (Math.random() * (2 - 1)) + 1;
		if (getsMonster == 2) {
			this.createMonster();
		} else {
			this.monster = null;
		}
	}
	
	private Participant createMonster() {
		return new KickingMonster();
	}
}
