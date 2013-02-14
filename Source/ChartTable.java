import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList; 
import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;

public class ChartTable {
  
  public static void main (String args[]) throws IOException {
    ArrayList<String> headArray = new ArrayList<String>();
    ArrayList<String> stuffArray = new ArrayList<String>();
    File file = new File("coalDisasters_Sheet1.csv");
    Scanner scanner = new Scanner(file);
    scanner.useDelimiter(",");
    String storedNext = scanner.next();
    while (storedNext.isEmpty()) {
      System.out.println("Is doing nufing");
    // Do nothing, waiting for a line with stuff in it
      storedNext = scanner.next();
    }
    String headLine = scanner.nextLine();
    String[] headNamesFinished = headLine.split(",|\\ ");
    DefaultTableModel model = new DefaultTableModel();
    for (int i = 0; i < headNamesFinished.length; i++) {
      final int FIRST_IN_ARRAY = 0;
      if (i == FIRST_IN_ARRAY) {
        headNamesFinished[i] = storedNext;
      }
      model.addColumn(headNamesFinished[i]);
    }
    String storedNextLine;
    while (scanner.hasNextLine()) {
      storedNextLine = scanner.nextLine();
      String[] stuffContents = storedNextLine.split(",|\\ ");
      for (int i = 0; i < stuffContents.length; i++) {
	model.insertRow(i, stuffContents);
      // System.out.println(scanner.next());
      }
    }
   JFrame tableFrame=new JFrame("CSV File Imported");
   JTable table = new JTable(model);
   JTableHeader header = table.getTableHeader();
   // Defining size and layout of the object
   tableFrame.setLayout(new BorderLayout());
   tableFrame.add(table.getTableHeader(), BorderLayout.NORTH);
   tableFrame.add(table);
   tableFrame.setSize(1000,500);
   // After setting the size we now need to make the table and GUI visible (below)
   tableFrame.setVisible(true);
   tableFrame.setDefaultCloseOperation(tableFrame.EXIT_ON_CLOSE);
    
    
    

  }
}
