package Visualisierung;

import java.sql.Connection;
import java.util.ArrayList;

import dbmodle.DBManager;
import dbmodle.Score;
import dbmodle.average;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Table extends Application {
	
    @SuppressWarnings({ "unchecked", "static-access" })
	public static TableView<String> start() throws Exception {
    	
    	DBManager db = new DBManager();
    	Connection con = db.getConnection();
      	
    	ArrayList<Score> s = db.leseScore(con);
    	ArrayList<average> a = db.leseAvg(con);
    	
        TableView<String> tView = new TableView<String>();
        
        TableColumn<String, String> score = new TableColumn<String, String>("Score");
        TableColumn<String, String> average = new TableColumn<String, String>("Average");
        
        

        score.setCellValueFactory(
                new Callback<CellDataFeatures<String, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(
                            CellDataFeatures<String, String> p) {
                        return new SimpleStringProperty(p.getValue());
                    }
                });
        
        average.setCellValueFactory(
                new Callback<CellDataFeatures<String, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(
                            CellDataFeatures<String, String> p) {
                        return new SimpleStringProperty(p.getValue());
                    }
                });


       
        
        tView.getColumns().addAll(score, average);
        tView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        

        tView.setItems(createList1(a));
        
        Scene scene = new Scene(tView, 250, 300);
//        primaryStage.setScene(scene);
//        primaryStage.show();
        return tView;
    }


	 private static ObservableList<String> createList1(ArrayList<average> a) {
		 return FXCollections.observableArrayList(AvgToString(a));
	 }

	 
//	public static void setItems(ObservableList<table> data) {
//		final ObservableList<table> data0 = FXCollections.observableArrayList();
//	}


	public static ArrayList<String> ScoreToString(ArrayList<Score> ScoreList) {
        ArrayList<String> StringList = new ArrayList<String>();
        for (int i = 0; i < ScoreList.size(); i++) {
            double tempDouble = ScoreList.get(i).getS();
            String tempString = "" + tempDouble;
            StringList.add(tempString);
        }
        return StringList;
    }
	
	public static ArrayList<String> AvgToString(ArrayList<average> AvgList) {
        ArrayList<String> StringList = new ArrayList<String>();
        for (int i = 0; i < AvgList.size(); i++) {
            double tempDouble = AvgList.get(i).getA();
            String tempString = "" + tempDouble;
            StringList.add(tempString);
        }
        return StringList;
    }


	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
    
	
    public static void main(String[] args) {
        Application.launch(args);
    }
}