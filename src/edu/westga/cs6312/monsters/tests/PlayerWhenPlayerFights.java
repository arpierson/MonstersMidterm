package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.Player;

class PlayerWhenPlayerFights {

	@Test
	void testFight() {
		Player testPlayer = new Player();
		int result = testPlayer.fight();
		assertEquals(50, result);
	}

}
