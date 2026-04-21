package tdd;

public class Game {
	private int QuilleBattues;
	private int tour;

	public void roll(int nbQuilles) {
		if (tour == 2 && this.QuilleBattues >= 10) {
			this.QuilleBattues += nbQuilles * 2;
			this.tour = 0;
		} else {
			this.QuilleBattues += nbQuilles;
			this.tour++;
		}

	}

	public int score() {

		return this.QuilleBattues;
	}

}
