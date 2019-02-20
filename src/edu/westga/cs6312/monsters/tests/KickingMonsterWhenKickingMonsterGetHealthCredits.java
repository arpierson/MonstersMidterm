package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.KickingMonster;
import edu.westga.cs6312.monsters.model.Player;

/**
 * JUnit test class for KickingMonster getHealthCredits()
 * @author Allen
 *
 */
class KickingMonsterWhenKickingMonsterGetHealthCredits {

	@Test
	void testNewKickingMonsterGetHealthCredits() {
		KickingMonster testMonster = new KickingMonster();
		int result = testMonster.getHealthCredits();
		assertEquals(100, result);
	}
	
	@Test
	void testKickingMonsterGetHealthCreditsAfterSimulatedFight() {
		KickingMonster testMonster = new KickingMonster();
		Player testPlayer = new Player();
		testMonster.setHealthCredits(testPlayer.fight());
		int result = testMonster.getHealthCredits();
		assertEquals(50, result);
	}

}
