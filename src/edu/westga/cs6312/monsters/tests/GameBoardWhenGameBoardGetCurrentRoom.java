package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.GameBoard;

/**
 * A JUnit test class for GameBoard's getCurrentRoom()
 * @author Allen Pierson
 *  @version 02142019
 *
 */
class GameBoardWhenGameBoardGetCurrentRoom {

	@Test
	void testGetCurrentRoomFromNewGameBoard() {
		GameBoard testBoard = new GameBoard();
		String result = testBoard.getCurrentRoom();
		assertEquals("Room at (0)", result);
	}
	
	@Test
	void testGetCurrentRoomAfterMovingLeftThreeTimes() {
		GameBoard testBoard = new GameBoard();
		testBoard.moveLeft();
		testBoard.moveLeft();
		testBoard.moveLeft();
		String result = testBoard.getCurrentRoom();
		assertEquals("Room at (7)", result);
	}
	
	@Test
	void testGetCurrentRoomAfterMovingRightThreeTimes() {
		GameBoard testBoard = new GameBoard();
		testBoard.moveRight();
		testBoard.moveRight();
		testBoard.moveRight();
		String result = testBoard.getCurrentRoom();
		assertEquals("Room at (3)", result);
	}
	
	@Test
	void testGetCurrentRoomAfterMovingRightThenLeft() {
		GameBoard testBoard = new GameBoard();
		testBoard.moveRight();
		testBoard.moveLeft();
		String result = testBoard.getCurrentRoom();
		assertEquals("Room at (0)", result);
	}

}
