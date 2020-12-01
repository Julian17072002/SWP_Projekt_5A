package dbmodle;

import Test.Test;

public class Score {
	
	double s = Test.getSum();

	public Score(double s) {
		this.s = s;
	}
	
	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(s);
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
		Score other = (Score) obj;
		if (Double.doubleToLongBits(s) != Double.doubleToLongBits(other.s))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Score [s=" + s + "]";
	}

}
