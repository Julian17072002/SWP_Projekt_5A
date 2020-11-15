package SpielModi;

public class Result {

	private final String input;
	private final int points, factor;
	private final boolean succParsed;
	
	public Result(String input, int points, int factor, boolean succ) {
		this.input = input;
		this.points = points;
		this.factor = factor;
		this.succParsed = succ;
	}
	
	public String getInput() {
		return input;
	}
	public int getPoints() {
		return points;
	}
	public int getFactor() {
		return factor;
	}
	
	public int getActualScore() {
		return points * factor;
	}

	public boolean isSuccParsed() {
		return succParsed;
	}

}
