package dbmodle;

import SpielModi.Player;
import Test.Test;

public class fivezeroone {

	double avg = Player.threeDartAvg();
	double score = Test.getSum();
	double doppelquote = Test.getQuote();

	
	public fivezeroone(double avg, double score, double doppelquote) {
		super();
		this.avg = avg;
		this.score = score;
		this.doppelquote = doppelquote;
	}

	
	public double getAvg() {
		return avg;
	}




	public void setAvg(double avg) {
		this.avg = avg;
	}




	public double getScore() {
		return score;
	}




	public void setScore(double score) {
		this.score = score;
	}




	public double getDoppelquote() {
		return doppelquote;
	}




	public void setDoppelquote(double doppelquote) {
		this.doppelquote = doppelquote;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(doppelquote);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(score);
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
		fivezeroone other = (fivezeroone) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (Double.doubleToLongBits(doppelquote) != Double.doubleToLongBits(other.doppelquote))
			return false;
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "fivezeroone [avg=" + avg + ", score=" + score + ", doppelquote=" + doppelquote + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
