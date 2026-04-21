package tdd;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	private Game gamer;

	@BeforeEach
	void setUp() {
		gamer = new Game();
	}

	@Test
	void testOneOne() {
		gamer.roll(0);
		assertEquals(0, gamer.score());
	}

	@Test
	void testONetwo() {

		for (int i = 0; i < 20; i++) {
			gamer.roll(1);
		}
		assertEquals(20, gamer.score());
	}

	@Test
	void testOneThree() {
		for (int i = 0; i < 10; i++) {
			gamer.roll(1);
		}
		for (int i = 0; i < 20; i++) {
			gamer.roll(1);
		}
		assertEquals(30, gamer.score());

	}

}
