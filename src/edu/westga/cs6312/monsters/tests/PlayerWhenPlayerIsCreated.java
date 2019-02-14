package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.Player;

/**
 * JUnit test class for Player constructor and toString()
 * @author Allen Pierson
 * @version 02132019
 */
class PlayerWhenPlayerIsCreated {

	@Test
	void testWhenPlayerIsCreated() {
		Player testPlayer = new Player();
		String result = testPlayer.toString();
		assertEquals("You have 100 health credits remaining.", result);
	}

}
