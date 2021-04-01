package Test;

import Cricket.BoardCricket;
import Cricket.CricketGame;
import Cricket.Player;

import java.util.Scanner;

public class TestCricket {

	private CricketGame game;
	private Scanner sc;

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

				String input = sc.nextLine().toLowerCase().trim();

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
					
					if (score == 59 || score == 58 || score == 56 || score == 55 || score == 53 || score == 52 || score == 49 || score == 47 || score == 46 || score == 44 || score == 43 || score == 41 || score == 37 || score == 35 || score == 31 || score == 29 || score == 23) {
						System.out.println("Impossible score");
						i--;
						continue;
					}
					
					if (score == 20) {
						game.addTwForCurrentPlayer(1);
					}
					if (score == 19) {
						game.addNiForCurrentPlayer(1);
					}
					if (score == 18) {
						game.addEIForCurrentPlayer(1);
					}
					if (score == 17) {
						game.addSeForCurrentPlayer(1);
					}
					if (score == 16) {
						game.addSiForCurrentPlayer(1);
					}
					if (score == 15) {
						game.addFiForCurrentPlayer(1);
					}

					if (score == 40) {
						game.addTw2ForCurrentPlayer(2);
					}
					if (score == 38) {
						game.addNi2ForCurrentPlayer(2);
					}
					if (score == 36) {
						game.addEI2ForCurrentPlayer(2);
					}
					if (score == 34) {
						game.addSe2ForCurrentPlayer(2);
					}
					if (score == 32) {
						game.addSi2ForCurrentPlayer(2);
					}
					if (score == 30) {
						game.addFi2ForCurrentPlayer(2);
					}

					if (score == 60) {
						game.addTw3ForCurrentPlayer(3);
					}
					if (score == 57) {
						game.addNi3ForCurrentPlayer(3);
					}
					if (score == 54) {
						game.addEi3ForCurrentPlayer(3);
					}
					if (score == 51) {
						game.addSe3ForCurrentPlayer(3);
					}
					if (score == 48) {
						game.addSi3ForCurrentPlayer(3);
					}
					if (score == 45) {
						game.addFi3ForCurrentPlayer(3);
					}

					if (score == 25) {
						game.addBlForCurrentPlayer(1);
					}
					if (score == 50) {
						game.addBeForCurrentPlayer(1);
					}

					if (Player.numberOfTw == 3 && Player.numberOfNi == 3 && Player.numberOfEi == 3
							&& Player.numberOfSe == 3 && Player.numberOfSi == 3 && Player.numberOfFi == 3
							&& Player.numberOfBl == 3) {
						System.out.println("Player wins!");
						break loop;
					}
				} catch (Exception e) {
					System.out.println("Sytax Error");
					i--;
					continue;
				}
			}

			game.nextPlayer();
		} while (true);

		sc.close();
		System.out.println("Goodbye");
	}

	private void printHelp() {
		System.out.println();
		System.out.println("Enter the score you hit per Dart");
		System.out.println("You have to hit the numbers 20, 19, 18, 17, 16, 15 and the bull 3 times to win the game");
		System.out.println("Press exit to end the game");
		System.out.println();
	}

}
