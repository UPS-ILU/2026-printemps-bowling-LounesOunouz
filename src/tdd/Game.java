package tdd;

public class Game {
	private int QuilleBattues;

	public void roll(int nbQuilles) {
		this.QuilleBattues += nbQuilles;

	}

	public int score() {

		return this.QuilleBattues;
	}

}
