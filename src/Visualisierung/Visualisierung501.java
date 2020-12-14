//package Visualisierung;
//
//import javafx.application.Application;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.scene.Scene;
//import javafx.scene.chart.BarChart;
//import javafx.scene.chart.CategoryAxis;
//import javafx.scene.chart.NumberAxis;
//import javafx.scene.chart.XYChart;
//import javafx.scene.chart.XYChart.Series;
//import javafx.scene.layout.HBox;
//import javafx.stage.Stage;
//
//public class Visualisierung501 {
//	
//	public void start(Stage primaryStage) {
//		
//		CategoryAxis  xAxis= new CategoryAxis ();
//		xAxis.setLabel("t"); // Beschriftung der x Achse 
//
//		NumberAxis yAxis= new NumberAxis();
//		yAxis.setLabel("Score"); // Beschriftung der y Achse 
//
//		BarChart<String, Number> barChart = new BarChart<String, Number>(xAxis, yAxis);
//        barChart.setTitle("Scores");
//	
//		Daten_auslesen.showAll(String fivezeroone);
//	    for (int spalte = 6; spalte <= 30; spalte = spalte + 3) {
//	    	
////	    	String s = Daten_auslesen.replaceStrangeChars(CSVRead.arr[4][spalte + 1]);
////	    	double stimmenanteil = Double.parseDouble(s); 
////	    	String x = Daten_auslesen.arr[2][spalte];
////	    	XYChart.Data<String, Number> data = new BarChart.Data<>(""+x, stimmenanteil);
////	    	series.getData().add(data);
//	    }
//	    
//		HBox root = new HBox();
//		barChart.getData().add(series);
//		root.getChildren().add(barChart);
//		barChart.setPrefWidth(5);
//		
//		root.widthProperty().addListener(new ChangeListener<Number>() {
//	        @Override
//	        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//	        	barChart.setMinWidth(root.getWidth());
//	        }
//	    });
//		
//		Scene scene = new Scene(root, 700, 600);
//	    
//		primaryStage.setTitle("Scores");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}
//	
//	public static void main(String args[]) {
//		
//	}
//
//
//}
