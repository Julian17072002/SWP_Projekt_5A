package SpielModi;

import java.util.Scanner;

import SpielModi.GameParameter;

public class Parameter {

	public static Scanner sc = new Scanner(System.in);
	
	public GameParameter enterGameParameter() {
		
		System.out.println("Hello Players");
		
		System.out.println();
		System.out.print("Number of Players: ");
		int nop  = Integer.parseInt(sc.nextLine());
		String[] names = new String[nop];
		
		for (int i = 0; i < nop; i++) {
			System.out.println("Enter Name for players " + (i + 1) + ": ");
			names[i] = sc.nextLine();
		}
		
		System.out.print("Enter Amount of Points (501/301) : ");
		int points  = Integer.parseInt(sc.nextLine());
		
		System.out.println("Double In (y/n): ");
		boolean doubleIn = sc.nextLine().toLowerCase().equals("y");
		System.out.println("Double Out (y/n): ");
		boolean doubleOut = sc.nextLine().toLowerCase().equals("y");
		
		System.out.println();
		int legsToPlay = readNumber("Enter Number of Legs you want to play (best of modus): ", "1");
		System.out.println();
		
		return new GameParameter(points, names, doubleIn, doubleOut, legsToPlay);
	}
	
	private int readNumber(String eingabe, String defaultValue) {
		System.out.print(eingabe + " (default = " + defaultValue + "): ");
		System.out.println();
		
		String input = sc.nextLine();
		if (input.isEmpty()) {
			input = defaultValue;
			System.out.println("-> " + input);
		}
		
		return Integer.parseInt(input);
	}

}
