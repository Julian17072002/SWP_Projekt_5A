package Cricket;

public class CricketGame {
	private Player[] players;
	private int counter;

	public CricketGame(int numberOfPlayers, int tw, int ni, int ei, int se, int si, int fi, int bl) {
		counter = 0;
		players = new Player[numberOfPlayers];

		for (int p = 0; p < numberOfPlayers; p++) {
			players[p] = new Player("Player " + (p + 1), tw, ni, ei, se, si, fi, bl);
		}
	}

	public String generateScoreboard() {
		StringBuilder sb = new StringBuilder();

		for (Player p : players) {
			sb.append(p.getName() + ": ");
			sb.append(p.getTw() + " 20 |");
			sb.append(p.getNi() + " 19 |");
			sb.append(p.getEi() + " 18 |");
			sb.append(p.getSe() + " 17 |");
			sb.append(p.getSi() + " 16 |");
			sb.append(p.getFi() + " 15 |");
			sb.append(p.getBl() + " BL |");
			sb.append("\n");
		}

		return sb.toString();
	}

	public int addTwForCurrentPlayer(int tw) {
		return players[counter % players.length].addTw(1);

	}

	public int addNiForCurrentPlayer(int ni) {
		return players[counter % players.length].addNi(1);

	}

	public int addEIForCurrentPlayer(int ei) {
		return players[counter % players.length].addEi(1);

	}

	public int addSeForCurrentPlayer(int se) {
		return players[counter % players.length].addSe(1);

	}

	public int addSiForCurrentPlayer(int si) {
		return players[counter % players.length].addSi(1);

	}

	public int addFiForCurrentPlayer(int fi) {
		return players[counter % players.length].addFi(1);

	}

	public int addBlForCurrentPlayer(int bl) {
		return players[counter % players.length].addBl(1);

	}

	public int addBeForCurrentPlayer(int be) {
		return players[counter % players.length].addBe(2);

	}

	public int addTw2ForCurrentPlayer(int tw) {
		return players[counter % players.length].addTw(2);

	}

	public int addNi2ForCurrentPlayer(int ni) {
		return players[counter % players.length].addNi(2);

	}

	public int addEI2ForCurrentPlayer(int ei) {
		return players[counter % players.length].addEi(2);

	}

	public int addSe2ForCurrentPlayer(int se) {
		return players[counter % players.length].addSe(2);

	}

	public int addSi2ForCurrentPlayer(int si) {
		return players[counter % players.length].addSi(2);

	}

	public int addFi2ForCurrentPlayer(int fi) {
		return players[counter % players.length].addFi(2);

	}

	public int addTw3ForCurrentPlayer(int tw) {
		return players[counter % players.length].addTw(3);

	}

	public int addNi3ForCurrentPlayer(int ni) {
		return players[counter % players.length].addNi(3);

	}

	public int addEi3ForCurrentPlayer(int ei) {
		return players[counter % players.length].addEi(3);

	}

	public int addSe3ForCurrentPlayer(int se) {
		return players[counter % players.length].addSe(3);

	}

	public int addSi3ForCurrentPlayer(int si) {
		return players[counter % players.length].addSi(3);

	}

	public int addFi3ForCurrentPlayer(int fi) {
		return players[counter % players.length].addFi(3);

	}

	public void nextPlayer() {
		counter++;
	}

	public String getCurrentPlayerName() {
		return players[counter % players.length].getName();
	}

}
