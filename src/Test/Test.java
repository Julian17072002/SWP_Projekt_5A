package Test;

import java.util.Scanner;

import SpielModi.Board;
import SpielModi.CalcResult;
import SpielModi.Game;

public class Test {
	
	private Game game;
	private Scanner sc;

	public Test(Game game) {
		super();
		this.game = game;
		 sc = new Scanner(System.in);
	}
	
	public void playGame() {
		System.out.println("Game on");
		System.out.println("");
			
		loop: do {												//benennung der Schleife, damit keine endlosschleife entsteht
				System.out.println(game.getScore());
				System.out.println("Current Player: "+ game.getCurrentPlayerName());
				
				int sum = 0;
				for (int i = 1; i <=3; i++) {
					System.out.println(i + " > ");
				
					String input = sc.nextLine();
					
					if(input.equals("exit"))
						break loop;
				
					CalcResult calcRes = game.calcPointsForCurrentPlayer(Board.input(input));

					if (calcRes.isValid()) {
						sum += calcRes.getScore();
						System.out.println("\t -> "+ calcRes.getRemaining());
			
						if (calcRes.getRemaining() == 0) {
							System.out.println("Game shot and the Match");
							break loop;
					}
				}	else {
					System.out.println(calcRes.getReason()
							+ " -> " + calcRes.getRemaining() + " remaining");
					
					if (calcRes.getReason().equals("bust")) {
						sum = 0;
						break;
					}
				}
			}	
			System.out.println("Summe: " + sum);
			
			System.out.println();
			
			game.nextPlayer();
			
		} while(true);
		
//		sc.close();
		System.out.println();
		System.out.println("Finish");
	}
	
}
