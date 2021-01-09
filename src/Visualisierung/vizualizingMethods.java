package Visualisierung;

import java.sql.Connection;
import java.util.ArrayList;

import dbmodle.DBManager;
import dbmodle.fivezeroone;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;

public class vizualizingMethods {
	
	public static void create(Series<Number, Number> data, int auswahl) throws Exception {
		if(auswahl == 1) {
			createTheChart(data);
		} if(auswahl == 2) {
			createTheChart1(data);
		} if(auswahl == 3) {
			createTheText(data);
		}
	}
	
	public static void createTheChart(Series<Number, Number> data) throws Exception {
		DBManager db = new DBManager();
		Connection con = db.getConnection();
	    ArrayList <fivezeroone> res =  db.leseAlleWerte(con);
	    
		for (int i = 0; i <= res.size() - 1; i++) {
			data.getData().add(new XYChart.Data<Number, Number>(i, res.get(i).getAvg()));	
		}
	}
	
	public static void createTheChart1(Series<Number, Number> data) throws Exception {
		DBManager db = new DBManager();
		Connection con = db.getConnection();
	    ArrayList <fivezeroone> res =  db.leseAlleWerte(con);
	    
		for (int i = 0; i <= res.size() - 1; i++) {
			if (res.get(i).getDoppelquote() != 0.0) {
				data.getData().add(new XYChart.Data<Number, Number>(i, res.get(i).getDoppelquote()));	
				
			}
		}
	}
	
	public static void createTheText(Series<Number, Number> data) throws Exception {
		DBManager db = new DBManager();
		Connection con = db.getConnection();
		ArrayList <fivezeroone> res =  db.leseAlleWerte(con);
	    
		for (int i = 0; i <= res.size() - 1; i++) {
			if (res.get(i).getScore() <= 180) {
				data.getData().add(new XYChart.Data<Number, Number>(i, res.get(i).getScore()));	
				
			}
		}
	}
	

}
