package Coding;

/**
 *
 * @author nadaalharbi
 */
import javax.swing.*;
import java.awt.*;

public class GridPanelWindow extends JFrame {
    
      private final int WINDOW_WIDTH =400; 
      private final int WINDOW_HEIGHT =200;
      
public GridPanelWindow()  {
    
      setTitle(" Grid Layout ");

      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      setLayout(new GridLayout(2,3));
      
       
    JButton button1 = new JButton(" Button 1 ");
    JButton button2 = new JButton(" Button 2 ");
    JButton button3 = new JButton(" Button 3 ");
    JButton button4 = new JButton(" Button 4 ");
    JButton button5 = new JButton(" Button 5 ");
    JButton button6 = new JButton(" Button 6 ");
    
    JLabel Label1 = new JLabel(" This is cell 1. ");
    JLabel Label2 = new JLabel(" This is cell 2. ");
    JLabel Label3 = new JLabel(" This is cell 3. ");
    JLabel Label4 = new JLabel(" This is cell 4. ");
    JLabel Label5 = new JLabel(" This is cell 5. ");
    JLabel Label6 = new JLabel(" This is cell 6. ");
    
    JPanel Panel1 = new JPanel();
    JPanel Panel2 = new JPanel();
    JPanel Panel3 = new JPanel();
    JPanel Panel4 = new JPanel();
    JPanel Panel5 = new JPanel();
    JPanel Panel6 = new JPanel();
    
    Panel1.add(Label1);
    Panel2.add(Label2);
    Panel3.add(Label3);
    Panel4.add(Label4);
    Panel5.add(Label5);
    Panel6.add(Label6);
    
    Panel1.add(button1);
    Panel2.add(button2);
    Panel3.add(button3);
    Panel4.add(button4);
    Panel5.add(button5);
    Panel6.add(button6);
    
    add(Panel1);
    add(Panel2);
    add(Panel3);
    add(Panel4);
    add(Panel5);
    add(Panel6);
           
    setVisible(true);
    
  }     

public static void main (String[] args) {
    
     new GridPanelWindow ();
     
   }
}
