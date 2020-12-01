package SpielModi;

//import SpielModi.Board;

public class Player {
	
	private final String NAME;
	private int currentPoints;
	private int startingPoints;
	private int numberOfDarts;
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
	
	public double threeDartAvg() {
		double avg = 1.0 * (startingPoints - currentPoints) / (numberOfDarts / 2) * 3;
		return avg;
	}
	
//	public double doublequote() {
//		int anzDoppel;
//		if ((startingPoints - currentPoints) <= 40 || (startingPoints - currentPoints) == 50) {
//			if(Board.factor != 2) {
//				anzDoppel++;
//			}
//		}
//			return 0;
//	}
	
	void increaseWonLeg() {
		numberOfLegsWon++;
	}
	
	public int getLegsWon() {
		return numberOfLegsWon;
	}
	
}
