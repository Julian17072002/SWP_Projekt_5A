package dbmodle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBManager {

	public static void main(String[] args) throws Exception {
		getConnection();
	}
	
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/dartdb?serverTimezone=UTC&useSSL=false";
			String username = "root";
			String password = "#1606188941Js";
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url,username,password);
//			System.out.println("Connected");
			return con;
		} catch(Exception e) {System.out.println(e);}
		return null;
	} 
	
	public void speichereNeuenEintrag(Connection con, Score s, average a) throws SQLException{
		String sql = "insert into fivezeroone (score, avg) values (?,?)";
		PreparedStatement stm = null;
		try {
			stm = con.prepareStatement(sql);
			stm.setDouble(1, s.getS());
			stm.setDouble(2, a.getA());
			stm.executeUpdate();
		}
		finally {
			if (stm != null) {
				stm.close();
			}
		}
	}
	
//	public void speichereNeuenEintrag(Connection con, average a) throws SQLException{
//		String sql = "insert into test (average) values (?)";
//		PreparedStatement stm = null;
//		try {
//			stm = con.prepareStatement(sql);
//			stm.setDouble(1, a.getA());
//			stm.executeUpdate();
//			System.out.println("Connecteddd");
//		}
//		finally {
//			if (stm != null) {
//				stm.close();
//			}
//		}
//	}

}
