package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.KickingMonster;

/**
 * JUnit test class for KickingMonster constructor and toString()
 * @author Allen Pierson
 * @version 02142019
 */
class KickingMonsterWhenMonsterIsCreated {

	@Test
	void testWhenKickingMonsterIsCreated() {
		KickingMonster testMonster = new KickingMonster();
		String result = testMonster.toString();
		assertEquals("A Kicking Monster with 100 health credits remaining.", result);
	}

}
