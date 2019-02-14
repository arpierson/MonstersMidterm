package edu.westga.cs6312.monsters.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.monsters.model.Room;

/**
 * JUnit test class for Room getLocation()
 * @author Allen Pierson
 * @version 02142019
 */
class RoomWhenRoomGetLocation {

	@Test
	void testRoomGetLocationWhenLocationIs0() {
		Room testRoom = new Room(0);
		String result = testRoom.getLocation();
		assertEquals("Room at (0)", result);
	}
	
	@Test
	void testRoomGetLocationWhenLocationIs9() {
		Room testRoom = new Room(9);
		String result = testRoom.getLocation();
		assertEquals("Room at (9)", result);
	}
}
