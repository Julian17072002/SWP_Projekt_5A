package SpielModi;

public class GameParameter {

	private int points = 501;
	private int legsToPlay;
	private String[] names;
	private boolean doubleIn, doubleOut;
	
	public GameParameter(int points, String[] names, boolean doubleIn, boolean doubleOut, int legsToPlay) {
		this.points = points;
		this.names = names;
		this.doubleIn = doubleIn;
		this.doubleOut = doubleOut;
		this.legsToPlay = legsToPlay;
	}
	
	public int getPoints() {
		return points;
	}

	public String[] getNames() {
		return names;
	}

	public boolean isDoubleOut() {
		return doubleOut;
	}

	public boolean isDoubleIn() {
		return doubleIn;
	}

	public int getLegsToPlay() {
		return legsToPlay;
	}
}
