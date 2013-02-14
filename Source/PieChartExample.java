import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
public class PieChartExample {
/**
* The starting point for the demo.
*
* @param args ignored.
*/
public static void main(String[] args) {
  // create a dataset...
DefaultPieDataset dataset = new DefaultPieDataset();
dataset.setValue("Bunnies", 43.2);
dataset.setValue("Kitties", 27.9);
dataset.setValue("Mouseys", 79.5);
// create a chart...
JFreeChart chart = ChartFactory.createPieChart(
"Visualisation Example (Pie Chart Version 0.01)",
dataset,
true, // legend?
true, // tooltips?
false // URLs?
);
// create and display a frame...
ChartFrame frame = new ChartFrame("PieChart (0.01)", chart);
frame.pack();
frame.setVisible(true);
}
}