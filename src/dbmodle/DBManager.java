package dbmodle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class DBManager {

	public static void main(String[] args) throws Exception {
		getConnection();
	}

	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/dartdb?serverTimezone=UTC&useSSL=false";
			String username = "root";
			String password = "#1606188941Js";
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, username, password);
//			System.out.println("Connected");
			return con;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public void speichereNeuenEintrag(Connection con, dt t, Score s, average a, Doppelquote d) throws SQLException {
		String sql = "insert into fivezeroone (dt, score, avg, doppelquote) values (?,?,?,?)";
		PreparedStatement stm = null;
		
		try {
			stm = con.prepareStatement(sql);
			stm.setString(1, t.getDate());
			stm.setDouble(2, s.getS());
			stm.setDouble(3, a.getA());
			stm.setDouble(4, d.getD());
			stm.executeUpdate();
		} finally {
			if (stm != null) {
				stm.close();
			}
		}
	}

	public ArrayList<fivezeroone> leseAlleWerte(Connection con) throws SQLException {
		PreparedStatement stm = null;
		ResultSet rs = null;
		ArrayList<fivezeroone> result = new ArrayList<fivezeroone>();
		try {
			String sql = "select score, avg, doppelquote from fivezeroone";
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();
			while (rs.next()) {
				double score = rs.getDouble(1);
				double avg = rs.getDouble(2);
				double doppelquote = rs.getDouble(3);
				fivezeroone f = new fivezeroone(avg, score, doppelquote);
				result.add(f);
			}
		} finally {
			if (stm != null)
				stm.close();
		}

		return result;

	}

	public static int anz100Aufnahmen(Connection con) throws SQLException {
		int result = 0;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			String sql = "select count(*) from fivezeroone where score between 100 and 139";
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();

			if (rs.next()) {
				int anzahl = rs.getInt(1);
				result = anzahl;
			}
		} finally {
			if (stm != null)
				stm.close();
		}
		return result;
	}
	
	public static int anz140Aufnahmen(Connection con) throws SQLException {
		int result = 0;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			String sql = "select count(*) from fivezeroone where score between 140 and 177";
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();

			if (rs.next()) {
				int anzahl = rs.getInt(1);
				result = anzahl;
			}
		} finally {
			if (stm != null)
				stm.close();
		}
		return result;
	}
	
	public static int anz180Aufnahmen(Connection con) throws SQLException {
		int result = 0;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			String sql = "select count(*) from fivezeroone where score >= 180";
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();

			if (rs.next()) {
				int anzahl = rs.getInt(1);
				result = anzahl;
			}
		} finally {
			if (stm != null)
				stm.close();
		}
		return result;
	}
	
	public static int bestesSpiel(Connection con) throws SQLException {
		int result = 0;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			String sql = " select max(avg), doppelquote from fivezeroone where doppelquote != 0.0";
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();

			if (rs.next()) {
				int anzahl = rs.getInt(1);
				result = anzahl;
			}
		} finally {
			if (stm != null)
				stm.close();
		}
		return result;
	}
	
	public static int schlechtestesSpiel(Connection con) throws SQLException {
		int result = 0;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			String sql = " select min(avg), doppelquote from fivezeroone where doppelquote != 0.0";
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();

			if (rs.next()) {
				int anzahl = rs.getInt(1);
				result = anzahl;
			}
		} finally {
			if (stm != null)
				stm.close();
		}
		return result;
	}
	
	public ArrayList<Score> leseScore(Connection con) throws SQLException {
		PreparedStatement stm = null;
		ResultSet rs = null;
		ArrayList<Score> result = new ArrayList<Score>();
		try {
			String sql = "select score from fivezeroone";
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();
			while (rs.next()) {
				double score = rs.getDouble(1);
				Score s = new Score(score);
				result.add(s);
			}
		} finally {
			if (stm != null)
				stm.close();
		}

		return result;

	}
	
	public ArrayList<average> leseAvg(Connection con) throws SQLException {
		PreparedStatement stm = null;
		ResultSet rs = null;
		ArrayList<average> result = new ArrayList<average>();
		try {
			String sql = "select avg from fivezeroone";
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();
			while (rs.next()) {
				double avg = rs.getDouble(1);
				average a = new average(avg);
				result.add(a);
			}
		} finally {
			if (stm != null)
				stm.close();
		}

		return result;

	}
	
	public static int gesamtAvg(Connection con) throws SQLException {
		int result = 0;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			String sql = "select avg(avg) from fivezeroone";
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();

			if (rs.next()) {
				int anzahl = rs.getInt(1);
				result = anzahl;
			}
		} finally {
			if (stm != null)
				stm.close();
		}
		return result;
	}
	
	public static int doppelDurchschnitt(Connection con) throws SQLException {
		int result = 0;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			String sql = "select avg(doppelquote) from fivezeroone where doppelquote != 0";
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();

			if (rs.next()) {
				int anzahl = rs.getInt(1);
				result = anzahl;
			}
		} finally {
			if (stm != null)
				stm.close();
		}
		return result;
	}


}
