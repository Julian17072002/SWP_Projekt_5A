package SpielModi;

import Test.Test;

public class DartsMain {

	public static void main(String[] args) {		
		Game game;
		Test t;
		
		do {
			GameParameter par = new Parameter().enterGameParameter();
			game = new Game(par);
			t = new Test(game);
			
			do {
				t.playLeg();
				game.newLeg();
			} while (!game.isWon());
			
		} while (t.playAgain(game.isWon()));
		
		System.out.println("Goodbye");
		
		Parameter.sc.close();
		
		
//		Cricket c = new Cricket();
//		c.output();
//		
//		Doppel_Training dt = new Doppel_Training();
//		dt.output();
//		
//		Single_Training st = new Single_Training();
//		st.output();                   
//		
//		Around_the_Clock atc = new Around_the_Clock();
//		atc.output();
//		
//		S_I_II_I I2I = new S_I_II_I();
//		I2I.output();

	}


}
