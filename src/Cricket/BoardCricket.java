package Cricket;

public class BoardCricket {
	private static int points;
	private static int factor;

	public static int input(String input) {
		points = 0;
		factor = 1;

		input = input.toLowerCase().trim();

		if (input.startsWith("d")) {
			factor = 2;
			input = input.substring(1);
		} else if (input.startsWith("t")) {
			factor = 3;
			input = input.substring(1);
		}

		switch (input) {
		case "bl":
			points = 25;
			break;
		case "be":
			points = 25;
			factor = 2;
			break;
		case "ms":
			break;
		case "bo":
			break;
		case "-":
			break;
		default:
			points = Integer.parseInt(input);

		}
		return points * factor;
	}


}
