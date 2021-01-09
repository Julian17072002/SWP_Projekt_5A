package Visualisierung;

import java.sql.Connection;

import dbmodle.DBManager;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class AnzahlAusgeben extends Application {
 
	@Override
    public void start(Stage primaryStage) throws Exception {
 
    	DBManager db = new DBManager();
		Connection con = db.getConnection();
 
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);
        
        int anz100Aufnahmen = DBManager.anz100Aufnahmen(con);
        int anz140Aufnahmen = DBManager.anz140Aufnahmen(con);
        int anz180Aufnahmen = DBManager.anz180Aufnahmen(con);
        
		root.getChildren().add(new Label("100 + Aufnahmen: "+ anz100Aufnahmen));
		root.getChildren().add(new Label("140 + Aufnahmen: "+ anz140Aufnahmen));
		root.getChildren().add(new Label("180   Aufnahmen: "+ anz180Aufnahmen));
 
 
        Scene scene = new Scene(root, 320, 150);
 
        primaryStage.setTitle("Anzahl gewisser Aufnahmen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}
