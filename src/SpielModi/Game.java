package SpielModi;

public class Game {
	
	private Player[] players;
	private int counter = 0;
	private int pointsBeforeThisRound;
	private int startingPoints;
	private boolean doubleIn, doubleOut;
	
	public Game(GameParameter par) {
		counter = 0;
		
		startingPoints = pointsBeforeThisRound = par.getPoints();
		doubleIn = par.isDoubleIn();
		doubleOut = par.isDoubleOut();
		
		players = new Player[par.getNames().length];
		
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(par.getNames() [i], pointsBeforeThisRound);
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
