package Visualisierung;


import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class VisualisierungDoppelquote {

	public static AreaChart<Number, Number> areachart() throws Exception {

		NumberAxis xAxis= new NumberAxis();
		xAxis.setLabel("Doppelquote der jeweiligen Spiele");
		NumberAxis yAxis= new NumberAxis();
		yAxis.setLabel("Prozent [%]");

		AreaChart<Number, Number> areaChart = new AreaChart<Number,Number>(xAxis,yAxis);
		areaChart.setTitle("Werte für die Doppelquote");

		XYChart.Series<Number, Number> data = new XYChart.Series<Number, Number>();
		data.setName("Doppelquote");

		vizualizingMethods.create(data, 2);
		areaChart.setCreateSymbols(false);
		areaChart.getData().add(data);
		return areaChart;
	} 


}
