package dbmodle;

import Test.Test;

public class Doppelquote {

	double d = Test.getQuote();
	
	
	public Doppelquote(double d) {
		this.d = d;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(d);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doppelquote other = (Doppelquote) obj;
		if (Double.doubleToLongBits(d) != Double.doubleToLongBits(other.d))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doppelquote [d=" + d + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
