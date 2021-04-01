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

//				if (input.length() == 0 || input.length() > 2 || !isNumber(input)) {
//					return new Result(input, 0,0, false); 
//				}
//				if (factor == 1) {
//					if (points > 20 && points <= 40 && points % 2 == 0 || points == 50) {
//						points /= 2;
//						factor = 2;
//					} else if (points > 20 && points <= 60 && points % 3 == 0) {
//						points /= 3;
//						factor = 3;
//					} else if (points > 20 && points != 25) 
//						return new Result(input, 0, 0, false);
//				}
//		}
		}
		return points * factor;
	}

	private static boolean isNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (!(input.charAt(i) >= '0' && input.charAt(i) <= '9'))
				return false;
		}
		return true;
	}
}
