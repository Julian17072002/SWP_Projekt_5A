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
		StringBuilder sb = new StringBuilder("Round: "+(counter / 2 + 1) + "\n");
		
		for (Player p : players) {
			sb.append(p.getName() + ": ");
			sb.append(p.getCurrentPoints() + " points");
			sb.append("," + p.getNumberOfDarts() + " thrown Darts");
			sb.append("\n");
		}
		
		return sb.toString();
	}

	public int subtractPointsForCurrentPlayer(int score) {
		Player player = players[counter % players.length];
		
		player.addDart();
		int points = player.subtractPoints(score);
		
		if(points < 0) {
			player.resetPoints(prevPoints);
			points = player.getCurrentPoints() * (-1);
		}	
		return points;
	}
	
	public void nextPlayer() {
		counter++;
		prevPoints = players[counter % players.length].getCurrentPoints();
	}
	
	public String getCurrentPlayerName() {
		return players[counter % players.length].getName();
	}
}
