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
			
		loop: do {
				System.out.println(game.getScore());
				System.out.println("Current Player: "+ game.getCurrentPlayerName());
				
				for (int i = 1; i <=3; i++) {
				System.out.println("> ");
				
				String input = sc.nextLine().toLowerCase().trim();
				
				if(input.equals("exit"))
					break loop;
				
				int score = Board.parseInput(input);
				score = game.subtractPointsForCurrentPlayer(score);
				System.out.println("\t -> "+score);
			}
			System.out.println();
			
			game.nextPlayer();
			
		} while(true);
		
		sc.close();
		System.out.println("Finish");
	}
	
}
