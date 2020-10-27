package Test;

import java.util.Scanner;

import SpielModi.Board;
import SpielModi.Game;

public class Test {
	
	private Game game;
	private Scanner sc;

	public Test(Game game) {
		super();
		this.game = game;
		 sc = new Scanner(System.in);
		
		System.out.println("Hello Players");
	}
	
	public void playGame() {
		System.out.println("Game on");
		System.out.println("");
			
		loop: do {												//benennung der Schleife, damit keine endlosschleife entsteht
				System.out.println(game.getScore());
				System.out.println("Current Player: "+ game.getCurrentPlayerName());
				
				for (int i = 1; i <=3; i++) {
				System.out.println("> ");
				
				String input = sc.nextLine().toLowerCase().trim();
				
				if(input.equals("exit"))
					break loop;
				
				int score = Board.parseInput(input);
				score = game.subtractPointsForCurrentPlayer(score);
				System.out.println("\t -> "+Math.abs(score));
				
				if (score == 0) {
					System.out.println("Game shot an the Match");
					break loop;
				} else if (score < 0) {
					System.out.println("No Score");
					break;
				}
			}
			System.out.println();
			
			game.nextPlayer();
			
		} while(true);
		
		sc.close();
		System.out.println();
		System.out.println("Finish");
	}
	
}
