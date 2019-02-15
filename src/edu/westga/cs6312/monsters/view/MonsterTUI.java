package edu.westga.cs6312.monsters.view;

import java.util.Scanner;

import edu.westga.cs6312.monsters.model.GameBoard;

/**
 * Defines the TUI for the AToM application
 * @author Allen Pierson
 * @version 02142019
 */
public class MonsterTUI {
	private GameBoard theBoard;
	private Scanner input;
	
	/**
	 * Constructor that instantiates the instance variables.
	 * @param theBoard	The game board to be created
	 * Precondition:	None
	 * Postcondition:	A functioning TUI for the user
	 */
	public MonsterTUI(GameBoard theBoard) {
		this.theBoard = theBoard;
		this.input = new Scanner(System.in);
	}
	
	/**
	 * Displays the TUI to the end user.
	 */
	public void run() {
		System.out.println("Welcome to \"A Tour of Monsters\"\n");
		int userInput;
		do {
			this.displayMenu();
			userInput = this.getUserNumber("Please enter your choice: ");
			System.out.println();
			
			switch (userInput) {
				case 1: this.describeRoom();
						break;
				case 2: this.describePlayer();
						break;
				case 3: this.describeGameBoard();
						break;
				case 9: break;
				default: System.out.println("Invalid choice. Please try again.\n");
			}
		} while (userInput != 9);
		System.out.println("Thank you for playing. Goodbye.");
	}
	
	private int getUserNumber(String message) {
		System.out.println(message);
		String userChoiceString = this.input.nextLine();
		int userChoice = Integer.parseInt(userChoiceString);
		return userChoice;
	}
	
	private void displayMenu() {
		System.out.println("1 - Describe room");
		System.out.println("2 - Describe player");
		System.out.println("3 - Describe game board");
		System.out.println("9 - Quit");
	}
	
	private void describeRoom() {
		System.out.println("The player is currently in " + this.theBoard.describeCurrentRoom());
	}
	
	private void describePlayer() {
		System.out.println(this.theBoard.getPlayer() + " and is located in " + this.theBoard.getCurrentRoom() + "\n");
	}
	
	private void describeGameBoard() {
		System.out.println(this.theBoard.toString());
	}
}
