package SpielModi;

public class Board {
	
	public static Result input(String input) {
		int points = 0;
		int factor = 1;
		
		input = input.toLowerCase().trim();
		
		if (input.startsWith("d")) {
			factor = 2;
			input = input.substring(1);
		} else if (input.startsWith("t")) {
			factor = 3;
			input = input.substring(1);
		}
		
		switch (input) {
			case "bl": points = 25; break;
			case "be": points = 25; factor = 2; break;
			case "ms": break;
			case "bo": break;
			case "-": break;
			default: points = Integer.parseInt(input);
			
			if (points > 20 && points % 2 == 0) {
				points /= 2;
				factor = 2;
			}
		}
		
		return new Result(input, points, factor);
	}
	
}
