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

	private void jouer(int fois, int n) {
		for (int i = 0; i < fois; i++) {
			gamer.roll(n);
		}
	}

	@Test
	void testOneOne() {
		gamer.roll(0);
		assertEquals(0, gamer.score());
	}

	@Test
	void testONetwo() {

		jouer(20, 1);
		assertEquals(20, gamer.score());
	}

	@Test
	void testOneThree() {
		jouer(10, 1);
		jouer(20, 1);
		assertEquals(30, gamer.score());

	}

	@Test
	void testSpare() {
		gamer.roll(7);
		gamer.roll(3);
		gamer.roll(4);
		jouer(17, 0);
		assertEquals(18, gamer.score());

	}
}
