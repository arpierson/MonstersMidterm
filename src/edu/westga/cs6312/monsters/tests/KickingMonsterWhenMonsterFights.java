package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.KickingMonster;

/**
 * JUnit test class for KickingMonster fight()
 * @author Allen Pierson
 * @version 02142019
 */
class KickingMonsterWhenMonsterFights {

	@Test
	void testFight() {
		KickingMonster testMonster = new KickingMonster();
		int result = testMonster.fight();
		assertEquals(30, result);
	}

}
