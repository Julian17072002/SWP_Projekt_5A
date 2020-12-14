package Test;

import java.util.Scanner;

import SpielModi.Board;
import SpielModi.CalcResult;
import SpielModi.Game;
import SpielModi.Player;
import SpielModi.Result;
import java.sql.Connection;

import dbmodle.DBManager;
import dbmodle.Score;
import dbmodle.average;
import SpielModi.PlayerCounter;

public class Test {

	private Game game;
	private Scanner sc;
	private static double sum;
	
	public Test(Game game) {
		super();
		this.game = game;
		 sc = new Scanner(System.in);
	}
	
	public void playGame() {
		System.out.println("Game on");
		System.out.println("Type exit to leave or help for other informations");
		System.out.println("");
	}
	
	public void playLeg() throws Exception {
		
			loop: do {
					System.out.println();
					System.out.println(generateScoreboard(game.getScoreBoardInfo()));
					System.out.println("Current Player: " + game.getCurrentPlayerName());
					
					int sum = 0;
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
						
						Result result = Board.input(input);
						if (!result.isSuccParsed()) {
							i--;
							System.out.println("Incorrect Input!");
							continue;
					}
						
					CalcResult calcRes = game.calcPointsForCurrentPlayer(result);
					
					if (calcRes.isValid()) {
						sum += calcRes.getScore();
						System.out.println("\t -> "+ calcRes.getRemaining());
		
					
						
					if (calcRes.getRemaining() == 0) {
						System.out.println("Wie viele Darts hatten sie aufs Doppel: ");
						System.out.println("Summe: " + sum);
						System.out.println("Average: " + Player.threeDartAvg());
						System.out.println("Doppelquote: " + Player.doublequote());
						DBManager db = new DBManager();
						Connection con = DBManager.getConnection();
						System.out.println("connect");
						Score s = new Score(sum);
						average a = new average(Player.threeDartAvg());
						
						db.speichereNeuenEintrag(con, s, a);
						
						System.out.println("Game shot and the Leg");
						System.out.println();
						break loop;
					}
					
					} else {
						System.out.println(calcRes.getReason() + " -> " + calcRes.getRemaining() + " remaining");

						if(calcRes.getReason().equals("busted")) {
							sum = 0;
						break;
					}
				}
			}	
			System.out.println("Summe: " + sum);
			
			DBManager db = new DBManager();
			Connection con = DBManager.getConnection();
			System.out.println("connect");
			Score s = new Score(sum);
			average a = new average(Player.threeDartAvg());
			
			db.speichereNeuenEintrag(con, s, a);
			
			System.out.println();
			
			game.nextPlayer();
			
		} while(true);
	}
	
	public static double getSum() {
		return sum;
	}
	
	private void printHelp() {
		System.out.println();
		System.out.println("Enter the score you scored for every dart");
		System.out.println("Type 'exit' to leave program");
		System.out.println();
	}
	
	private String generateScoreboard(PlayerCounter score) {
		StringBuilder sb = new StringBuilder("Round: "+((score.getPlayerCounter() / score.getPlayers().length + 1) + "\n"));
				
		for (Player p : score.getPlayers()) {
			sb.append(p.getName() + ": ");
			sb.append(p.getCurrentPoints() + " points");
			sb.append("| " + p.getNumberOfDarts() + " thrown Darts");
			sb.append("| Legs Won" + p.getLegsWon());
			sb.append("| Average: " + p.threeDartAvg());
			sb.append("| Doppelquote " + p.doublequote());
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public boolean playAgain(boolean isWon) {
		if (isWon)
			System.out.println("Game shot and the Match");
			System.out.println();
			System.out.println("Do you want to play another match? (y/n): ");
			return sc.nextLine().toLowerCase().equals("y");
	
	}
	
//	public static void main(String[] args){
//
//	}
	
}
