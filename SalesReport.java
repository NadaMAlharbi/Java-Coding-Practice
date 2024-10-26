package Coding;
/**
 *
 * @author nadaalharbi
 */
import java.io.*;
import java.util.*;
import javax.swing.*;

public class SalesReport2 {
    
     public static void main(String[] args){
         
        String filename = "SalseData.txt";
        int months=0;
        double oneMonth;
        double totalSales=0.0;
        double averageSales;
        
        Scanner inputFile = openFile(filename);
        
        while(inputFile == null)
        {
            
            filename = JOptionPane.showInputDialog( "ERROR: "
                    + filename +" does not exist.\n" +
                    "Enter another file name: "); 
            
            inputFile = openFile(filename);
        }
        
        while(inputFile.hasNext())
        {   
        try
            {
                oneMonth=inputFile.nextDouble();
                totalSales+=oneMonth;
             
                months++;
            }
        catch (InputMismatchException e)
        {
            
            JOptionPane.showMessageDialog(null,
                                          "Non-numeric data found in the file.\n" + 
                                          "The invalid record will be skipped.");
            
            inputFile.nextLine();
        }
       
        }
        
        inputFile.close();
        
        averageSales= totalSales / months;
        
        JOptionPane.showMessageDialog(null,
                                    String.format("Number of months: %d\n" +"Total Sales: $%,.2f\n" +
                                    "Average Sales: $%,.2f",
                                    months, totalSales, averageSales));  
        System.exit(0);
     }
     
    public static Scanner openFile(String filename)
    {
        Scanner scan;
        
        try{
            File file = new File(filename);
            scan = new Scanner (file);
            
        }
        catch(FileNotFoundException e){
            
            scan=null;
        }
        
        return scan;
        
    }
    

}
   

