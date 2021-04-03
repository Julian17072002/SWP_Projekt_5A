package Cricket;

import Test.TestCricket;

public class CricketMain {

	public static void main(String[] args) {

		CricketGame game = new CricketGame(1, 3, 3, 3, 3, 3, 3, 3);

		TestCricket tc = new TestCricket(game);

//		System.out.println(game.generateScoreboard());
		tc.playGame();
		
		
	}

}
