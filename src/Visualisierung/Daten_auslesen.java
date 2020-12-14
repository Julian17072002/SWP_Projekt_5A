package Visualisierung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Iterator;


public class Daten_auslesen {

	private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    ArrayList<String[]> result = new ArrayList<String[]>();

    private String dbTable = "fivezeroone";
    private String user = "root";
    private String pass = "#1606188941Js";
    
    

    public Daten_auslesen() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Fehler bei MySQL-JDBC-Bridge" + e);
            return;
        }

        readDBData(0);

        printDBData(result);

//        System.out.println("Anzahl Tupel: " + result.size());
    }

    private void readDBData(int i) {

        try {
            
            String url = "jdbc:mysql://localhost:3306/dartdb?serverTimezone=UTC&useSSL=false";
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();

            String sqlQuery = "SELECT * FROM fivezeroone";
            resultSet = statement.executeQuery(sqlQuery);
            int spalten = resultSet.getMetaData().getColumnCount();
//            System.out.println("Anzahl Spalten: " + spalten);

            while (resultSet.next()) {
                String[] str = new String[8];
                for (int k = 1; k <=spalten; k++) {
                    str[k - 1] = resultSet.getString(k);
                }
                result.add(str);
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Fehler bei Tabellenabfrage: " + e);
            return;
        }
    }

    private void printDBData(ArrayList list) {
        for (Iterator iter = list.iterator(); iter.hasNext();) {
            String[] str = (String[]) iter.next();

            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i] + "\t");
            }
            System.out.print(System.getProperty("line.separator"));
        }
    }

    public static void main(String args[]) {
        new Daten_auslesen();
    }

}
