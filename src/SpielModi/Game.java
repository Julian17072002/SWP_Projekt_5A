package SpielModi;


public class Game {
	
	private Player[] players;
	private int counter = 0;
	private int pointsBeforeThisRound;
	private int startingPoints;
	private boolean doubleIn, doubleOut;
	private int legsToPlay, currentLeg;
	
	public Game(GameParameter par) {
		counter = 0;
		
		startingPoints = pointsBeforeThisRound = par.getPoints();
		doubleIn = par.isDoubleIn();
		doubleOut = par.isDoubleOut();
		
		legsToPlay = par.getLegsToPlay();
		currentLeg = 1;
		
		players = new Player[par.getNames().length];
		
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(par.getNames() [i], pointsBeforeThisRound);
		}
			
	}
	
	public void newLeg() {
		for (Player p : players) {
			p.resetPoints();
		}
		currentLeg++;
		counter = 0;
	}

	public PlayerCounter getScoreBoardInfo() {
		return new PlayerCounter(counter, players);
	}
	
		private Player getCurrentPlayer() {
			return players[(counter + currentLeg - 1) % players.length];
		}
	
		public CalcResult calcPointsForCurrentPlayer(Result parsed) {
			Player player = getCurrentPlayer();
			
			player.addDart();
			
			int score = parsed.getActualScore();
			
			int oldPoints = player.getCurrentPoints();
			CalcResult result;
			
			if (doubleIn && oldPoints == startingPoints && parsed.getFactor() != 2) {
				result = new CalcResult(0, startingPoints, "double in");
				player.subtractPoints(0);
			} else if (oldPoints - score < 0
					|| doubleOut && oldPoints - score == 1
					|| doubleOut && oldPoints - score == 0 && parsed.getFactor() != 2) {
				result = new CalcResult(0, pointsBeforeThisRound, "busted");
				player.resetPointsToPrevPoints(pointsBeforeThisRound);
			} else {
				int remaining = player.subtractPoints(score);
				if (remaining == 0)
					currentPlayerWinLeg();
				result = new CalcResult(score, remaining, "");
			}
			
			return result;
		
	}
	public void nextPlayer() {
		counter++;
		pointsBeforeThisRound = getCurrentPlayer().getCurrentPoints();
	}
	
	public boolean isWon() {
		for (Player p : players) {
			if(p.getLegsWon() == (legsToPlay / 2 + 1))
				return true;
		}
		return false;
	}
	
	private void currentPlayerWinLeg() {
		getCurrentPlayer().increaseWonLeg();
	}

	public String getCurrentPlayerName() {
		return getCurrentPlayer().getName();
	}
	
	public String toString() {
		return players.length + " players, " + startingPoints + " points," 
					+ (doubleIn? "":" no") + " double in and" + (doubleOut? "":" no") + " double out, "
					+ "best of " + legsToPlay + " legs.";
	}



}
