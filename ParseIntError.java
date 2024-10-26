package Coding;
/**
 *
 * @author nadaalharbi
 */
public class ParseIntError {
    
    public static void main(String[] args){
        
        String str = "abcde";
        int Number;
        
    try 
    {
        Number = Integer.parseInt(str);

    }
    
    catch( NumberFormatException e) // catch(Exception e)
    {
    
    System.out.println("Conversion error: "+ e.getMessage());
    }
   
    }

}
