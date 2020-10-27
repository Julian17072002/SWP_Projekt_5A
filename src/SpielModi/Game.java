package SpielModi;

public class Game {
	
	private Player[] players;
	private int counter = 0;
	
	public Game(int points, int numberOfPlayers) {
		players = new Player[numberOfPlayers];
		
		for (int i = 0; i < numberOfPlayers; i++) {
			players[i] = new Player("Player "+ (i + 1), points);
		}
			
	}
	
	public String getScore() {
		StringBuilder sb = new StringBuilder();
		
		for (Player p : players) {
			sb.append(p.getName() + ": ");
			sb.append(p.getCurrentPoints() + " points");
			sb.append("\n");
		}
		
		return sb.toString();
	}

	public int subtractPointsForCurrentPlayer(int score) {
		return players[counter % players.length].subtractPoints(score);
		
	}
	
	public void nextPlayer() {
		counter++;
	}
	
	public String getCurrentPlayerName() {
		return players[counter % players.length].getName();

	}
}
