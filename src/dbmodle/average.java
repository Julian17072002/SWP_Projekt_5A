package dbmodle;

import SpielModi.Player;

public class average {

	double a = Player.threeDartAvg();

	public average(double a) {
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "average [a=" + a + ", getA()=" + getA() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(a);
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
		average other = (average) obj;
		if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a))
			return false;
		return true;
	}

	


	
//	public average(double a) {
//		a = Player.threeDartAvg();
//	}
//
//	public double threeDartAvg() {
//		return Player.threeDartAvg();
//	}
}
