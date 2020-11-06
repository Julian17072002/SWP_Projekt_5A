package SpielModi;

import Test.Test;

public class DartsMain {

	public static void main(String[] args) {
		GameParameter par = new Parameter().enterGameParameter();
		Game game = new Game(par);
		Test t = new Test(game);

		t.playGame();
		
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
