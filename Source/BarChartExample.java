import org.jfree.ui.RefineryUtilities;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.*;
import org.jfree.data.category.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.*;
import org.jfree.data.*;
import org.jfree.chart.renderer.category.*;
import org.jfree.chart.plot.*;
import java.awt.*;
import java.awt.Dimension;
/**
* A simple demonstration application showing how to create a bar chart.
*/
public class BarChartExample extends ApplicationFrame {
/**
* Creates a new demo instance.
*
* @param title the frame title.
*/
public BarExample1(String title) {
super(title);
DefaultCategoryDataset dataset = new DefaultCategoryDataset();
dataset.addValue(1.0, "Row 1", "Column 1");
dataset.addValue(5.0, "Row 1", "Column 2");
dataset.addValue(3.0, "Row 1", "Column 3");
dataset.addValue(2.0, "Row 2", "Column 1");
dataset.addValue(3.0, "Row 2", "Column 2");
dataset.addValue(2.0, "Row 2", "Column 3");
JFreeChart chart = ChartFactory.createBarChart(
"Bar Chart Demo", // chart title
"Category", // domain axis label
"Value", // range axis label
dataset, // data
PlotOrientation.VERTICAL, // orientation
true, // include legend
true, // tooltips?
false // URLs?
);
ChartPanel chartPanel = new ChartPanel(chart, false);
chartPanel.setPreferredSize(new Dimension(500, 270));
setContentPane(chartPanel);
}
/**
* Starting point for the demonstration application.
*
* @param args ignored.
*/
public static void main(String[] args) {
  BarExample1 demo = new BarExample1("Bar Demo 1");
demo.pack();
RefineryUtilities.centerFrameOnScreen(demo);
demo.setVisible(true);
}
}