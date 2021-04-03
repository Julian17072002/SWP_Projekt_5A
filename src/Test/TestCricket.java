package Test;

import Cricket.BoardCricket;
import Cricket.CricketGame;
import Cricket.Player;

import java.util.Scanner;

public class TestCricket {

	private CricketGame game;
	private Scanner sc;
	Player p = new Player(null, 0, 0, 0, 0, 0, 0, 0);

	public TestCricket(CricketGame game) {
		super();
		this.game = game;
		sc = new Scanner(System.in);
	}

	public void playGame() {

		loop: do {
			System.out.println();
			System.out.println(game.generateScoreboard());
			System.out.println("Current Player: " + game.getCurrentPlayerName());

			for (int i = 1; i <= 3; i++) {
				System.out.println(i + " > ");

				String input = sc.nextLine();

				if (input.equals("exit"))
					break loop;

				else if (input.equals("help")) {
					printHelp();
					i--;
					continue;
				}

				try {

					int score = BoardCricket.input(input);

					if (score > 60) {
						System.out.println("Out of Range");
						i--;
						continue;
					}

					if (score == 59 || score == 58 || score == 56 || score == 55 || score == 53 || score == 52
							|| score == 49 || score == 47 || score == 46 || score == 44 || score == 43 || score == 41
							|| score == 37 || score == 35 || score == 31 || score == 29 || score == 23) {
						System.out.println("Impossible score");
						i--;
						continue;
					}

					if (score == 20) {
						game.addTwForCurrentPlayer(score);
					}
					if (score == 19) {
						game.addNiForCurrentPlayer(score);
					}
					if (score == 18) {
						game.addEIForCurrentPlayer(score);
					}
					if (score == 17) {
						game.addSeForCurrentPlayer(score);
					}
					if (score == 16) {
						game.addSiForCurrentPlayer(score);
					}
					if (score == 15) {
						game.addFiForCurrentPlayer(score);
					}

					if (score == 40) {
						game.addTw2ForCurrentPlayer(score);
					}
					if (score == 38) {
						game.addNi2ForCurrentPlayer(score);
					}
					if (score == 36) {
						game.addEI2ForCurrentPlayer(score);
					}
					if (score == 34) {
						game.addSe2ForCurrentPlayer(score);
					}
					if (score == 32) {
						game.addSi2ForCurrentPlayer(score);
					}
					if (score == 30) {
						game.addFi2ForCurrentPlayer(score);
					}

					if (score == 60) {
						game.addTw3ForCurrentPlayer(score);
					}
					if (score == 57) {
						game.addNi3ForCurrentPlayer(score);
					}
					if (score == 54) {
						game.addEi3ForCurrentPlayer(score);
					}
					if (score == 51) {
						game.addSe3ForCurrentPlayer(score);
					}
					if (score == 48) {
						game.addSi3ForCurrentPlayer(score);
					}
					if (score == 45) {
						game.addFi3ForCurrentPlayer(score);
					}

					if (score == 25) {
						game.addBlForCurrentPlayer(score);
					}
					if (score == 50) {
						game.addBeForCurrentPlayer(score);
					}

				} catch (Exception e) {
					System.out.println("Sytax Error");
					i--;
					continue;
				}

			}

			System.out.println();
			game.nextPlayer();

		} while (true);

		sc.close();
		System.out.println("Goodbye");
	}

	public void Win() {
		if (p.getTw() == 3 && p.getNi() == 3 && p.getEi() == 3
				&& p.getSe() == 3 && p.getSi() == 3 && p.getFi() == 3
				&& p.getBl() == 3) {

			System.out.println("Player wins!");
			
		}
	}
	
	private void printHelp() {
		System.out.println();
		System.out.println("Enter the score you hit per Dart");
		System.out.println("You have to hit the numbers 20, 19, 18, 17, 16, 15 and the bull 3 times to win the game");
		System.out.println("Press exit to end the game");
		System.out.println();
	}

}
