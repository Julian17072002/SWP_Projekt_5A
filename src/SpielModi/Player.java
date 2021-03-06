package SpielModi;

//import SpielModi.Board;

public class Player {
	
	private final String NAME;
	private static int currentPoints;
	private static int startingPoints;
	private static int numberOfDarts;
	private int numberOfLegsWon;
	
	public Player(String name, int points) {
		NAME = name;
		startingPoints = currentPoints = points;
		numberOfDarts = 0;
		numberOfLegsWon = 0;
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return NAME;
	}

	public int getCurrentPoints() {
		// TODO Auto-generated method stub
		return currentPoints;
	}

	public int subtractPoints(int score) {
		numberOfDarts++;
		currentPoints -= score;
		return currentPoints;
		
	}
	
	void addDart() {
		numberOfDarts++;
	}
	
	public int getNumberOfDarts() {
		return numberOfDarts / 2;
	}

	public void resetPointsToPrevPoints(int pointsBeforeThisRound) {
		currentPoints = pointsBeforeThisRound;	
	}
	
	public void resetPoints() {
		currentPoints = startingPoints;
		numberOfDarts = 0;
	}
	
	public static double threeDartAvg() {
		double avg = 1.0 * (startingPoints - currentPoints) / (numberOfDarts / 2) * 3;
		return avg;
	}
	
	void increaseWonLeg() {
		numberOfLegsWon++;
	}
	
	public int getLegsWon() {
		return numberOfLegsWon;
	}
	
}
