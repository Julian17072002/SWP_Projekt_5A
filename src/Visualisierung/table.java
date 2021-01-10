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

public class table extends Application {
	
    @Override
    public void start(Stage primaryStage) throws Exception {
    	
    	DBManager db = new DBManager();
    	Connection con = db.getConnection();
    	
    	ArrayList<Score> s = db.leseScore(con);
    	ArrayList<average> a = db.leseAvg(con);
    	
    	
        primaryStage.setTitle("Kürzliche Spiele");
        
        TableView<String> tView = new TableView<String>();
        
        TableColumn<String, String> score = new TableColumn<String, String>("Score");
//        TableColumn<String, String> aver = new TableColumn<String, String>("Average");
        
        

        score.setCellValueFactory(
                new Callback<CellDataFeatures<String, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(
                            CellDataFeatures<String, String> p) {
                        return new SimpleStringProperty(p.getValue());
                    }
                });
        
//        aver.setCellValueFactory(
//                new Callback<CellDataFeatures<String, String>, ObservableValue<String>>() {
//                    public ObservableValue<String> call(
//                            CellDataFeatures<String, String> q) {
//                        return new SimpleStringProperty(q.getValue());
//                    }
//                });


        tView.getColumns().add(score);
        tView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        tView.setItems(createList(s, a));
        
        Scene scene = new Scene(tView, 250, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


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

	private ObservableList<String> createList(ArrayList<Score> s, ArrayList<average> a) {
    	 return FXCollections.observableArrayList(ScoreToString(s));
	}
    
//    private ObservableList<String> createList1(ArrayList<average> a) {
//    	return FXCollections.observableArrayList(AvgToString(a));
//	}
    
    public static void main(String[] args) {
        launch(args);
    }
}