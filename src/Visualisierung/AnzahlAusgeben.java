package Visualisierung;

import java.sql.Connection;
import java.sql.SQLException;

import dbmodle.DBManager;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class AnzahlAusgeben extends Application {
	
	public static VBox start() throws Exception {
		DBManager db = new DBManager();
		Connection con = db.getConnection();
 
        VBox root = new VBox();
//        root.setPadding(new Insets(10));
//        root.setSpacing(5);
//        
        int anz100Aufnahmen = DBManager.anz100Aufnahmen(con);
        int anz140Aufnahmen = DBManager.anz140Aufnahmen(con);
        int anz180Aufnahmen = DBManager.anz180Aufnahmen(con);
        
        double avgavg = DBManager.gesamtAvg(con);
        double dd = DBManager.doppelDurchschnitt(con);
        
        float bestGame = DBManager.bestesSpiel(con);
        float worstGame = DBManager.schlechtestesSpiel(con);
        
    	root.getChildren().add(new Label(""));
		root.getChildren().add(new Label(""));
	
		root.getChildren().add(new Label("  Anzahl + 100 Aufnahmen: "+ anz100Aufnahmen));
		root.getChildren().add(new Label("  Anzahl + 140 Aufnahmen: "+ anz140Aufnahmen));
		root.getChildren().add(new Label("  Anzahl  180  Aufnahmen: "+ anz180Aufnahmen));
		
		root.getChildren().add(new Label(""));
		root.getChildren().add(new Label("  Durchschnittswerte: "));
		root.getChildren().add(new Label("  ---------------------- "));
		root.getChildren().add(new Label("  Gesamtdurchschnitt: "+ avgavg));
		root.getChildren().add(new Label("  Durchschnittliche Doppelquote: "+ dd +" %     "));
		
		root.getChildren().add(new Label(""));
		root.getChildren().add(new Label("  Bestes Spiel: "+ bestGame+" Avg."));
		root.getChildren().add(new Label("  benötigte Darts: "+ Math.round((501 / bestGame) * 3)));
		root.getChildren().add(new Label(""));
		root.getChildren().add(new Label("  Schlechtestes Spiel: "+ worstGame+" Avg."));
		root.getChildren().add(new Label("  benötigte Darts: "+ Math.round((501 / worstGame) * 3)));
		return root;
	}
 
    public static void main(String[] args) {
        Application.launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
 
}
