package Coding;
/**
 *
 * @author nadaalharbi
 */
import java.io.*;
public class ReadRandomLetters {
    
    public static void main(String[] args) throws IOException {
        
        final int CHAR_SIZE=2;
        long bytNum;
        char ch;
        
        RandomAccessFile randomFile = new RandomAccessFile ("Letters.dat","r");
        
        bytNum = CHAR_SIZE*5;
        randomFile.seek(bytNum);
        ch= randomFile.readChar();
        System.out.println(ch);
        
        bytNum = CHAR_SIZE*10;
        randomFile.seek(bytNum);
        ch= randomFile.readChar();
        System.out.println(ch);
        
        bytNum= CHAR_SIZE*3;
        randomFile.seek(bytNum);
        ch = randomFile.readChar();
        System.out.println(ch);
       
        
        randomFile.close();
    }
    
}
