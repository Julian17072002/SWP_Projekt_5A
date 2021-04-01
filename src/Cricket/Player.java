package Cricket;

public class Player {
	private final String NAME;

	public static int numberOfTw;
	public static int numberOfNi;
	public static int numberOfEi;
	public static int numberOfSe;
	public static int numberOfSi;
	public static int numberOfFi;
	public static int numberOfBl;

	public Player(String name, int tw, int ni, int ei, int se, int si, int fi, int bl) {
		NAME = name;
		numberOfTw = 0;
		numberOfNi = 0;
		numberOfEi = 0;
		numberOfSe = 0;
		numberOfSi = 0;
		numberOfFi = 0;
		numberOfBl = 0;

	}

	public String getName() {
		// TODO Auto-generated method stub
		return NAME;
	}

	public Object getTw() {
		// TODO Auto-generated method stub
		return numberOfTw;
	}

	public Object getNi() {
		// TODO Auto-generated method stub
		return numberOfNi;
	}

	public Object getEi() {
		// TODO Auto-generated method stub
		return numberOfEi;
	}

	public Object getSe() {
		// TODO Auto-generated method stub
		return numberOfSe;
	}

	public Object getSi() {
		// TODO Auto-generated method stub
		return numberOfSi;
	}

	public Object getFi() {
		// TODO Auto-generated method stub
		return numberOfFi;
	}

	public Object getBl() {
		// TODO Auto-generated method stub
		return numberOfBl;
	}

	public int addTw(int tw) {
		numberOfTw += tw;
		if (numberOfTw >= 3) {
			numberOfTw = 3;
		}
		return numberOfTw;
	}

	public int addNi(int ni) {
		numberOfNi += ni;
		if (numberOfNi >= 3) {
			numberOfNi = 3;
		}
		return numberOfNi;
	}

	public int addEi(int ei) {
		numberOfEi += ei;
		if (numberOfEi >= 3) {
			numberOfEi = 3;
		}
		return numberOfEi;
	}

	public int addSe(int se) {
		numberOfSe += se;
		if (numberOfSe >= 3) {
			numberOfSe = 3;
		}
		return numberOfSe;
	}

	public int addSi(int si) {
		numberOfSi += si;
		if (numberOfSi >= 3) {
			numberOfSi = 3;
		}
		return numberOfSi;
	}

	public int addFi(int fi) {
		numberOfFi += fi;
		if (numberOfFi >= 3) {
			numberOfFi = 3;
		}
		return numberOfFi;
	}

	public int addBl(int bl) {
		numberOfBl += bl;
		if (numberOfBl >= 3) {
			numberOfBl = 3;
		}
		return numberOfBl;
	}

	public int addBe(int be) {
		numberOfBl += be;
		if (numberOfBl >= 3) {
			numberOfBl = 3;
		}
		return numberOfBl;
	}

}
