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
	
		public CalcResult calcPointsForCurrentPlayer(Result parsed) {
			Player player = players[counter % players.length];
			
			player.addDart();
			
			int score = parsed.getActualScore();
			
			int oldPoints = player.getCurrentPoints();
			CalcResult result;
			
			if (doubleIn && oldPoints == startingPoints && parsed.getFactor() != 2)
				result = new CalcResult(0, startingPoints, "double in");
			else if (oldPoints - score < 0
					|| doubleOut && oldPoints - score == 1
					|| doubleOut && oldPoints - score == 0 && parsed.getFactor() != 2) {
				result = new CalcResult(0, pointsBeforeThisRound, "busted");
				player.resetPointsToPrevPoints(pointsBeforeThisRound);
			} else {
				int remaining = player.subtractPoints(score);
				result = new CalcResult(score, remaining, "");
			}
			
			return result;
		
	}
	public void nextPlayer() {
		counter++;

		pointsBeforeThisRound = players[counter % players.length].getCurrentPoints();
	}
	
	public String getCurrentPlayerName() {
		return players[counter % players.length].getName();
	}



}
