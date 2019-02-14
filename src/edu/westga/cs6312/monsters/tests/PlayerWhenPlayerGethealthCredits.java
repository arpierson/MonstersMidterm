package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.Player;

/**
 * JUnit test class for Player getHealthCredits()
 * @author Allen Pierson
 * @version02142019
 */
class PlayerWhenPlayerGethealthCredits {

	@Test
	void testGetHealthCredits() {
		Player testPlayer = new Player();
		int result = testPlayer.getHealthCredits();
		assertEquals(100, result);
	}

}
