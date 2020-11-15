package SpielModi;

import SpielModi.Player;

public class PlayerCounter {

	private final int playerCounter;
	private final Player[] players;	
	
	public PlayerCounter(int counter, Player[] players) {
		playerCounter = counter;
		this.players = players;
	}
	
	public int getPlayerCounter() {
		return playerCounter;
	}
	public Player[] getPlayers() {
		return players;
	}
	
	
}
