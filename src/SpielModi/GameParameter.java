package SpielModi;

public class GameParameter {

	private int points = 501;
	private String[] names;
	private boolean doubleIn, doubleOut;
	
	public GameParameter(int points, String[] names, boolean doubleIn, boolean doubleOut) {
		this.points = points;
		this.names = names;
		this.doubleIn = doubleIn;
		this.doubleOut = doubleOut;
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
	
}
