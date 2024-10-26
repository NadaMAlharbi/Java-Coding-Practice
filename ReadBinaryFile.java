package Coding;

/**
 *
 * @author nadaalharbi
 */
import java.io.*;
public class ReadBinaryFile {
    
    public static void main (String[] args) throws IOException{
        
        int number;
        boolean endOFfile= false;
        
        FileInputStream fstream = new  FileInputStream("Numbers.dat");
        
        DataInputStream inputfile = new DataInputStream(fstream);
        
        System.out.println("Reading numbers from the file:");
        
        while (!endOFfile){
            
         try
         {
             
             number= inputfile.readInt();
             System.out.print(number + " ");
         }
         
         catch(EOFException e){
             
             endOFfile=true;
         }
       
         
        }
        
        
        System.out.println("\nDone ");
        
        inputfile.close();
   
    }
 
}
