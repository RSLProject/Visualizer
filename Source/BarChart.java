import org.jfree.chart.*;
import org.jfree.data.category.*;
import org.jfree.chart.renderer.category.*;
import org.jfree.chart.plot.*;
import java.awt.*;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import javax.swing.JPanel;
import javax.swing.*;

public class BarChart {
public static void main(String arg[]){
  DefaultCategoryDataset dataset = new DefaultCategoryDataset();
  dataset.setValue(2, "Header One", "Rahul");
  dataset.setValue(7, "Header One", "Vinod");
  dataset.setValue(6, "Header Two", "Rahul");
  dataset.setValue(4, "Header One", "Deepak");
  dataset.setValue(9, "Header One", "Prashant");
  dataset.setValue(6, "Header One", "Chandan");
	  dataset.setValue(6, "Header Two", "Name");
	  JFreeChart chart = ChartFactory.createBarChart
	  ("BarChart using JFreeChart","Student", "Marks", dataset, 
   PlotOrientation.VERTICAL, false,true, false);
  
    CategoryPlot plot = (CategoryPlot) chart.getPlot();
  BarRenderer renderer = (BarRenderer) plot.getRenderer();
renderer.setSeriesPaint(0, Color.black);
renderer.setDrawBarOutline(false);
  chart.setBackgroundPaint(Color.white);
  chart.getTitle().setPaint(Color.black); 
  CategoryPlot p = chart.getCategoryPlot(); 
  p.setRangeGridlinePaint(Color.white);
  CategoryAxis domainAxis = plot.getDomainAxis();
  domainAxis.setLabelPaint(Color.gray);
  domainAxis.setTickLabelPaint(Color.gray);
  NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
  rangeAxis.setTickLabelPaint(Color.gray);
  rangeAxis.setLabelPaint(Color.gray);
  JFrame frame1 = new JFrame("How can I... ");
  ChartPanel chPanel = new ChartPanel(chart); //creating the chart panel, which extends JPanel
  chPanel.setPreferredSize(new Dimension(200, 200)); //size according to my window
  chPanel.setMouseWheelEnabled(true);
  JPanel jPanel = new JPanel();
      jPanel.add(new JTextField("Hello World"));
      jPanel.add( new JButton("Dis my button"));
      frame1.add(chPanel, BorderLayout.CENTER);
  frame1.add( jPanel , BorderLayout.NORTH );
  Dimension panelD = new Dimension(500,400);  
  Dimension panelD2 = new Dimension(50,40);  
  jPanel.setPreferredSize(panelD2);
  chPanel.setPreferredSize(panelD);
  frame1.pack();
  frame1.setVisible( true );
   /*  jPanel.add(new JCheckBox("checkbox"));
  jPanel.add(chPanel); //add the chart viewer to the JPanel */
  }
}
