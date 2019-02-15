package edu.westga.cs6312.monsters.controller;

import edu.westga.cs6312.monsters.model.GameBoard;
import edu.westga.cs6312.monsters.view.MonsterTUI;

/**
 * Class that provides call to run application.
 * @author Allen Pierson
 * @version 02142019
 *
 */
public class MonsterDriver {

	/**
	 * This method is the entry point of the application
	 *
	 * @param args Command-line arguments, not used
	 */ 
	public static void main(String[] args) {
		GameBoard theBoard = new GameBoard();
		MonsterTUI monsterGame = new MonsterTUI(theBoard);
		
		monsterGame.run();
	}

}
