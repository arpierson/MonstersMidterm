package edu.westga.cs6312.monsters.model;

/**
 * A class that creates a GameBoard to keep track of gameplay.
 * @author Allen Pierson
 * @version 02132019
 */
public class GameBoard {
	private Room[] theMap;
	private Player thePlayer; 
	private int currentRoom;
	
	/**
	 * Constructor that instantiates the instance variables
	 */
	public GameBoard() {
		this.setupBoard();
	}
	
	private void setupBoard() {
		this.thePlayer = new Player();
		this.theMap = new Room[10];
		for (int current = 0; current < this.theMap.length; current++) {
			this.theMap[current] = new Room(current);
		}
		this.currentRoom = 0;
	}
	
	/**
	 * Getter method for the current Player
	 * @return the current Player object
	 */
	public String getPlayer() {
		return this.thePlayer.toString();
	}
	
	/**
	 * Getter method for the current room number
	 * @return A String description of the current room location
	 */
	public String getCurrentRoom() {
		return this.theMap[this.currentRoom].getLocation();
	}
	
	/**
	 * Returns the String description of the current room the Player is in.
	 * @return the String description of the current room the Player is in.
	 */
	public String describeCurrentRoom() {
		return this.theMap[this.currentRoom].toString() + "\n";
	}
	
	/**
	 * Moves the Player one Room to the right
	 */
	public void moveRight() {
		if (this.currentRoom == 9) {
			this.currentRoom = 0;
		} else {
			this.currentRoom++;
		}
	}
	
	/**
	 * Moves the Player one Room to the left
	 */
	public void moveLeft() {
		if (this.currentRoom == 0) {
			this.currentRoom = 9;
		} else {
			this.currentRoom--;
		}
	}

	@Override
	public String toString() {
		int tempCurrentRoom = this.currentRoom;
		String mapDescription = "";
		for (int current = 0; current < this.theMap.length; current++) {
			mapDescription += this.describeCurrentRoom();
			this.currentRoom++;
		}
		this.currentRoom = tempCurrentRoom;
		return mapDescription + "\n" + this.getPlayer() + " and is located at " + this.describeCurrentRoom() + "\n";
	}
}
