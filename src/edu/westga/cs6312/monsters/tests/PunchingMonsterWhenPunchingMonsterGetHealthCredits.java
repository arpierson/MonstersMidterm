package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.PunchingMonster;

/**
 * A JUnit test class for PunchingMonster's getHealthCredits()
 * @author Allen Pierson
 *  @version 02142019
 *
 */
class PunchingMonsterWhenPunchingMonsterGetHealthCredits {

	@Test
	void test() {
		PunchingMonster testMonster = new PunchingMonster();
		int result = testMonster.getHealthCredits();
		assertEquals(75, result);
	}

}
