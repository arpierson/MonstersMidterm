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
		int currentPlayerHealthCredits;
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
				case 4: this.move();
						break;
				case 5: this.fight();
						break;
				case 9: System.out.println("Thank you for playing. Goodbye.");
						break;
				default: System.out.println("Invalid choice. Please try again.\n");
			}
			
			currentPlayerHealthCredits = this.theBoard.getPlayer().getHealthCredits();
		} while (userInput != 9 && currentPlayerHealthCredits != 0);
		this.endGameMessage();
	}
	
	private int getUserNumber(String message) {
		System.out.print(message);
		String userChoiceString = this.input.nextLine();
		int userChoice = Integer.parseInt(userChoiceString);
		return userChoice;
	}
	
	private void displayMenu() {
		System.out.println("\t1 - Describe room");
		System.out.println("\t2 - Describe player");
		System.out.println("\t3 - Describe game board");
		System.out.println("\t4 - Move");
		System.out.println("\t5 - Fight");
		System.out.println("\t9 - Quit");
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
	
	private void move() {
		int userInput = this.getUserNumber("1 - Left\n2 - Right\nEnter the direction you would like to move: ");
		if (userInput == 1) {
			this.theBoard.moveLeft();
			this.describeRoom();
		} else if (userInput == 2) {
			this.theBoard.moveRight();
			this.describeRoom();
		} else {
			System.out.println("Invalid direction number. Returning to main menu.\n");
		}
	}

	private void fight() {
		if (this.theBoard.getCurrentRoomMonster() == null) {
			System.out.println("There is no monster to fight.\n");
		} else if (this.theBoard.getCurrentRoomMonster().getHealthCredits() == 0) {
			System.out.println("The monster has already been defeated.\n");
		} else {
			this.theBoard.fight();
			System.out.println("The monster now has: " + this.theBoard.getCurrentRoomMonster().getHealthCredits() + " health credits remaining.");
			System.out.println("The player now has: " + this.theBoard.getPlayer().getHealthCredits() + " health credits remaining.\n");
		}
	}
	
	private void endGameMessage() {
		System.out.println("The player ended the game with " + this.theBoard.getPlayer().getHealthCredits() + " health credits remaining.");
	}
}
