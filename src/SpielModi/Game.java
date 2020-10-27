package SpielModi;

public class Game {
	
	private Player[] players;
	private int counter = 0;
	private int prevPoints;
	
	public Game(int points, int numberOfPlayers) {
		players = new Player[numberOfPlayers];
		prevPoints = points;
		
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
		int points = players[counter % players.length].subtractPoints(score);
		if(points < 0) {
			players[counter % players.length].resetPoints(prevPoints);
			points = players[counter % players.length].getCurrentPoints() * (-1);
		}	
		return players[counter % players.length].getCurrentPoints();
	}
	
	public void nextPlayer() {
		counter++;
		prevPoints = players[counter % players.length].getCurrentPoints();
	}
	
	public String getCurrentPlayerName() {
		return players[counter % players.length].getName();
	}
}
