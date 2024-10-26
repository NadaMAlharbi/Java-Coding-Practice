package Coding;

/**
 *
 * @author nadaalharbi
 */
import javax.swing.*;

public class TextArea extends JFrame {
    
    private JTextArea textArea;
    
    
  public TextArea(){
        
      setTitle("Text Area ");
        
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      
      textArea = new JTextArea("Defult Text " ,20,30);
      
       textArea.setLineWrap(true);
       
       textArea.setWrapStyleWord(false);
       
      JScrollPane scorolPane = new JScrollPane(textArea);
      
      scorolPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      
      scorolPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      
          
      add(scorolPane);
      
      pack();
      
      setVisible(true);
        
    }
  
   public static void main (String[] args ){
        
        
        new TextArea();
    }
    
    
}
