package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.PunchingMonster;

/**
 * A JUnit test class for PunchingMonster's constructor and toString()
 * @author Allen Pierson
 *  @version 02142019
 *
 */
class PunchingMonsterWhenPunchingMonsterIsCreated {

	@Test
	void testWhenPunchingMonsterIsCreatedAndToString() {
		PunchingMonster testMonster = new PunchingMonster();
		String result = testMonster.toString();
		assertEquals("Punching Monster with 75 health credits", result);
	}

}
