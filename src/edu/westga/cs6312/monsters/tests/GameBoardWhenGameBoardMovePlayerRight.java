package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.GameBoard;

/**
 * A JUnit test class for GameBoard's moveRight()
 * @author Allen Pierson
 *  @version 02142019
 *
 */
class GameBoardWhenGameBoardMovePlayerRight {

	@Test
	void testMovingRightOnceFromBeginning() {
		GameBoard theBoard = new GameBoard();
		theBoard.moveRight();
		String result = theBoard.getCurrentRoom();
		assertEquals("Room at (1)", result);
	}
	
	@Test
	void testMovingRightThreeTimesFromBeginning() {
		GameBoard theBoard = new GameBoard();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		String result = theBoard.getCurrentRoom();
		assertEquals("Room at (3)", result);
	}

	@Test
	void testMovingRightSevenTimesFromBeginning() {
		GameBoard theBoard = new GameBoard();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		String result = theBoard.getCurrentRoom();
		assertEquals("Room at (7)", result);
	}
	
	@Test
	void testMovingRightNineTimesFromBeginning() {
		GameBoard theBoard = new GameBoard();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		String result = theBoard.getCurrentRoom();
		assertEquals("Room at (9)", result);
	}
	
	@Test
	void testMovingRightTenTimesFromBeginning() {
		GameBoard theBoard = new GameBoard();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		theBoard.moveRight();
		String result = theBoard.getCurrentRoom();
		assertEquals("Room at (0)", result);
	}
}
