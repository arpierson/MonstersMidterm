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

}
