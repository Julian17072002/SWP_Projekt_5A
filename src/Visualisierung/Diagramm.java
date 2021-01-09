package Visualisierung;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.layout.FlowPane;
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
		
		Stage st = new Stage();
		FlowPane flowpane = new FlowPane();

		Scene sce = new Scene(flowpane, 1550, 500);
		areaChart = Visualisierung501.areachart();
		areaChart1 = VisualisierungDoppelquote.areachart();

		
		flowpane.getChildren().addAll(areaChart, areaChart1);

		flowpane.setVgap(500);
		
		st.setTitle("Diagramme");
		st.setScene(sce);
		st.show();  

	}
	public static void main(String[] args) {
		launch(args);
	}
}

