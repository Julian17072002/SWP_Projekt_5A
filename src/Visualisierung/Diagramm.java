package Visualisierung;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.control.TableView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Diagramm extends Application{
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		init(primaryStage);
	}
	private void init(Stage primaryStage) throws Exception {
		AreaChart<Number, Number> areaChart;
		AreaChart<Number, Number> areaChart1;
        VBox root;
        TableView table;

		
		Stage st = new Stage();
		FlowPane flowpane = new FlowPane();

		Scene sce = new Scene(flowpane, 1600, 500);
		areaChart = Visualisierung501.areachart();
		areaChart1 = VisualisierungDoppelquote.areachart();
		root = AnzahlAusgeben.start();
		table = Table.start();
		
		flowpane.getChildren().addAll(areaChart, areaChart1, root, table);
		flowpane.setVgap(500);
		
		st.setTitle("Visualisierung");
		st.setScene(sce);
		st.show();  

	}
	public static void main(String[] args) {
		launch(args);
	}
}

