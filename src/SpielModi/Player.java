package SpielModi;

public class Player {
	
	private final String NAME;
	private int currentPoints;
	
	public Player(String name, int points) {
		NAME = name;
		currentPoints = points;
		
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
		currentPoints -= score;
		return currentPoints;
		
	}

	public void resetPoints(int prevPoints) {
		currentPoints = prevPoints;
		
	}
	
}
