package Visualisierung;

import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;


public class Visualisierung501 extends Pane {

	public static AreaChart<Number, Number> areachart() throws Exception {

		NumberAxis xAxis= new NumberAxis();
		xAxis.setLabel("Scores der jeweiligen Spiele");
		NumberAxis yAxis= new NumberAxis();
		yAxis.setLabel("Scores");

		AreaChart<Number, Number> areaChart = new AreaChart<Number,Number>(xAxis,yAxis);
		areaChart.setTitle("Werte f�r den Score");

		XYChart.Series<Number, Number> data = new XYChart.Series<Number, Number>();
		data.setName("Scores");

		vizualizingMethods.create(data, 1);
		areaChart.setCreateSymbols(false);
		areaChart.getData().add(data);
		return areaChart;
	} 

}
