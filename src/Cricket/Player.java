package Cricket;

public class Player {
	private final String NAME;

	public int numberOfTw;
	public int numberOfNi;
	public int numberOfEi;
	public int numberOfSe;
	public int numberOfSi;
	public int numberOfFi;
	public int numberOfBl;

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

	public int getTw() {
		// TODO Auto-generated method stub
		return numberOfTw;
	}

	public int getNi() {
		// TODO Auto-generated method stub
		return numberOfNi;
	}

	public int getEi() {
		// TODO Auto-generated method stub
		return numberOfEi;
	}

	public int getSe() {
		// TODO Auto-generated method stub
		return numberOfSe;
	}

	public int getSi() {
		// TODO Auto-generated method stub
		return numberOfSi;
	}

	public int getFi() {
		// TODO Auto-generated method stub
		return numberOfFi;
	}

	public int getBl() {
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

//	public boolean winner(int numberOfTw, int numberOfNi,int numberOfEi,int numberOfSe,int numberOfSi,int numberOfFi, int numberOfBl) {
//		if (numberOfTw == 3 && numberOfNi == 3 && numberOfEi == 3
//				&& numberOfSe == 3 && numberOfSi == 3 && numberOfFi == 3
//				&& numberOfBl == 3) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}

}
