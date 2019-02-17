package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.GameBoard;

class GameBoardWhenGameBoardMovePlayerLeft {

	@Test
	void testMovingLeftOnceFromBeginning() {
		GameBoard theBoard = new GameBoard();
		theBoard.moveLeft();
		String result = theBoard.getCurrentRoom();
		assertEquals("Room at (9)", result);
	}
	
	@Test
	void testMovingLeftThreeTimesFromBeginning() {
		GameBoard theBoard = new GameBoard();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		String result = theBoard.getCurrentRoom();
		assertEquals("Room at (7)", result);
	}

	@Test
	void testMovingLeftSevenTimesFromBeginning() {
		GameBoard theBoard = new GameBoard();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		String result = theBoard.getCurrentRoom();
		assertEquals("Room at (3)", result);
	}
	
	@Test
	void testMovingLeftNineTimesFromBeginning() {
		GameBoard theBoard = new GameBoard();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		String result = theBoard.getCurrentRoom();
		assertEquals("Room at (1)", result);
	}
	
	@Test
	void testMovingLeftTenTimesFromBeginning() {
		GameBoard theBoard = new GameBoard();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		theBoard.moveLeft();
		String result = theBoard.getCurrentRoom();
		assertEquals("Room at (0)", result);
	}

}
