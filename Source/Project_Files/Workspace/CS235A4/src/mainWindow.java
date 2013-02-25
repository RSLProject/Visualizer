import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Color;

import javax.swing.*;
import javax.swing.border.Border;

public class mainWindow {
	
	private static Toolkit toolkit = Toolkit.getDefaultToolkit();
	private static Dimension screensize = toolkit.getScreenSize();
	
	
	public static void main(String[] args) {
		//1. Create the frame.
		JFrame mainWindow = new JFrame("RSL GUI");
	
		
		//2. Optional: What happens when the frame closes?
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//4. Size the frame.
		mainWindow.setSize(screensize);
		
		
		//creates the menu bar
		
		JMenuBar topMenuBar = new JMenuBar();
		
		//mainWindow.setVisible(true);
		
		
		//adds the file menu to the JMenuBar
		JMenu file = new JMenu("File");
		topMenuBar.add(file);

		//adds items to the file menu
		
		//new
		
		JMenuItem newFile = new JMenuItem("New...");
		file.add(newFile);
		
		//open
		
		JMenuItem openNewFile = new JMenuItem("Open...");
		file.add(openNewFile);
		
		//import
		
		JMenuItem importCSV = new JMenuItem("Import...");
		file.add(importCSV);
		
		//export
		
		JMenuItem export = new JMenuItem("Export...");
		file.add(export);
		
		
		//adds the chart menu to the JMenuBar
		
		JMenu chart = new JMenu("Chart");
		topMenuBar.add(chart);
	
		//adds items to the chart menu
		
		//table
		
		JMenuItem tablechart = new JMenuItem("Table View");
		chart.add(tablechart);
		
		//bar
		
		JMenuItem barchart = new JMenuItem("Bar Chart");
		chart.add(barchart);
			
		//line
		
		JMenuItem linechart = new JMenuItem("Line Chart");
		chart.add(linechart);
		
		//adds the help menu to the JMenuBar
		JMenu help = new JMenu("Help");
		topMenuBar.add(help);
						
		//adds items to the help menu
				
		
		//help button
		
		JMenuItem helpbutton = new JMenuItem("Help");
		help.add(helpbutton);
		
		
		//adds the menubar to the window
		mainWindow.setJMenuBar(topMenuBar);
		
		//add panel for buttons
		
		JPanel buttonPanel = new JPanel();
		mainWindow.add(buttonPanel);
		buttonPanel.setBackground(Color.blue);
		buttonPanel.setSize(1700, 50);
		


		//adding panel for interface/chart
		
		JPanel mainChart = new JPanel();
		
        //mainInterface.setLayout(new BorderLayout(10,10));
       // mainInterface.setBorder(BorderFactory.createEmptyBorder(200,10,10,10)); 
        mainWindow.add(mainChart);
        mainWindow.setVisible(true);
		mainChart.setBackground(Color.white);
		




	}

}