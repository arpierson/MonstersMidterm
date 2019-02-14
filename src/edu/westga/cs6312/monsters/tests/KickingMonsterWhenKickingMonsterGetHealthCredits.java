package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.KickingMonster;

/**
 * JUnit test class for KickingMonster getHealthCredits()
 * @author Allen
 *
 */
class KickingMonsterWhenKickingMonsterGetHealthCredits {

	@Test
	void testGetHealthCredits() {
		KickingMonster testMonster = new KickingMonster();
		int result = testMonster.getHealthCredits();
		assertEquals(100, result);
	}

}
