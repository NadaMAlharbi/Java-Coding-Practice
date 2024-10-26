package Coding;
/**
 *
 * @author nadaalharbi
 */
import java.io.*;
import java.util.*;
import javax.swing.*;

public class openFile {

  public static void main(String[] args) {

    String filename;

    filename = JOptionPane.showInputDialog("Enter the name of a file");

    try {

      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      JOptionPane.showMessageDialog(null, "The file was found");

      while (inputFile.hasNextLine())
        System.out.println(inputFile.nextLine());
    } catch (FileNotFoundException e) {
      JOptionPane.showMessageDialog(null, "The file not found");

    }

    JOptionPane.showMessageDialog(null, "Done");
    System.exit(0);

  }

}
