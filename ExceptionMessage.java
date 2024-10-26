package Coding;

/**
 *
 * @author nadaalharbi
 */
import java.io.*;
import java.util.*;
import javax.swing.*;

public class ExceptionMessage {
    
    public static void main(String[] args){
        
        File file;
        Scanner inputFile;
        String NameFile;
        
        NameFile= JOptionPane.showInputDialog("Enter the name of a file");
        
        try
        {
            file = new File(NameFile);
            inputFile = new Scanner(file);
            JOptionPane.showMessageDialog(null, "The File Was Found");
        }
        catch (FileNotFoundException e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
         JOptionPane.showMessageDialog(null, "Done");
         System.exit(0);
        
    }
    
}
